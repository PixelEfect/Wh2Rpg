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
import com.dd.rpgcardapp.data.Race
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.databinding.ActivityNewCardProfessionsBinding
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.text.Collator
import java.util.Locale

class NewCardProfessionsActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var selectedProfession: Profession? = null
    private lateinit var binding: ActivityNewCardProfessionsBinding

    private lateinit var professionsTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewCardProfessionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        val raceName = intent.getStringExtra("CHARACTER_RACE") // Nazwa rasy

        if (characterDocId == null || raceName == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci lub rasy", Toast.LENGTH_SHORT).show()
            finish()
        }

        val race = Races.getByName(raceName)

        if (race != null) {
            // Wyświetl dostępne profesje
            val professionNames = race.startingProfessions.map { it.name }.sortedWith(Collator.getInstance(Locale("pl", "PL")))

            professionsTextView = findViewById(R.id.inputProfessionTextView)
            professionsTextView.setOnClickListener {
                // Zamiast PopupWindow używamy AlertDialog
                showAlertDialog(this, "Wybierz profesję", professionNames) { selectedProfessionName ->
                    // Wybór profesji
                    selectedProfession = race.startingProfessions.first { it.name == selectedProfessionName }
                    professionsTextView.text = selectedProfessionName // Ustaw tekst na wybraną profesję
                    selectedProfession?.let { updateProfessionStats(it) }
                }
            }
            loadProfessionFromFirestore(race)

        } else {
            Toast.makeText(this, "Rasa nieznana", Toast.LENGTH_SHORT).show()
        }

        binding.nextButton.setOnClickListener {
            if (selectedProfession == null) {
                Toast.makeText(this, "Musisz wybrać profesję, zanim przejdziesz dalej", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            saveProfessionToFirestore()
        }
        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // Obsługa przycisku "Wstecz"
        binding.backButton.setOnClickListener {
            val intent = Intent(this, NewCardBackstoryActivity::class.java).apply {
                putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
            }
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Sprawdź, czy wybrana profesja jest dostępna
        if (selectedProfession != null) {
            // Zapisz nazwę wybranej profesji w outState
            outState.putString("selectedProfessionName", selectedProfession!!.name)
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        // Przywrócenie nazwy profesji z zapisanej instancji
        val savedProfessionName = savedInstanceState.getString("selectedProfessionName")

        if (savedProfessionName != null) {
            // Przypisanie nazwy profesji do TextView
            professionsTextView.text = savedProfessionName

            // Wyszukaj profesję na podstawie nazwy i ustaw statystyki
            val raceName = intent.getStringExtra("CHARACTER_RACE")
            val race = Races.getByName(raceName)

            if (race != null) {
                selectedProfession = race.startingProfessions.firstOrNull { it.name == savedProfessionName }
                selectedProfession?.let {
                    updateProfessionStats(it)
                }
            }
        }
    }

    // Funkcja do pobrania zapisanej profesji z Firestore
    private fun loadProfessionFromFirestore(race: Race) {
        if (characterDocId == null) return

        val characterRef = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)

        // Pobranie zapisanej profesji
        characterRef.collection("profession").document("owned")
            .get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val professionName = document.getString("professionName")
                    if (professionName != null) {
                        // Profesja została znaleziona, ustawiamy ją
                        val profession = race.startingProfessions.firstOrNull { it.name == professionName }
                        if (profession != null) {
                            selectedProfession = profession
                            professionsTextView.text = professionName
                            updateProfessionStats(profession)
                        }
                    }
                }
            }
            .addOnFailureListener { exception ->
                Toast.makeText(this, "Błąd ładowania profesji: ${exception.message}", Toast.LENGTH_SHORT).show()
            }
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
                    if (simplifiedGroup != null) {
                        simplifiedGroup
                    } else {
                        group.joinToString(separator = " lub ") { ability ->
                            ability.name
                        }
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

            // Łączenie ścieżek wyjściowych i ustawianie w TextView
            val exitPathsText = "Ścieżki wyjściowe: " + professionPaths.exit.joinToString(separator = ", ") { it.name }
            exitPathsTextView.text = exitPathsText.ifEmpty { "Brak ścieżek wyjściowych" }
        } else {
            entryPathsTextView.text = "Brak ścieżek wejściowych"
            exitPathsTextView.text = "Brak ścieżek wyjściowych"
        }
    }

    fun mapAbilityGroupToText(group: List<Ability>): String? {
        return AbilityGroupSimplifier.simplify(group)
    }

    // Funkcja do zapisywania profesji do Firestore (można rozbudować, aby zapisać więcej danych)
    private fun saveProfessionToFirestore() {
        if (characterDocId == null || selectedProfession == null) {
            Toast.makeText(this, "Brak danych do zapisania", Toast.LENGTH_SHORT).show()
            return
        }

        val characterRef = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)

        val professionName = selectedProfession!!.name
        val professionData = hashMapOf(
            "professionName" to professionName
        )
        fun getIntFromTextView(viewId: Int): Int {
            return findViewById<TextView>(viewId).text.toString().toIntOrNull() ?: 0
        }
        // 2. Zapisz atrybuty
        val attributesData = mapOf(
            "WW" to getIntFromTextView(R.id.inputWW),
            "US" to getIntFromTextView(R.id.inputUS),
            "K" to getIntFromTextView(R.id.inputK),
            "Odp" to getIntFromTextView(R.id.inputOdp),
            "Zr" to getIntFromTextView(R.id.inputZr),
            "Int" to getIntFromTextView(R.id.inputInt),
            "Sw" to getIntFromTextView(R.id.inputSW),
            "Ogd" to getIntFromTextView(R.id.inputOgd),
            "A" to getIntFromTextView(R.id.inputA),
            "Zyw" to getIntFromTextView(R.id.inputZyw),
            "Sz" to getIntFromTextView(R.id.inputSz),
            "Mag" to getIntFromTextView(R.id.inputMag)
        )

        val professionPaths = ProfessionPaths.paths[selectedProfession]
        val tasks = mutableListOf<Task<Void>>()
        // Iterowanie po wszystkich ścieżkach wyjściowych
        professionPaths?.exit?.let { exitPaths ->
            val exitPathDataList = exitPaths.map { exitProfession ->
                // Tworzymy mapę dla każdej ścieżki wyjściowej
                hashMapOf(
                    "name" to exitProfession.name
                )
            }

            // Zapisz wszystkie ścieżki wyjściowe w jednym dokumencie "exitpath"
            val exitPathTask = characterRef.collection("profession")
                .document("exitpath") // Dokument o nazwie "exitpath"
                .set(hashMapOf("exitPaths" to exitPathDataList))
                .addOnFailureListener { e ->
                    // Obsługuje błędy zapisu
                    Toast.makeText(this, "Błąd zapisu ścieżek wyjściowych: ${e.message}", Toast.LENGTH_SHORT).show()
                }

            tasks.add(exitPathTask)
        }

        val professionNameTask = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("profession").document("owned")
            .set(professionData)

        tasks.add(professionNameTask)

        val attributesTask = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("attributes").document("progression")
            .set(attributesData)
        tasks.add(attributesTask)

        // Uaktualnienie progressStage na 4
        val progressStageTask = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .update("progressStage", 4)  // Ustawienie progressStage na 4
        tasks.add(progressStageTask)

        Tasks.whenAllSuccess<Void>(*tasks.toTypedArray())
            .addOnSuccessListener {
                // Jeśli wszystkie zapisy zakończyły się sukcesem
                Toast.makeText(
                    this,
                    "Dane zapisane poprawnie",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this, NewCardSkillsAndAbilitiesActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                    putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
                    putExtra("CHARACTER_PROFESSION", professionName)
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                // Jeśli któraś z operacji zakończy się błędem
                Toast.makeText(this, "Błąd zapisu danych postaci: ${e.message}", Toast.LENGTH_SHORT)
                    .show()
            }

    }

}