package com.dd.rpgcardapp

import BaseActivity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.Profession
import com.dd.rpgcardapp.data.Professions
import com.dd.rpgcardapp.data.Skill
import com.dd.rpgcardapp.data.getAbilityCategory
import com.dd.rpgcardapp.data.getSkillCategory
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.dd.rpgcardapp.databinding.ActivityNewCardSkillsAndAbilitiesBinding
import com.dd.rpgcardapp.utils.showAlertDialogWithTiles


class NewCardSkillsAndAbilitiesActivity : BaseActivity() {

    private lateinit var binding: ActivityNewCardSkillsAndAbilitiesBinding
    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null

    private lateinit var inputViews: Map<String, TextView>
    private lateinit var buttonViews: Map<String, TextView>
    private val selectedAbilities = MutableList(9) { "" }
    private val selectedSkills = MutableList(5) { "" }
    private lateinit var profession: Profession

    private var selectedMainStatButton: TextView? = null
    private val mainStatButtons =
        mutableMapOf<TextView, Pair<TextView, Int>>() // przycisk -> (TextView input, wartość +5)
    val abilitiesMap: MutableMap<String, List<Map<String, String>>> = mutableMapOf()
    val skillsMap: MutableMap<String, List<Map<String, String>>> = mutableMapOf()
    val professionAbilitiesMap: MutableMap<String, MutableList<Ability>> = mutableMapOf()
    val professionSkillsMap: MutableMap<String, MutableList<Skill>> = mutableMapOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewCardSkillsAndAbilitiesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        val raceName = intent.getStringExtra("CHARACTER_RACE") // Nazwa rasy
        val professionName = intent.getStringExtra("CHARACTER_PROFESSION")
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")

        initViews()
        professionStatsViews()
        loadCharacterData(raceName, characterDocId)
        loadProfession(professionName)
        setupAbilityAndSkillFields()

