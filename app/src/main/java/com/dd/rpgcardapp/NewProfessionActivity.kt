package com.dd.rpgcardapp

import android.content.Intent
import android.os.Bundle

import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.AbilityGroupSimplifier
import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.ProfessionPaths
import com.dd.rpgcardapp.data.Professions
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.data.Skill

import com.dd.rpgcardapp.databinding.ActivityMyCardNewProfessionBinding
import com.dd.rpgcardapp.repository.ProfessionChangeType
import com.dd.rpgcardapp.repository.ProfessionRepository
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.android.gms.tasks.Task

import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.util.Locale


class NewProfessionActivity : BaseActivity() {

    private lateinit var professionRepository: ProfessionRepository

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var characterRace: String? = null
    private var characterProfession: String? = null
    private var characterName: String? = null
    private lateinit var binding: ActivityMyCardNewProfessionBinding

    private lateinit var professionButtons: List<TextView>
    private lateinit var professionsTextView: TextView

    private var selectedProfession: Profession? = null

    private var progressionAttributes: Map<String, Int>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCardNewProfessionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        characterRace = intent.getStringExtra("CHARACTER_RACE")
        characterProfession = intent.getStringExtra("CHARACTER_PROFESSION")
        characterName = intent.getStringExtra("CHARACTER_NAME")

        if (characterDocId == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
        }

        binding.nameView.text = "${characterName ?: "Brak imienia"}"
        binding.professionView.text = "${characterProfession ?: "Brak profesji"}"

        professionButtons = listOf(
            binding.slaveProfessionView,
            binding.commonProfessionView,
            binding.exitProfessionView
        )
        setupSelectableButtons(professionButtons)
        checkCommonProfessionEligibility()
        loadAttributesAndCheckExitEligibility()

