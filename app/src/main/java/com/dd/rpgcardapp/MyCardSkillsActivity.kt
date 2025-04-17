package com.dd.rpgcardapp

import BaseActivity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.MyCardBackstoryActivity
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.CommonAbilities
import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.Professions
import com.dd.rpgcardapp.data.RareAbilities
import com.dd.rpgcardapp.data.Skill
import com.dd.rpgcardapp.data.SpecialAbilities
import com.dd.rpgcardapp.data.StatsSkills
import com.dd.rpgcardapp.data.abilityCategoryMap
import com.dd.rpgcardapp.data.getAbilityCategory
import com.dd.rpgcardapp.data.getSkillCategory
import com.dd.rpgcardapp.data.skillCategoryMap
import com.dd.rpgcardapp.databinding.ActivityMyCardBackstoryBinding
import com.dd.rpgcardapp.databinding.ActivityMyCardSkillsBinding
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.dd.rpgcardapp.databinding.ActivityNewCardSkillsAndAbilitiesBinding
import com.dd.rpgcardapp.utils.dp
import com.dd.rpgcardapp.utils.showAlertDialogWithTiles
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldValue
import kotlin.math.ceil
import kotlin.reflect.KProperty1


class MyCardSkillsActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var characterRace: String? = null
    private var characterProfession: String? = null
    private var characterName: String? = null
    private lateinit var binding: ActivityMyCardSkillsBinding
    private val abilitiesNames = mutableListOf<String>()
    private val skillsNames = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCardSkillsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        characterRace = intent.getStringExtra("CHARACTER_RACE")
        characterProfession = intent.getStringExtra("CHARACTER_PROFESSION")
        characterName = intent.getStringExtra("CHARACTER_NAME")

        binding.nameView.text = "${characterName ?: "Brak imienia"}"

        fetchCharacterAttributes(characterDocId!!)
        fetchCharacterSkills(characterDocId!!)

        loadPDAndSkillsAbilities()

        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // Obsługa przycisku "Wstecz"
        binding.backButton.setOnClickListener {
            val intent = Intent(this@MyCardSkillsActivity,
                MyCardAttributesActivity::class.java)
            intent.putExtra("CHARACTER_DOC_ID", characterDocId)  // Ustaw odpowiedni klucz
            intent.putExtra("CHARACTER_RACE", characterRace)
            intent.putExtra("CHARACTER_PROFESSION", characterProfession)
            intent.putExtra("CHARACTER_NAME", characterName)
            startActivity(intent)
        }

        binding.abilitiesTextView.setOnClickListener {
            if (abilitiesNames.isNotEmpty()) {
                showAlertDialog(
                    context = this,
                    title = "Wybierz zdolność",
                    items = abilitiesNames
                ) { selectedAbility ->
                    showAlertDialogWithTiles(
                        context = this,
                        title = "Czy chcesz zakupić: $selectedAbility?",
                        items = listOf("Tak", "Nie")
                    ) { choice ->
                        if (choice == "Tak") {
                            handleSkillPurchase(isAbility = true, itemName = selectedAbility)
                        }
                    }
                }
            }
        }

        binding.skillTextView.setOnClickListener {
            if (skillsNames.isNotEmpty()) {
                showAlertDialog(
                    context = this,
                    title = "Wybierz umiejętność",
                    items = skillsNames
                ) { selectedSkill ->
                    showAlertDialogWithTiles(
                        context = this,
                        title = "Czy chcesz zakupić: $selectedSkill?",
                        items = listOf("Tak", "Nie")
                    ) { choice ->
                        if (choice == "Tak") {
                            handleSkillPurchase(isAbility = false, itemName = selectedSkill)
                        }
                    }
                }
            }
        }
    }

    private fun completeSkillPurchase(isAbility: Boolean, itemName: String) {
        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId!!)

        val collectionName = if (isAbility) "abilities" else "skills"

        // Krok 1: Pobierz dokument "optional"
        characterRef.collection(collectionName)
            .document("Optional")
            .get()
            .addOnSuccessListener { document ->
                val allList = (document["all"] as? List<Map<String, Any>>)?.toMutableList() ?: mutableListOf()

                // Znajdź obiekt, który odpowiada wybranej nazwie
                val selectedMap = allList.find { it["name"] == itemName }
                if (selectedMap == null) {
                    Toast.makeText(this, "Nie znaleziono obiektu w optional.", Toast.LENGTH_SHORT).show()
                    return@addOnSuccessListener
                }

                // Usuń z optional
                allList.remove(selectedMap)

                // Zaktualizuj dokument "optional"
                characterRef.collection(collectionName)
                    .document("Optional")
                    .update("all", allList)
                    .addOnSuccessListener {
                        // Teraz dodaj do odpowiedniego dokumentu kategorii
                        // Znajdź kategorię
                        val categoryName = if (isAbility) {
                            val ability = Ability(itemName, selectedMap["attribute"] as? String ?: "Int")
                            getAbilityCategory(ability)
                        } else {
                            val skill = Skill(itemName, selectedMap["description"] as? String ?: "")
                            getSkillCategory(skill)
                        }

                        // Dokument np. "common"
                        val categoryDocRef = characterRef.collection(collectionName)
                            .document(categoryName)

                        // Dokument kategorii w kolekcji "skills" lub "abilities"
                        categoryDocRef.update(
                            "owned", FieldValue.arrayUnion(selectedMap)
                        )
                            .addOnSuccessListener {

                                val rareAbilitiesColumn = findViewById<LinearLayout>(R.id.rareAbilitiesColumn)
                                rareAbilitiesColumn.removeAllViews()
                                val specialAbilitiesColumn = findViewById<LinearLayout>(R.id.specialAbilitiesColumn)
                                specialAbilitiesColumn.removeAllViews()
                                fetchCharacterAttributes(characterDocId!!)
                                val skillColumn = findViewById<LinearLayout>(R.id.skillsMainContainer)
                                skillColumn.removeAllViews()
                                fetchCharacterSkills(characterDocId!!)
                                // Ponownie załaduj PD
                                loadPDAndSkillsAbilities()

                                Toast.makeText(this, "Dodano do $categoryName!", Toast.LENGTH_SHORT).show()
                            }
                            .addOnFailureListener {
                                Toast.makeText(this, "Błąd przy zapisie do $categoryName", Toast.LENGTH_SHORT).show()
                            }
                    }
            }
            .addOnFailureListener {
                Toast.makeText(this, "Błąd przy pobieraniu optional: ${it.message}", Toast.LENGTH_SHORT).show()
            }
    }



    private fun handleSkillPurchase(isAbility: Boolean, itemName: String) {
        val currentOwnedPD = binding.ownedPD.text.toString().toIntOrNull() ?: 0
        val currentSpendPD = binding.spendPD.text.toString().toIntOrNull() ?: 0

        if (currentOwnedPD < 100) {
            Toast.makeText(this, "Za mało PD!", Toast.LENGTH_SHORT).show()
            return
        }

        val newOwnedPD = currentOwnedPD - 100
        val newSpendPD = currentSpendPD + 100

        // Zaktualizuj lokalnie UI
        binding.ownedPD.setText(newOwnedPD.toString())
        binding.spendPD.setText(newSpendPD.toString())

        // Zapisz zmiany do bazy
        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId!!)

        characterRef.update(
            mapOf(
                "ownedPD" to newOwnedPD.toString(),
                "spendPD" to newSpendPD
            )
        ).addOnSuccessListener {
            Toast.makeText(this, "${if (isAbility) "Zdolność" else "Umiejętność"} \"$itemName\" zakupiona!", Toast.LENGTH_SHORT).show()
        }.addOnFailureListener {
            Toast.makeText(this, "Błąd zapisu PD!", Toast.LENGTH_SHORT).show()
        }

        completeSkillPurchase(isAbility, itemName)
    }


    private fun fetchCharacterAttributes(characterDocId: String) {
        // Pobieranie danych z dokumentów "base", "obtained", "progression"
        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId)

        val attributesRef = characterRef.collection("attributes")
        val abilitiesCommonRef = characterRef.collection("abilities").document("Common")
        val abilitiesRareRef = characterRef.collection("abilities").document("Rare")
        val abilitiesSpecialRef = characterRef.collection("abilities").document("Special")

        // Zadania Firestore
        val baseDocTask = attributesRef.document("base").get()
        val obtainedDocTask = attributesRef.document("obtained").get()
        val abilitiesCommonTask = abilitiesCommonRef.get()
        val abilitiesRareTask = abilitiesRareRef.get()
        val abilitiesSpecialTask = abilitiesSpecialRef.get()

        // Oczekiwanie na wszystkie trzy dokumenty
        Tasks.whenAllSuccess<DocumentSnapshot>(baseDocTask, obtainedDocTask, abilitiesCommonTask, abilitiesRareTask, abilitiesSpecialTask )
            .addOnSuccessListener { documents ->
                val baseDoc = documents[0]
                val obtainedDoc = documents[1]
                val abilitiesCommonDoc = documents[2]
                val abilitiesRareDoc = documents[3]
                val abilitiesSpecialDoc = documents[4]

                val totalAttributes = listOf("Int", "K", "Odp", "Ogd", "SW", "Zr").associateWith { attr ->
                    val base = baseDoc.getLong(attr)?.toInt() ?: 0
                    val obtained = obtainedDoc.getLong(attr)?.toInt() ?: 0
                    base + obtained
                }

                val ownedCommonAbilities = (abilitiesCommonDoc.get("owned") as? List<Map<String, Any>>)
                    ?.mapNotNull { it["name"] as? String } ?: emptyList()
                val commonCounts = ownedCommonAbilities.groupingBy { it }.eachCount()

                for (i in 1..20) {
                    val nameView = findViewById<TextView>(resources.getIdentifier("nameA$i", "id", packageName))
                    val inputView = findViewById<EditText>(resources.getIdentifier("inputA$i", "id", packageName))
                    val progressBar = findViewById<VerticalProgressView>(
                        resources.getIdentifier("a${i}ProgressBar", "id", packageName)
                    )
                    val ability = getAbilityByName(nameView.text.toString())
                    if (ability != null) {
                        val attrValue = totalAttributes[ability.attribute] ?: 0
                        val count = commonCounts[ability.name] ?: 0

                        val finalValue = when (count) {
                            0 -> ceil(attrValue / 2.0).toInt()
                            1 -> attrValue
                            2 -> attrValue + 10
                            else -> attrValue + 20
                        }
                        inputView.setText(finalValue.toString())
                        progressBar?.currentPoints = count.coerceIn(0, 3)
                    } else {
                        inputView.setText("0")
                        progressBar?.currentPoints = 0
                    }
                }

                // === RARE ABILITIES ===
                val ownedRareAbilities = (abilitiesRareDoc.get("owned") as? List<Map<String, Any>>)
                    ?.mapNotNull { it["name"] as? String } ?: emptyList()
                val rareCounts = ownedRareAbilities.groupingBy { it }.eachCount()

                val rareAbilitiesMap = RareAbilities::class.members
                    .filterIsInstance<KProperty1<RareAbilities, Ability>>()
                    .map { it.get(RareAbilities) }
                    .associateBy { it.name }

                val columnB = findViewById<LinearLayout>(R.id.rareAbilitiesColumn)
                var index = 1

                rareCounts.forEach { (abilityName, count) ->
                    val ability = rareAbilitiesMap[abilityName]
                    if (ability != null) {
                        val attribute = ability.attribute
                        val attrValue = totalAttributes[attribute] ?: 0
                        val finalValue = when (count) {
                            0 -> ceil(attrValue / 2.0).toInt()
                            1 -> attrValue
                            2 -> attrValue + 10
                            else -> attrValue + 20
                        }

                        val newRow = layoutInflater.inflate(R.layout.ability_row_template, columnB, false)

                        val inputView = newRow.findViewById<EditText>(R.id.dynamicInput)
                        val progressBar = newRow.findViewById<VerticalProgressView>(R.id.dynamicProgress)
                        val nameView = newRow.findViewById<TextView>(R.id.dynamicName)

                        inputView.id = View.generateViewId()
                        inputView.setText(finalValue.toString())

                        nameView.id = View.generateViewId()
                        nameView.text = ability.name

                        progressBar.id = View.generateViewId()
                        progressBar?.currentPoints = count.coerceIn(0, 3) // Zakładam, że masz metodę setProgress(kropki)

                        columnB.addView(newRow)
                        index++
                    }
                }
                // === SPECIAL ABILITIES ===
                val ownedSpecialAbilities = (abilitiesSpecialDoc.get("owned") as? List<Map<String, Any>>)
                    ?.mapNotNull { it["name"] as? String } ?: emptyList()
                val specialCounts = ownedSpecialAbilities.groupingBy { it }.eachCount()

                val specialAbilitiesMap = SpecialAbilities::class.members
                    .filterIsInstance<KProperty1<SpecialAbilities, Ability>>()
                    .map { it.get(SpecialAbilities) }
                    .associateBy { it.name }

                val columnC = findViewById<LinearLayout>(R.id.specialAbilitiesColumn)
                var indexS = 1

                specialCounts.forEach { (abilityName, count) ->
                    val ability = specialAbilitiesMap[abilityName]
                    if (ability != null) {
                        val attribute = ability.attribute
                        val attrValue = totalAttributes[attribute] ?: 0
                        val finalValue = when (count) {
                            0 -> ceil(attrValue / 2.0).toInt()
                            1 -> attrValue
                            2 -> attrValue + 10
                            else -> attrValue + 20
                        }

                        val newRow = layoutInflater.inflate(R.layout.ability_row_template, columnC, false)

                        val inputView = newRow.findViewById<EditText>(R.id.dynamicInput)
                        val progressBar = newRow.findViewById<VerticalProgressView>(R.id.dynamicProgress)
                        val nameView = newRow.findViewById<TextView>(R.id.dynamicName)

                        inputView.id = View.generateViewId()
                        inputView.setText(finalValue.toString())

                        nameView.id = View.generateViewId()
                        nameView.text = ability.name

                        progressBar.id = View.generateViewId()
                        progressBar?.currentPoints = count.coerceIn(0, 3) // Zakładam, że masz metodę setProgress(kropki)

                        columnC.addView(newRow)
                        indexS++
                    }
                }
            }.addOnFailureListener {
                Toast.makeText(this, "Błąd pobierania danych", Toast.LENGTH_SHORT).show()
            }
    }
    fun getAbilityByName(name: String): Ability? {
        val allAbilities = listOf(
            CommonAbilities.charakteryzacja,
            CommonAbilities.dowodzenie,
            CommonAbilities.hazard,
            CommonAbilities.jezdziectwo,
            CommonAbilities.mocnaGlowa,
            CommonAbilities.opiekaNadZwierzetami,
            CommonAbilities.plotkowanie,
            CommonAbilities.plywanie,
            CommonAbilities.powozenie,
            CommonAbilities.przekonywanie,
            CommonAbilities.przeszukiwanie,
            CommonAbilities.skradanieSie,
            CommonAbilities.spostrzegawczosc,
            CommonAbilities.sztukaPrzetrwania,
            CommonAbilities.targowanie,
            CommonAbilities.ukrywanieSie,
            CommonAbilities.wioslarstwo,
            CommonAbilities.wspinaczka,
            CommonAbilities.wycena,
            CommonAbilities.zastraszanie
        )
        return allAbilities.firstOrNull { it.name.equals(name, ignoreCase = true) }
    }

    private fun fetchCharacterSkills(characterDocId: String) {
        val skillTypes = listOf("Common", "Weapon", "Magic", "Rune", "Knight") // Kolejność zgodna z życzeniem

        val typeTitles = mapOf(
            "Common" to "Zdolności:",
            "Weapon" to "Biegłość w orężu:",
            "Magic" to "Zdolności magiczne:",
            "Rune" to "Znajomość run:",
            "Knight" to "Cnoty i Błogosławieństwa"
        )

        val characterRef = db.collection("users")
            .document(userId)
            .collection("characters")
            .document(characterDocId)
            .collection("skills")

        val tasks = skillTypes.map { type -> characterRef.document(type).get() }

        Tasks.whenAllSuccess<DocumentSnapshot>(tasks)
            .addOnSuccessListener { documents ->
                for ((index, doc) in documents.withIndex()) {
                    val type = skillTypes[index]
                    val ownedSkills = doc["owned"] as? List<Map<String, Any>> ?: continue

                    val sortedSkills = ownedSkills.sortedBy { it["name"]?.toString() ?: "" }

                    if (sortedSkills.isNotEmpty()) {
                        val sectionTitle = TextView(this).apply {
                            text = typeTitles[type] ?: type
                            setTextAppearance(R.style.LabelStyle)
                            setPadding(0, 24, 0, 8)
                            gravity = Gravity.CENTER
                        }

                        val sectionContainer = LinearLayout(this).apply {
                            orientation = LinearLayout.VERTICAL
                            layoutParams = LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                            )
                        }

                        for (skill in sortedSkills) {
                            val skillName = skill["name"] as? String ?: continue
                            val skillDescription = skill["description"] as? String ?: ""

                            val row = LinearLayout(this).apply {
                                layoutParams = LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                                )
                                orientation = LinearLayout.HORIZONTAL
                                setPadding(0, 8.dp, 0, 8.dp)
                            }

                            val nameView = TextView(this).apply {
                                text = skillName
                                layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 2f).apply {
                                    setMargins(0, 0, 10.dp, 0)
                                }
                                setTextAppearance(R.style.LabelStyle)
                            }

                            val descriptionView = TextView(this).apply {
                                text = skillDescription
                                layoutParams = LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 3f)
                                setTextAppearance(R.style.LabelStyle)
                            }

                            row.addView(nameView)
                            row.addView(descriptionView)
                            sectionContainer.addView(row)
                        }

                        val skillsMainContainer = findViewById<LinearLayout>(R.id.skillsMainContainer)
                        skillsMainContainer.addView(sectionTitle)
                        skillsMainContainer.addView(sectionContainer)
                    }

                }
            }
            .addOnFailureListener {
                Toast.makeText(this, "Błąd pobierania skilli", Toast.LENGTH_SHORT).show()
            }
    }

    private fun loadPDAndSkillsAbilities() {
        if (characterDocId != null) {
            db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .get()
                .addOnSuccessListener { document ->
                    if (document.exists()) {
                        val PDData = document.data

                        val ownedPD = PDData?.get("ownedPD") as? String ?: "0"
                        val spendPD = (PDData?.get("spendPD") as? Number)?.toInt() ?: 1

                        binding.ownedPD.setText(ownedPD)
                        binding.spendPD.setText(spendPD.toString())

                        val ownedPDValue = ownedPD.toIntOrNull() ?: 0

                        val characterRef = db.collection("users")
                            .document(userId)
                            .collection("characters")
                            .document(characterDocId!!)

                        // Pobierz umiejętności
                        characterRef.collection("skills")
                            .document("Optional")
                            .get()
                            .addOnSuccessListener { skillDoc ->
                                skillsNames.clear()
                                val all = skillDoc["all"] as? List<Map<String, Any>> ?: emptyList()
                                for (item in all) {
                                    val name = item["name"] as? String
                                    name?.let { skillsNames.add(it) }
                                }

                                binding.skillTextView.visibility =
                                    if (skillsNames.isNotEmpty() && ownedPDValue >= 100) View.VISIBLE else View.GONE
                            }

                        // Pobierz zdolności
                        characterRef.collection("abilities")
                            .document("Optional")
                            .get()
                            .addOnSuccessListener { abilityDoc ->
                                abilitiesNames.clear()
                                val all = abilityDoc["all"] as? List<Map<String, Any>> ?: emptyList()
                                for (item in all) {
                                    val name = item["name"] as? String
                                    name?.let { abilitiesNames.add(it) }
                                }

                                binding.abilitiesTextView.visibility =
                                    if (abilitiesNames.isNotEmpty() && ownedPDValue >= 100) View.VISIBLE else View.GONE
                            }

                    } else {
                        println("Dokument nie istnieje.")
                    }
                }
                .addOnFailureListener { e ->
                    println("Błąd podczas pobierania PD: $e")
                }
        } else {
            println("Nieprawidłowy characterDocId")
        }
    }


}