        binding.rootLayout.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN && currentFocus != null) {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            }
            false
        }

        binding.nextButton.setOnClickListener {
            handleNextButtonClick()
        }

        // Obsługa przycisku "Wstecz"
        binding.backButton.setOnClickListener {
            val intent = Intent(this, NewCardProfessionsActivity::class.java).apply {
                putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
            }
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        SystemUIUtils.hideSystemUI(this)
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            SystemUIUtils.hideSystemUI(this)
        }
    }

    private fun loadCharacterData(raceName: String?, characterDocId: String?) {
        if (characterDocId.isNullOrEmpty() || raceName == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci lub rasy", Toast.LENGTH_SHORT).show()
            finish()
            return
        }
        loadAttributes()
        listOf("common", "rare", "special").forEach {
            fetchAbilitiesData(userId, characterDocId, it)
        }
        listOf("common", "stats", "weapon", "magic", "knight", "rune").forEach {
            fetchSkillsData(userId, characterDocId, it)
        }
    }

    private fun loadAttributes() {
        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można odczytać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("attributes").document("base")
            .get()
            .addOnSuccessListener { document ->
                if (document != null && document.exists()) {
                    inputViews.forEach { (key, view) ->
                        if (key != "S" && key != "Wt") {
                            view.text = (document.getLong(key) ?: 0).toString()
                        }
                        updateDerivedStats()
                    }
                } else {
                    Toast.makeText(this, "Brak zapisanych statystyk", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd odczytu: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    fun fetchAbilitiesData(userId: String, characterDocId: String, abilityType: String) {
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId)
            .collection("abilities").document(abilityType)
            .get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val abilitiesList = mutableListOf<Map<String, String>>()
                    val data = document.data

                    data?.let {
                        val ownedAbilities =
                            it["owned"] as? List<Map<String, Any>>  // Zakładając, że "owned" to lista map

                        ownedAbilities?.forEach { ability ->
                            val name = ability["name"] as? String ?: ""
                            val attribute = ability["attribute"] as? String ?: ""

                            val abilityMap = mapOf(
                                "name" to name,
                                "attribute" to attribute
                            )
                            abilitiesList.add(abilityMap)
                        }
                    }

                    // Zapisujemy dane w odpowiedniej sekcji mapy
                    abilitiesMap[abilityType] = abilitiesList
                }
            }
            .addOnFailureListener { exception ->
                Log.e("Firebase", "Error fetching $abilityType abilities", exception)
            }
    }


    // Funkcja ogólna do pobierania danych z dokumentu "skills"
    fun fetchSkillsData(userId: String, characterDocId: String, skillType: String) {
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId)
            .collection("skills").document(skillType)
            .get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val skillsList = mutableListOf<Map<String, String>>()
                    val data = document.data

                    data?.let {
                        val ownedSkills = it["owned"] as? List<Map<String, Any>>

                        ownedSkills?.forEach { skill ->
                            val name = skill["name"] as? String ?: ""
                            val description = skill["description"] as? String ?: ""

                            val skillMap = mapOf(
                                "name" to name,
                                "description" to description
                            )
                            skillsList.add(skillMap)
                        }
                    }
                    // Zapisujemy dane w odpowiedniej sekcji mapy
                    skillsMap[skillType] = skillsList
                }
            }
            .addOnFailureListener { exception ->
                Log.e("Firebase", "Error fetching $skillType skills", exception)
            }
    }

    private fun loadProfession(professionName: String?) {
        profession = Professions.professionMap[professionName] ?: run {
            Toast.makeText(this, "Profesja nieznana", Toast.LENGTH_SHORT).show()
            finish()
            return
        }
        binding.professionsTextView.text = "Profesja: ${profession.name}"
        assignProfessionStats(profession)

        mapProfessionAbilitiesAndSkills()
    }

    private fun assignProfessionStats(profession: Profession) {
        val stats = mapOf(
            "WW" to profession.ww, "US" to profession.us, "K" to profession.k,
            "Odp" to profession.odp, "Zr" to profession.zr, "Int" to profession.int,
            "SW" to profession.sw, "Ogd" to profession.ogd, "A" to profession.a,
            "Zyw" to profession.zyw, "Sz" to profession.sz, "Mag" to profession.mag
        )

        stats.forEach { (key, value) ->
            val button = buttonViews[key]
            val input = inputViews[key]
            if (value == 0) {
                button?.visibility = View.GONE
            } else {
                button?.apply {
                    text = "+$value"
                    visibility = View.VISIBLE
                    mainStatButtons[this] = input!! to if (value >= 5) 5 else 1
                }
            }
        }

        setupButtonClickListeners()
    }

    private fun setupButtonClickListeners() {
        mainStatButtons.forEach { (button, pair) ->
            val (inputView, increment) = pair
            button.setOnClickListener {
                if (selectedMainStatButton == button) {
                    // Odznaczenie
                    adjustStat(inputView, -increment)
                    selectedMainStatButton = null
                    button.isSelected = false
                } else {
                    // Odznacz poprzedni
                    selectedMainStatButton?.let {
                        mainStatButtons[it]?.let { (prevInput, prevInc) ->
                            adjustStat(prevInput, -prevInc)
                            it.isSelected = false
                        }
                    }
                    // Zaznaczenie nowego
                    adjustStat(inputView, increment)
                    selectedMainStatButton = button
                    button.isSelected = true
                }
            }
        }
    }

    private fun adjustStat(textView: TextView, delta: Int) {
        val current = textView.text.toString().toIntOrNull() ?: 0
        textView.text = (current + delta).toString()
        updateDerivedStats()
    }

    private fun updateDerivedStats() {
        val k = inputViews["K"]?.text.toString().toIntOrNull() ?: 0
        val odp = inputViews["Odp"]?.text.toString().toIntOrNull() ?: 0

        val sValue = k / 10
        val wtValue = odp / 10

        inputViews["S"]?.text = sValue.toString()
        inputViews["Wt"]?.text = wtValue.toString()
    }

    private fun initViews() {
        inputViews = mapOf(
            "WW" to binding.inputWW,
            "US" to binding.inputUS,
            "K" to binding.inputK,
            "Odp" to binding.inputOdp,
            "Zr" to binding.inputZr,
            "Int" to binding.inputInt,
            "SW" to binding.inputSW,
            "Ogd" to binding.inputOgd,
            "A" to binding.inputA,
            "Zyw" to binding.inputZyw,
            "S" to binding.inputS, // Dodano brakujące S
            "Wt" to binding.inputWt, // Dodano brakujące Wt
            "Sz" to binding.inputSz,
            "Mag" to binding.inputMag,
            "PO" to binding.inputPO,
            "PP" to binding.inputPP
        )
    }

    private fun professionStatsViews() {
        buttonViews = mapOf(
            "WW" to binding.buttonWW,
            "US" to binding.buttonUS,
            "K" to binding.buttonK,
            "Odp" to binding.buttonOdp,
            "Zr" to binding.buttonZr,
            "Int" to binding.buttonInt,
            "SW" to binding.buttonSW,
            "Ogd" to binding.buttonOgd,
            "A" to binding.buttonA,
            "Zyw" to binding.buttonZyw,
            "Sz" to binding.buttonSz,
            "Mag" to binding.buttonMag
        )
    }

    private fun setupAbilityAndSkillFields() {
        val abilityTextViews = listOf(
            binding.ability1TextView,
            binding.ability2TextView,
            binding.ability3TextView,
            binding.ability4TextView,
            binding.ability5TextView,
            binding.ability6TextView,
            binding.ability7TextView,
            binding.ability8TextView,
            binding.ability9TextView
        )
        val skillTextViews = listOf(
            binding.skill1TextView,
            binding.skill2TextView,
            binding.skill3TextView,
            binding.skill4TextView,
            binding.skill5TextView
        )

        abilityTextViews.forEachIndexed { index, textView ->
            setupAbilityField(index, textView)
        }
        skillTextViews.forEachIndexed { index, textView ->
            setupSkillField(index, textView)
        }
    }

    private fun setupAbilityField(abilityIndex: Int, abilityTextView: TextView) {
        val ability = profession.optionalAbility.getOrNull(abilityIndex)
        if (ability.isNullOrEmpty()) {
            abilityTextView.visibility = View.GONE
        } else {
            abilityTextView.setOnClickListener {
                showAlertDialog(
                    context = this,
                    title = "Wybierz zdolność",
                    items = ability.map { it.name }
                ) { selectedItem ->
                    // Znajdujemy wybraną umiejętność
                    val selectedAbility = ability.find { it.name == selectedItem }

                    if (selectedAbility != null) {
                        // Przed dodaniem nowej umiejętności, usuwamy starą, jeśli istnieje
                        val previousAbility = selectedAbilities[abilityIndex]
                        if (previousAbility != null) {
                            // Jeśli poprzednia umiejętność istniała, usuwamy ją z mapy
                            removeProfessionAbilityFromCategoryList(previousAbility)
                        }

                        // Dodajemy nową umiejętność do odpowiedniej kategorii w mapie
                        addProfessionAbilityToCategoryList(selectedAbility)

                        // Ustawiamy wybraną umiejętność w TextView i zapisujemy ją w selectedAbilities
                        selectedAbilities[abilityIndex] = selectedItem
                        abilityTextView.text = selectedItem
                    }
                }
            }
        }
    }

    fun removeProfessionAbilityFromCategoryList(abilityName: String) {
        // Iterujemy przez kategorie w mapie professionAbilitiesMap
        professionAbilitiesMap.forEach { (category, abilitiesList) ->
            val abilityToRemove = abilitiesList.find { it.name == abilityName }
            if (abilityToRemove != null) {
                abilitiesList.remove(abilityToRemove)
            }
        }
    }

    // Funkcja pomocnicza do obsługi kliknięć i widoczności pól umiejętności
    private fun setupSkillField(skillIndex: Int, skillTextView: TextView) {
        val skill = profession.optionalSkills.getOrNull(skillIndex)
        if (skill.isNullOrEmpty()) {
            skillTextView.visibility = View.GONE
        } else {
            skillTextView.setOnClickListener {
                showAlertDialog(
                    context = this,
                    title = "Wybierz umiejętność",
                    items = skill.map { it.name }
                ) { selectedItem ->
                    val selectedSkill = skill.find { it.name == selectedItem }

                    if (selectedSkill != null) {
                        // Przed dodaniem nowej umiejętności, usuwamy starą, jeśli istnieje
                        val previousSkill = selectedSkills[skillIndex]
                        if (previousSkill != null) {
                            // Jeśli poprzednia umiejętność istniała, usuwamy ją z mapy
                            removeProfessionSkillFromCategoryList(previousSkill)
                        }

                        // Dodajemy nową umiejętność do odpowiedniej kategorii w mapie
                        addProfessionSkillToCategoryList(selectedSkill)

                        // Ustawiamy wybraną umiejętność w TextView i zapisujemy ją w selectedSkills
                        selectedSkills[skillIndex] = selectedItem
                        skillTextView.text = selectedItem
                    }
                }
            }
        }
    }

    fun removeProfessionSkillFromCategoryList(skillName: String) {
        // Iterujemy przez kategorie w mapie professionSkillsMap
        professionSkillsMap.forEach { (category, skillsList) ->
            val skillToRemove = skillsList.find { it.name == skillName }
            if (skillToRemove != null) {
                skillsList.remove(skillToRemove)
            }
        }
    }


    // Mapowanie zdolności i umiejętności
    fun mapProfessionAbilitiesAndSkills() {
        // Inicjalizowanie pustych MutableList dla każdej kategorii
        professionAbilitiesMap["common"] = mutableListOf()
        professionAbilitiesMap["rare"] = mutableListOf()
        professionAbilitiesMap["special"] = mutableListOf()

        professionSkillsMap["common"] = mutableListOf()
        professionSkillsMap["stats"] = mutableListOf()
        professionSkillsMap["weapon"] = mutableListOf()
        professionSkillsMap["magic"] = mutableListOf()
        professionSkillsMap["knight"] = mutableListOf()
        professionSkillsMap["rune"] = mutableListOf()

        // Mapowanie zdolności
        profession.abilities.forEach { ability ->
            addProfessionAbilityToCategoryList(ability)
        }

        // Mapowanie umiejętności
        profession.skills.forEach { skill ->
            addProfessionSkillToCategoryList(skill)
        }
    }

    // Funkcja do przypisania zdolności do odpowiedniej kategorii w mapie professionAbilitiesMap
    fun addProfessionAbilityToCategoryList(ability: Ability) {
        val category = getAbilityCategory(ability)  // Pobieramy kategorię tej zdolności
        when (category) {
            "Common" -> professionAbilitiesMap["common"]?.add(ability)  // Dodajemy do "common"
            "Rare" -> professionAbilitiesMap["rare"]?.add(ability)      // Dodajemy do "rare"
            "Special" -> professionAbilitiesMap["special"]?.add(ability) // Dodajemy do "special"
            else -> Log.e(
                "UnknownCategory",
                "Unknown ability category"
            ) // Obsługuje nieznaną kategorię
        }
    }

    // Funkcja do przypisania umiejętności do odpowiedniej kategorii w mapie professionSkillsMap
    fun addProfessionSkillToCategoryList(skill: Skill) {
        val category = getSkillCategory(skill)  // Pobieramy kategorię tej umiejętności
        when (category) {
            "Common" -> professionSkillsMap["common"]?.add(skill)  // Dodajemy do "common"
            "Stats" -> professionSkillsMap["stats"]?.add(skill)    // Dodajemy do "stats"
            "Weapon" -> professionSkillsMap["weapon"]?.add(skill)  // Dodajemy do "weapon"
            "Magic" -> professionSkillsMap["magic"]?.add(skill)    // Dodajemy do "magic"
            "Knight" -> professionSkillsMap["knight"]?.add(skill)  // Dodajemy do "knight"
            "Rune" -> professionSkillsMap["rune"]?.add(skill)      // Dodajemy do "rune"
            else -> Log.e(
                "UnknownCategory",
                "Unknown skill category"
            ) // Obsługuje nieznaną kategorię
        }
    }

    fun printMapsData() {
        // Wyświetlamy dane w abilitiesMap
        println("=== abilitiesMap ===")
        abilitiesMap.forEach { (category, abilitiesList) ->
            println("Category: $category")
            abilitiesList.forEach { ability ->
                println("Ability Name: ${ability["name"]}, Attribute: ${ability["attribute"]}")
            }
        }

        // Wyświetlamy dane w skillsMap
        println("=== skillsMap ===")
        skillsMap.forEach { (category, skillsList) ->
            println("Category: $category")
            skillsList.forEach { skill ->
                println("Skill Name: ${skill["name"]}, Description: ${skill["description"]}")
            }
        }

        // Wyświetlamy dane w professionAbilitiesMap
        println("=== professionAbilitiesMap ===")
        professionAbilitiesMap.forEach { (category, abilitiesList) ->
            println("Category: $category")
            abilitiesList.forEach { ability ->
                println("Ability Name: ${ability.name}, Attribute: ${ability.attribute}")
            }
        }

        // Wyświetlamy dane w professionSkillsMap
        println("=== professionSkillsMap ===")
        professionSkillsMap.forEach { (category, skillsList) ->
            println("Category: $category")
            skillsList.forEach { skill ->
                println("Skill Name: ${skill.name}, Description: ${skill.description}")
            }
        }
    }

    fun mergeAndReturnAbilities(): Map<String, List<Map<String, String>>> {
        val mergedAbilitiesMap = mutableMapOf<String, MutableList<Map<String, String>>>()

        abilitiesMap.forEach { (category, abilitiesList) ->
            mergedAbilitiesMap[category] = abilitiesList.toMutableList()
        }

        professionAbilitiesMap.forEach { (category, abilitiesList) ->
            val mapped = abilitiesList.map { ability ->
                mapOf("name" to ability.name, "attribute" to ability.attribute)
            }
            mergedAbilitiesMap[category] = (mergedAbilitiesMap[category] ?: mutableListOf()).apply {
                addAll(mapped)
            }
        }

        mergedAbilitiesMap.forEach { (category, list) ->
            mergedAbilitiesMap[category] = list.sortedBy { it["name"] }.toMutableList()
        }

        // DEBUG – wypisanie danych
        println("=== Merged and Sorted Abilities ===")
        mergedAbilitiesMap.forEach { (category, abilitiesList) ->
            println("Category: $category")
            abilitiesList.forEach { ability ->
                println("Ability Name: ${ability["name"]}, Attribute: ${ability["attribute"]}")
            }
        }

        return mergedAbilitiesMap
    }



    fun mergeAndReturnSkills(): Map<String, List<Map<String, String>>> {
        val mergedSkillsMap = mutableMapOf<String, MutableList<Map<String, String>>>()

        // Dodaj umiejętności z skillsMap
        skillsMap.forEach { (category, skillsList) ->
            mergedSkillsMap[category] = skillsList.toMutableList()
        }

        // Dodaj umiejętności z professionSkillsMap
        professionSkillsMap.forEach { (category, skillsList) ->
            skillsList.forEach { skill ->
                // Usuwamy sprawdzanie duplikatów, po prostu dodajemy każdą umiejętność
                mergedSkillsMap[category] = (mergedSkillsMap[category] ?: mutableListOf()).apply {
                    add(mapOf("name" to skill.name, "description" to skill.description))
                }
            }
        }

        // Posortuj umiejętności w każdej kategorii (jeśli chcesz, aby były posortowane, ale z duplikatami)
        mergedSkillsMap.forEach { (category, list) ->
            mergedSkillsMap[category] = list.sortedBy { it["name"] }.toMutableList()
        }

        // DEBUG – wypisanie danych
        println("=== Merged and Sorted Skills (with duplicates) ===")
        mergedSkillsMap.forEach { (category, skillsList) ->
            println("Category: $category")
            skillsList.forEach { skill ->
                println("Ability Name: ${skill["name"]}, Description: ${skill["description"]}")
            }
        }

        return mergedSkillsMap
    }


    fun handleNextButtonClick() {
        val mainStatData = selectedMainStatButton?.let { button ->
            mainStatButtons[button]?.let { (inputView, bonus) ->
                val attribute = inputViews.entries.find { it.value == inputView }?.key
                if (attribute != null) {
                    mapOf(
                        attribute to bonus,
                    )
                } else null
            }
        }

        if (mainStatData == null) {
            Toast.makeText(this, "Wybierz darmowy rozwój", Toast.LENGTH_SHORT).show()
            return
        }

        if (!validateSelections()) {
            Toast.makeText(this, "Wybierz wszystkie umiejętności i zdolności", Toast.LENGTH_SHORT).show()
            return
        }

        printMapsData()

        val mergedAbilitiesMap = mergeAndReturnAbilities()
        val mergedSkillsMap = mergeAndReturnSkills()

        // Sprawdzanie duplikatów w umiejętnościach
        val duplicates = checkForDuplicates(mergedSkillsMap)

        if (duplicates.isNotEmpty()) {
            // Wyświetlenie dialogu z kafelkami, jeśli są duplikaty
            val duplicateMessage = "W Twoich zdolnościach znajdują się dupliaty:\n${duplicates.joinToString(", ")}.\nCzy chcesz kontynuować?"

            showAlertDialogWithTiles(
                context = this,
                title = duplicateMessage,
                items = listOf("Tak", "Nie")
            ) { selectedItem ->
                if (selectedItem == "Tak") {
                    val deduplicatedSkillsMap = mergedSkillsMap.mapValues { (_, skillList) ->
                        skillList.distinctBy { it["name"] }
                    }
                    saveCharacterData(mainStatData, mergedAbilitiesMap, deduplicatedSkillsMap)
                } else {
                    // Anuluj zapis, jeśli wybrano "Nie"
                }
            }
        } else {
            // Jeśli brak duplikatów, od razu zapisuj dane
            saveCharacterData(mainStatData, mergedAbilitiesMap, mergedSkillsMap)
        }
    }

    fun saveCharacterData(
        mainStatData: Map<String, Int>?,
        mergedAbilitiesMap: Map<String, List<Map<String, String>>>,
        mergedSkillsMap: Map<String, List<Map<String, String>>>
    ) {
        val db = FirebaseFirestore.getInstance()

        // Sprawdzamy, czy userId i characterDocId są poprawne
        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać statystyk", Toast.LENGTH_SHORT).show()
            return
        }


        val tasks = mutableListOf<Task<Void>>()

        mainStatData?.let { data ->
            val mainStatTask = db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("attributes").document("obtained")
                .set(data)
            tasks.add(mainStatTask)
        }

        // Zapis abilities w podkolekcji
        for ((category, abilitiesList) in mergedAbilitiesMap) {
            val abilityTask = db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("abilities").document(category)
                .set(mapOf("owned" to abilitiesList))
            tasks.add(abilityTask)
        }

        // Zapis skills w podkolekcji
        for ((category, skillsList) in mergedSkillsMap) {
            val skillTask = db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("skills").document(category)
                .set(mapOf("owned" to skillsList))
            tasks.add(skillTask)
        }

        // Uaktualnienie progressStage na 5
        val progressStageTask = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .update("progressStage", 5)  // Ustawienie progressStage na 5
        tasks.add(progressStageTask)

        // Po zapisaniu danych
        Tasks.whenAllSuccess<Void>(*tasks.toTypedArray())
            .addOnSuccessListener {
                Toast.makeText(
                    this,
                    "Udało Ci się stworzyć kartę postaci!",
                    Toast.LENGTH_SHORT
                ).show()
                val intent = Intent(this, HomeActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)
                    putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }


    private fun validateSelections(): Boolean {
        // Sprawdzamy, czy każde pole zdolności i umiejętności jest wypełnione
        for (i in profession.optionalAbility.indices) {
            if (selectedAbilities[i].isNullOrEmpty()) {
                return false // Zwróć false, jeśli jakiekolwiek pole zdolności jest puste
            }
        }

        for (i in profession.optionalSkills.indices) {
            if (selectedSkills[i].isNullOrEmpty()) {
                return false // Zwróć false, jeśli jakiekolwiek pole umiejętności jest puste
            }
        }

        return true // Wszystkie pola są wypełnione
    }

    fun checkForDuplicates(skillsMap: Map<String, List<Map<String, String>>>): List<String> {
        val duplicates = mutableListOf<String>()

        skillsMap.forEach { (category, skillsList) ->
            val seenSkills = mutableSetOf<String>()
            skillsList.forEach { skill ->
                val skillName = skill["name"]
                if (skillName != null && !seenSkills.add(skillName)) {
                    duplicates.add(skillName) // Dodajemy nazwę umiejętności, jeśli już występuje w zbiorze
                }
            }
        }

        return duplicates
    }

}