        binding.nextButton.setOnClickListener {
            saveNewProfessionToFirestore()
        }

        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        binding.backButton.setOnClickListener {
            val intent = Intent(this@NewProfessionActivity,
                MyCardAttributesActivity::class.java)
            intent.putExtra("CHARACTER_DOC_ID", characterDocId)
            intent.putExtra("CHARACTER_RACE", characterRace)
            intent.putExtra("CHARACTER_PROFESSION", characterProfession)
            intent.putExtra("CHARACTER_NAME", characterName)
            startActivity(intent)
        }
        professionRepository = ProfessionRepository(db)
    }

    fun updateProfessionStats(profession: Profession) {
        // Pobranie referencji do odpowiednich TextView
        val wwTextView = findViewById<TextView>(R.id.inputWW)
        val usTextView = findViewById<TextView>(R.id.inputUS)
        val kTextView = findViewById<TextView>(R.id.inputK)
        val odpTextView = findViewById<TextView>(R.id.inputOdp)
        val zrTextView = findViewById<TextView>(R.id.inputZr)
        val intTextView = findViewById<TextView>(R.id.inputInt)
        val swTextView = findViewById<TextView>(R.id.inputSW)
        val ogdTextView = findViewById<TextView>(R.id.inputOgd)
        val aTextView = findViewById<TextView>(R.id.inputA)
        val zywTextView = findViewById<TextView>(R.id.inputZyw)
        val szTextView = findViewById<TextView>(R.id.inputSz)
        val magTextView = findViewById<TextView>(R.id.inputMag)

        val abilitiesTextView = findViewById<TextView>(R.id.inputAbilities)
        val skillsTextView = findViewById<TextView>(R.id.inputSkills)
        val entryPathsTextView = findViewById<TextView>(R.id.inputEntryPaths)
        val exitPathsTextView = findViewById<TextView>(R.id.inputExitPaths)

        // Ustawianie wartości statystyk w TextView
        wwTextView.text = profession.ww.toString()
        usTextView.text = profession.us.toString()
        kTextView.text = profession.k.toString()
        odpTextView.text = profession.odp.toString()
        zrTextView.text = profession.zr.toString()
        intTextView.text = profession.int.toString()
        swTextView.text = profession.sw.toString()
        ogdTextView.text = profession.ogd.toString()
        aTextView.text = profession.a.toString()
        zywTextView.text = profession.zyw.toString()
        szTextView.text = profession.sz.toString()
        magTextView.text = profession.mag.toString()

        // Zastosowanie mapowania grup umiejętności
        val simplifiedAbilities = profession.abilities.mapNotNull { ability ->
            mapAbilityGroupToText(listOf(ability))
        }

        val fullAbilitiesText = buildString {
            append("Umiejętności: ")
            append(profession.abilities.joinToString(separator = ", ") { it.name })

            if (profession.optionalAbility.isNotEmpty()) {
                appendLine()
                append("Do wyboru: ")
                append(profession.optionalAbility.joinToString(separator = ", ") { group ->
                    val simplifiedGroup = AbilityGroupSimplifier.simplify(group)
                    simplifiedGroup
                        ?: group.joinToString(separator = " lub ") { ability ->
                            ability.name
                        }
                })
            }
        }

        abilitiesTextView.text = fullAbilitiesText.ifEmpty { "Brak umiejętności" }

        // Wyświetlanie umiejętności
        val fullSkillsText = buildString {
            append("Zdolności: ")
            append(profession.skills.joinToString(separator = ", ") { it.name })

            if (profession.optionalSkills.isNotEmpty()) {
                appendLine()
                append("Do wyboru: ")
                append(profession.optionalSkills.joinToString(separator = ", ") { group ->
                    group.joinToString(separator = " lub ") { it.name }
                })
            }
        }
        skillsTextView.text = fullSkillsText.ifEmpty { "Brak zdolności" }

        val professionPaths = ProfessionPaths.paths[profession]

        // Jeśli istnieją ścieżki dla tej profesji
        if (professionPaths != null) {
            // Łączenie ścieżek wejściowych i ustawianie w TextView
            val entryPathsText = "Ścieżki wejściowe: " + professionPaths.entry.joinToString(separator = ", ") { it.name }
            entryPathsTextView.text = entryPathsText.ifEmpty { "Brak ścieżek wejściowych" }

            if (profession.name == "Niewolnik" && characterRace != "Skaven" && !characterProfession.isNullOrBlank()) {
                exitPathsTextView.text = "Ścieżki wyjściowe: $characterProfession"
            } else {
                val exitPathsText = "Ścieżki wyjściowe: " + professionPaths.exit.joinToString(separator = ", ") { it.name }
                exitPathsTextView.text = exitPathsText.ifEmpty { "Brak ścieżek wyjściowych" }
            }
        } else {
            entryPathsTextView.text = "Brak ścieżek wejściowych"
            exitPathsTextView.text = "Brak ścieżek wyjściowych"
        }
    }

    fun mapAbilityGroupToText(group: List<Ability>): String? {
        return AbilityGroupSimplifier.simplify(group)
    }

    private fun checkCommonProfessionEligibility() {
        val ownedPDText = binding.ownedPD.text.toString()
        val ownedPD = ownedPDText.toIntOrNull() ?: 0
        val isEligible = ownedPD >= 200

        binding.commonProfessionView.isEnabled = isEligible
        binding.commonProfessionView.alpha = if (isEligible) 1.0f else 0.5f
    }

    private fun loadAttributesAndCheckExitEligibility() {
        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId!!)

        val attributesRef = characterRef.collection("attributes")
        val obtainedTask = attributesRef.document("obtained").get()
        val progressionTask = attributesRef.document("progression").get()
        val characterDocTask = characterRef.get()

        Tasks.whenAllSuccess<Any>(obtainedTask, progressionTask, characterDocTask)
            .addOnSuccessListener { results ->
                val obtainedDoc = results[0] as DocumentSnapshot
                val progressionDoc = results[1] as DocumentSnapshot
                val characterDoc = results[2] as DocumentSnapshot

                val keys = listOf("A", "Int", "K", "Mag", "Odp", "Ogd", "PO", "PP", "SW", "Sz", "US", "WW", "Zr", "Zyw", "S", "Wt")

                val progressionMap = mutableMapOf<String, Int>()
                for (key in keys) {
                    val value = progressionDoc.getLong(key)?.toInt() ?: 0
                    progressionMap[key] = value
                }
                progressionAttributes = progressionMap

                var attributesOK = true
                for (key in keys) {
                    val obtained = obtainedDoc.getLong(key)?.toInt() ?: 0
                    val progression = progressionDoc.getLong(key)?.toInt() ?: 0
                    if (obtained < progression) {
                        attributesOK = false
                        break
                    }
                }

                val ownedPDStr = characterDoc.get("ownedPD") as? String ?: "0"
                val ownedPD = ownedPDStr.toIntOrNull() ?: 0
                val spendPD = (characterDoc.get("spendPD") as? Number)?.toInt() ?: 1

                binding.ownedPD.text = ownedPD.toString()
                binding.spendPD.text = spendPD.toString()

                val ownedPD_OK_forExit = ownedPD > 100
                val ownedPD_OK_forCommon = ownedPD >= 200

                checkProfessionRequirementsDocs { requirementsOK ->
                    val exitEligible = attributesOK && ownedPD_OK_forExit && requirementsOK
                    val commonEligible = ownedPD_OK_forCommon

                    updateButtonState(binding.exitProfessionView, exitEligible)
                    updateButtonState(binding.commonProfessionView, commonEligible)
                }
            }.addOnFailureListener { e ->
                Toast.makeText(this, "Błąd pobierania danych: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    private fun checkProfessionRequirementsDocs(callback: (Boolean) -> Unit) {
        val paths = listOf(
            "abilities/MustHave",
            "abilities/AbilitiesGroups",
            "skills/MustHave",
            "skills/SkillsGroups"
        )

        val tasks = paths.map { path ->
            db.collection("users")
                .document(userId)
                .collection("characters")
                .document(characterDocId!!)
                .collection(path.substringBefore("/"))
                .document(path.substringAfter("/"))
                .get()
        }

        Tasks.whenAllSuccess<DocumentSnapshot>(tasks).addOnSuccessListener { docs ->
            val allEmpty = docs.all { doc ->
                if (!doc.exists()) {
                    true // Dokument nie istnieje = pusty
                } else {
                    val data = doc.data
                    if (data.isNullOrEmpty()) {
                        true // Dokument istnieje ale jest pusty
                    } else {
                        // Sprawdź czy wszystkie pola w dokumencie są puste
                        data.all { (key, value) ->
                            when (value) {
                                is List<*> -> value.isEmpty() // Pusta lista
                                is Map<*, *> -> value.isEmpty() // Pusta mapa
                                is String -> value.isBlank() // Pusty string
                                null -> true // Wartość null
                                else -> false // Inne wartości = nie pusty
                            }
                        }
                    }
                }
            }
            callback(allEmpty)
        }.addOnFailureListener {
            callback(false)
        }
    }

    private fun updateButtonState(button: TextView, isEnabled: Boolean) {
        button.isEnabled = isEnabled
        button.alpha = if (isEnabled) 1.0f else 0.5f
    }

    private fun setupSelectableButtons(buttons: List<TextView>) {
        buttons.forEach { it.isSelected = false }

        buttons.forEach { button ->
            button.setOnClickListener {
                buttons.forEach { it.isSelected = false }
                button.isSelected = true

                if (button == binding.slaveProfessionView) {
                    val professionName = "Niewolnik"
                    val profession = Professions.professionMap[professionName]

                    if (profession != null) {
                        selectedProfession = profession
                        binding.inputProfessionTextView.text = professionName
                        updateProfessionStats(profession)
                    } else {
                        Toast.makeText(this, "Nie znaleziono profesji: $professionName", Toast.LENGTH_SHORT).show()
                    }

                    professionsTextView = findViewById(R.id.inputProfessionTextView)
                    professionsTextView.setOnClickListener {
                        val onlySlave = listOf("Niewolnik")

                        showAlertDialog(this, "Wybierz profesję", onlySlave) { selectedProfessionName ->
                            val selected = Professions.professionMap[selectedProfessionName]
                            if (selected != null) {
                                selectedProfession = selected
                                professionsTextView.text = selected.name
                                updateProfessionStats(selected)
                            }
                        }
                    }
                }

                if (button == binding.commonProfessionView) {
                    val race = Races.getByName(characterRace)
                    val excludedProfession = intent.getStringExtra("CHARACTER_PROFESSION")

                    if (race != null) {
                        val availableProfessions = race.startingProfessions
                            .filter { it.name != excludedProfession }
                            .sortedBy { it.name.lowercase(Locale("pl", "PL")) }

                        if (availableProfessions.isNotEmpty()) {
                            val defaultProfession = availableProfessions.first()
                            selectedProfession = defaultProfession
                            binding.inputProfessionTextView.text = defaultProfession.name
                            updateProfessionStats(defaultProfession)
                        }

                        professionsTextView = findViewById(R.id.inputProfessionTextView)
                        professionsTextView.setOnClickListener {
                            val professionNames = availableProfessions.map { it.name }

                            showAlertDialog(this, "Wybierz profesję", professionNames) { selectedProfessionName ->
                                selectedProfession = race.startingProfessions.first { it.name == selectedProfessionName }
                                professionsTextView.text = selectedProfessionName
                                selectedProfession?.let { updateProfessionStats(it) }
                            }
                        }

                    } else {
                        Toast.makeText(this, "Rasa nieznana", Toast.LENGTH_SHORT).show()
                    }
                }

                if (button == binding.exitProfessionView) {
                    binding.inputProfessionTextView.text = ""
                    selectedProfession = null

                    val exitPathsRef = db.collection("users").document(userId)
                        .collection("characters").document(characterDocId!!)
                        .collection("profession").document("exitpath")

                    exitPathsRef.get().addOnSuccessListener { document ->
                        if (document != null && document.exists()) {
                            val exitList = document.get("exitPaths") as? List<Map<String, String>>
                            val professionNames = exitList?.mapNotNull { it["name"] } ?: emptyList()

                            if (professionNames.isNotEmpty()) {
                                val defaultProfessionName = professionNames.first()
                                val defaultProfession = Professions.professionMap[defaultProfessionName]

                                if (defaultProfession != null) {
                                    selectedProfession = defaultProfession
                                    binding.inputProfessionTextView.text = defaultProfession.name
                                    updateProfessionStats(defaultProfession)
                                }

                                professionsTextView = findViewById(R.id.inputProfessionTextView)
                                professionsTextView.setOnClickListener {
                                    showAlertDialog(this, "Wybierz profesję", professionNames) { selectedProfessionName ->
                                        val selected = Professions.professionMap[selectedProfessionName]
                                        if (selected != null) {
                                            selectedProfession = selected
                                            professionsTextView.text = selected.name
                                            updateProfessionStats(selected)
                                        }
                                    }
                                }
                            } else {
                                Toast.makeText(this, "Brak dostępnych ścieżek wyjścia", Toast.LENGTH_SHORT).show()
                            }
                        } else {
                            Toast.makeText(this, "Nie znaleziono ścieżki wyjścia", Toast.LENGTH_SHORT).show()
                        }
                    }.addOnFailureListener {
                        Toast.makeText(this, "Błąd przy pobieraniu ścieżki wyjścia", Toast.LENGTH_SHORT).show()
                    }
                }

                Toast.makeText(this, "Wybrano: ${button.text}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun saveNewProfessionToFirestore() {
        if (characterDocId == null || selectedProfession == null) {
            Toast.makeText(this, "Brak danych do zapisania", Toast.LENGTH_SHORT).show()
            return
        }

        val characterRef = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)

        val attributesData = mapOf(
            "WW" to getMaxAttrFromInput(binding.inputWW, "WW"),
            "US" to getMaxAttrFromInput(binding.inputUS, "US"),
            "K" to getMaxAttrFromInput(binding.inputK, "K"),
            "Odp" to getMaxAttrFromInput(binding.inputOdp, "Odp"),
            "Zr" to getMaxAttrFromInput(binding.inputZr, "Zr"),
            "Int" to getMaxAttrFromInput(binding.inputInt, "Int"),
            "SW" to getMaxAttrFromInput(binding.inputSW, "SW"),
            "Ogd" to getMaxAttrFromInput(binding.inputOgd, "Ogd"),
            "A" to getMaxAttrFromInput(binding.inputA, "A"),
            "Zyw" to getMaxAttrFromInput(binding.inputZyw, "Zyw"),
            "Sz" to getMaxAttrFromInput(binding.inputSz, "Sz"),
            "Mag" to getMaxAttrFromInput(binding.inputMag, "Mag")
        )

        // Określ typ zmiany profesji na podstawie wybranego przycisku
        val changeType = when {
            binding.slaveProfessionView.isSelected -> ProfessionChangeType.SLAVE
            binding.commonProfessionView.isSelected -> ProfessionChangeType.COMMON
            binding.exitProfessionView.isSelected -> ProfessionChangeType.EXIT
            else -> {
                Toast.makeText(this, "Nie wybrano typu zmiany profesji", Toast.LENGTH_SHORT).show()
                return
            }
        }

        professionRepository.saveNewProfession(
            characterRef = characterRef,
            profession = selectedProfession!!,
            attributesData = attributesData,
            professionChangeType = changeType, // Dodaj nowy parametr
            onSuccess = {
                Toast.makeText(this, "Dane zapisane poprawnie", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MyCardAttributesActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)
                    putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
                    putExtra("CHARACTER_PROFESSION", selectedProfession!!.name)
                    putExtra("CHARACTER_NAME", characterName)
                }
                startActivity(intent)
                finish()
            },
            onFailure = { e ->
                Toast.makeText(this, "Błąd zapisu danych postaci: ${e.message}", Toast.LENGTH_SHORT).show()
            }
        )
    }

    private fun getMaxAttrFromInput(input: TextView, key: String): Int {
        val inputValue = input.text.toString().toIntOrNull() ?: 0
        val progressValue = progressionAttributes?.get(key) ?: 0
        return maxOf(inputValue, progressValue)
    }
}