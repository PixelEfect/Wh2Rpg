package com.dd.rpgcardapp

import BaseActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.Race

import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.data.Skill
import com.dd.rpgcardapp.data.getAbilityCategory
import com.dd.rpgcardapp.data.getSkillCategory
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.util.concurrent.ThreadLocalRandom
import com.dd.rpgcardapp.utils.showAlertDialog

class NewCardAttributesActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var selectedGrace: String? = null
    private lateinit var race: Race
    private val randomStats = mutableMapOf<String, Int>()
    private val graceStats = mutableMapOf<String, Int>()
    private val manualStats = mutableMapOf<String, String>()
    private lateinit var abilitiesTextView: TextView
    private lateinit var skillsTextView: TextView
    private val GRACE_BONUS = 11
    private var selectedSkill1: String? = null
    private var selectedSkill2: String? = null
    private var selectedAbility1: String? = null
    private var selectedAbility2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card_attributes)
        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")

        characterDocId ?: run {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        abilitiesTextView = findViewById(R.id.abilitiesTextView)
        skillsTextView = findViewById(R.id.skillsTextView)

        setupAutoCalculation()
        setupManualInputTracking()
        getRaceFromIntent()?.let { foundRace ->
            race = foundRace
            updateAttributesWithGrace(race)
        } ?: run {
            // Obsłuż brak rasy (jeśli nie znaleziono)
            Toast.makeText(this, "Błąd: Brak informacji o rasie", Toast.LENGTH_SHORT).show()
        }

        val laskaTextView = findViewById<TextView>(R.id.LaskaTextView)
        laskaTextView.setOnClickListener {
            val items = listOf(
                "Nie korzystam z łaski",
                "Walka Wręcz",
                "Umiejętności Strzeleckie",
                "Krzepa",
                "Odporność",
                "Zręczność",
                "Inteligencja",
                "Siła Woli",
                "Ogłada"
            )
            showAlertDialog(context = this, title = "Wybierz łaskę", items = items) { selectedItem ->
                selectedGrace = selectedItem
                laskaTextView.text = selectedItem
                updateAttributesWithGrace(race)
            }
        }

        updateAbilitiesAndSkills(race)

        val ability1TextView = findViewById<TextView>(R.id.ability1TextView)
        if (race.optionalAbility.getOrNull(0)?.isEmpty() != false) {
            ability1TextView.visibility = View.GONE
        } else {
            ability1TextView.setOnClickListener {
                race.optionalAbility.getOrNull(0)?.let { abilitiesList ->
                    showAlertDialog(context = this, title = "Wybierz zdolność", items = abilitiesList.map { it.name }) { selectedItem ->
                        selectedAbility1 = selectedItem
                        ability1TextView.text = selectedItem
                        // ewentualnie zaktualizuj inne elementy w UI, jeśli to konieczne
                    }
                }
            }
        }

        val ability2TextView = findViewById<TextView>(R.id.ability2TextView)
        if (race.optionalAbility.getOrNull(1)?.isEmpty() != false) {
            ability2TextView.visibility = View.GONE
        } else {
            ability2TextView.setOnClickListener {
                race.optionalAbility.getOrNull(1)?.let { abilitiesList ->
                    showAlertDialog(context = this, title = "Wybierz zdolność", items = abilitiesList.map { it.name }) { selectedItem ->
                        selectedAbility2 = selectedItem
                        ability2TextView.text = selectedItem
                    }
                }
            }
        }

        val skill1TextView = findViewById<TextView>(R.id.skill1TextView)
        if (race.optionalSkills.getOrNull(0)?.isEmpty() != false) {
            skill1TextView.visibility = View.GONE
        } else {
            skill1TextView.setOnClickListener {
                race.optionalSkills.getOrNull(0)?.let { skillsList ->
                    showAlertDialog(context = this, title = "Wybierz zdolność", items = skillsList.map { it.name }) { selectedItem ->
                        selectedSkill1 = selectedItem
                        skill1TextView.text = selectedItem
                    }
                }
            }
        }

        val skill2TextView = findViewById<TextView>(R.id.skill2TextView)
        if (race.optionalSkills.getOrNull(1)?.isEmpty() != false) {
            skill2TextView.visibility = View.GONE
        } else {
            skill2TextView.setOnClickListener {
                race.optionalSkills.getOrNull(1)?.let { skillsList ->
                    showAlertDialog(context = this, title = "Wybierz zdolność", items = skillsList.map { it.name }) { selectedItem ->
                        selectedSkill2 = selectedItem
                        skill2TextView.text = selectedItem
                    }
                }
            }
        }


        // Nasłuchiwanie kliknięć na głównym kontenerze aktywności
        val rootLayout = findViewById<View>(R.id.rootLayout) // Zmienna 'rootLayout' to główny layout aktywności
        rootLayout.setOnTouchListener { v, event ->
            // Ukryj klawiaturę, jeśli kliknięcie nie jest w polu tekstowym
            if (event.action == MotionEvent.ACTION_DOWN) {
                // Sprawdzamy, czy kliknięcie miało miejsce poza polem tekstowym
                if (currentFocus != null) {
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
                }
            }
            false
        }

        val rollButton = findViewById<Button>(R.id.rollButton)
        rollButton.setOnClickListener {
            getRaceFromIntent()?.let {
                fillAttributesFromRace(it)
            } ?: run {
                Toast.makeText(this, "Błąd: Brak informacji o rasie", Toast.LENGTH_SHORT).show()
            }
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            saveAttributesToFirestore() // Wywołanie zapisu po kliknięciu
        }

        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
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

    private fun getRaceFromIntent(): Race? {
        val raceName = intent.getStringExtra("CHARACTER_RACE")
        return raceName?.let { Races.getByName(it) }
    }

    private fun updateAttributesWithGrace(race: Race) {
        // Resetujemy graceStats
        graceStats.clear()

        // Aktualizujemy graceStats tylko dla wybranej Łaski
        when (selectedGrace) {
            "Walka Wręcz" -> graceStats["WW"] = race.ww + GRACE_BONUS
            "Umiejętności Strzeleckie" -> graceStats["US"] = race.us + GRACE_BONUS
            "Krzepa" -> graceStats["K"] = race.k + GRACE_BONUS
            "Odporność" -> graceStats["Odp"] = race.odp + GRACE_BONUS
            "Zręczność" -> graceStats["Zr"] = race.zr + GRACE_BONUS
            "Inteligencja" -> graceStats["Int"] = race.int + GRACE_BONUS
            "Siła Woli" -> graceStats["SW"] = race.sw + GRACE_BONUS
            "Ogłada" -> graceStats["Ogd"] = race.ogd + GRACE_BONUS
        }
        updateDisplayedStats()
    }

    private fun fillAttributesFromRace(race: Race) {
        val random = java.util.Random()

        fun rollStat(base: Int): Int {
            return base + ThreadLocalRandom.current().nextInt(1, 11) + ThreadLocalRandom.current().nextInt(1, 11)
        }

        randomStats["WW"] = rollStat(race.ww)
        randomStats["US"] = rollStat(race.us)
        randomStats["K"] = rollStat(race.k)
        randomStats["Odp"] = rollStat(race.odp)
        randomStats["Zr"] = rollStat(race.zr)
        randomStats["Int"] = rollStat(race.int)
        randomStats["SW"] = rollStat(race.sw)
        randomStats["Ogd"] = rollStat(race.ogd)

        // Czyścimy ręczne wpisy po ponownym losowaniu
        manualStats.clear()

        // Pozostałe wartości niezależne od łaski
        findViewById<EditText>(R.id.inputA).setText(race.a.toString())
        findViewById<EditText>(R.id.inputZyw).setText(rollZyw(race.zyw).toString())
        findViewById<EditText>(R.id.inputSz).setText(race.sz.toString())
        findViewById<EditText>(R.id.inputMag).setText(race.mag.toString())
        findViewById<EditText>(R.id.inputPO).setText("0")
        findViewById<EditText>(R.id.inputPP).setText(rollPP(race.ppOptions).toString())

        updateDisplayedStats()
    }

    private fun updateDisplayedStats() {
        listOf("WW", "US", "K", "Odp", "Zr", "Int", "SW", "Ogd").forEach { updateStatField(it) }
        updateNonGraceStatField(R.id.inputA, race.a.toString())
        updateNonGraceStatField(R.id.inputZyw, findViewById<EditText>(R.id.inputZyw).text.toString()) // Zachowaj, jeśli było losowane/ręcznie wpisane
        updateNonGraceStatField(R.id.inputSz, race.sz.toString())
        updateNonGraceStatField(R.id.inputMag, race.mag.toString())
        updateNonGraceStatField(R.id.inputPO, findViewById<EditText>(R.id.inputPO).text.toString()) // Zachowaj
        updateNonGraceStatField(R.id.inputPP, findViewById<EditText>(R.id.inputPP).text.toString()) // Zachowaj
    }

    private fun updateStatField(statKey: String) {
        val editText = findViewById<EditText>(resources.getIdentifier("input$statKey", "id", packageName))
        val manualValueStr = manualStats[statKey]
        var displayedValue: Int

        if (!manualValueStr.isNullOrEmpty()) {
            displayedValue = manualValueStr.toIntOrNull() ?: 0
        } else {
            displayedValue = randomStats[statKey] ?: (race.getStatByName(statKey) ?: 0) // Użyj bazowej statystyki rasy, jeśli nie ma losowej
        }

        // Dodaj premię z Łaski, jeśli jest wybrana dla tej statystyki
        if (selectedGrace != "Nie korzystam z łaski") {
            val baseValueWithBonus = (race.getStatByName(statKey) ?: 0) + GRACE_BONUS
            when (statKey) {
                "WW" -> if (selectedGrace == "Walka Wręcz") displayedValue = maxOf(displayedValue, baseValueWithBonus)
                "US" -> if (selectedGrace == "Umiejętności Strzeleckie") displayedValue = maxOf(displayedValue, baseValueWithBonus)
                "K" -> if (selectedGrace == "Krzepa") displayedValue = maxOf(displayedValue, baseValueWithBonus)
                "Odp" -> if (selectedGrace == "Odporność") displayedValue = maxOf(displayedValue, baseValueWithBonus)
                "Zr" -> if (selectedGrace == "Zręczność") displayedValue = maxOf(displayedValue, baseValueWithBonus)
                "Int" -> if (selectedGrace == "Inteligencja") displayedValue = maxOf(displayedValue, baseValueWithBonus)
                "SW" -> if (selectedGrace == "Siła Woli") displayedValue = maxOf(displayedValue, baseValueWithBonus)
                "Ogd" -> if (selectedGrace == "Ogłada") displayedValue = maxOf(displayedValue, baseValueWithBonus)
            }
        }

        editText.setText(displayedValue.toString())
    }

    private fun Race.getStatByName(name: String): Int? {
        return when (name) {
            "WW" -> ww
            "US" -> us
            "K" -> k
            "Odp" -> odp
            "Zr" -> zr
            "Int" -> int
            "SW" -> sw
            "Ogd" -> ogd
            else -> null
        }
    }

    private fun updateNonGraceStatField(editTextId: Int, defaultValue: String) {
        val editText = findViewById<EditText>(editTextId)
        if (editText.text.isNullOrEmpty()) {
            editText.setText(defaultValue)
        }
    }

    private fun saveAttributesToFirestore() {
        val editTextsMap = mapOf(
            "WW" to R.id.inputWW,
            "US" to R.id.inputUS,
            "K" to R.id.inputK,
            "Odp" to R.id.inputOdp,
            "Zr" to R.id.inputZr,
            "Int" to R.id.inputInt,
            "SW" to R.id.inputSW,
            "Ogd" to R.id.inputOgd,
            "A" to R.id.inputA,
            "Zyw" to R.id.inputZyw,
            "Sz" to R.id.inputSz,
            "Mag" to R.id.inputMag,
            "PO" to R.id.inputPO,
            "PP" to R.id.inputPP
        ).mapValues { findViewById<EditText>(it.value) }

        val emptyField = editTextsMap.entries.firstOrNull { it.value.text.toString().isBlank() }
        if (emptyField != null) {
            Toast.makeText(this, "Uzupełnij statystyki.", Toast.LENGTH_SHORT).show()
            return
        }

        fun getIntValue(key: String): Int = editTextsMap[key]?.text.toString().toIntOrNull() ?: 0



        val attributesData = hashMapOf(
            "WW" to getIntValue("WW"),
            "US" to getIntValue("US"),
            "K" to getIntValue("K"),
            "Odp" to getIntValue("Odp"),
            "Zr" to getIntValue("Zr"),
            "Int" to getIntValue("Int"),
            "SW" to getIntValue("SW"),
            "Ogd" to getIntValue("Ogd"),
            "A" to getIntValue("A"),
            "Zyw" to getIntValue("Zyw"),
            "S" to getIntValue("K") / 10,
            "Wt" to getIntValue("Odp") / 10,
            "Sz" to getIntValue("Sz"),
            "Mag" to getIntValue("Mag"),
            "PO" to getIntValue("PO"),
            "PP" to getIntValue("PP")
        )

        // Sprawdzanie, czy łaska została wybrana
        if (selectedGrace.isNullOrEmpty()) {
            Toast.makeText(this, "Musisz wybrać łaskę.", Toast.LENGTH_SHORT).show()
            return
        }

        if (listOf(
                attributesData["WW"], attributesData["US"], attributesData["K"],
                attributesData["Odp"], attributesData["Zr"], attributesData["Int"],
                attributesData["SW"], attributesData["Ogd"], attributesData["Zyw"]
            ).any { it ?: 0 > 95 }
        ) {
            Toast.makeText(
                this,
                "Wartości podstawowych statystyk oraz Żyw nie mogą przekraczać 95.",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        // Sprawdzanie wartości drugorzędnych statystyk
        if (listOf(
                attributesData["A"], attributesData["Sz"], attributesData["Mag"],
                attributesData["PO"], attributesData["PP"]
            ).any { it ?: 0 > 10 }
        ) {
            Toast.makeText(
                this,
                "Wartości drugorzędnych statystyk nie mogą przekraczać 10.",
                Toast.LENGTH_SHORT
            ).show()
            return
        }

        val ability1TextView = findViewById<TextView>(R.id.ability1TextView)
        val ability2TextView = findViewById<TextView>(R.id.ability2TextView)
        val skill1TextView = findViewById<TextView>(R.id.skill1TextView)
        val skill2TextView = findViewById<TextView>(R.id.skill2TextView)

        if (
            (ability1TextView.visibility == View.VISIBLE && selectedAbility1.isNullOrEmpty()) ||
            (ability2TextView.visibility == View.VISIBLE && selectedAbility2.isNullOrEmpty()) ||
            (skill1TextView.visibility == View.VISIBLE && selectedSkill1.isNullOrEmpty()) ||
            (skill2TextView.visibility == View.VISIBLE && selectedSkill2.isNullOrEmpty())
        ) {
            Toast.makeText(this, "Wybierz wszystkie umiejętności i zdolności.", Toast.LENGTH_SHORT)
                .show()
            return
        }

        // Sprawdzanie, czy obie wybrane zdolności są takie same
        if (selectedAbility1 != null && selectedAbility1 == selectedAbility2) {
            Toast.makeText(this, "Obie wybrane zdolności nie mogą być takie same. $selectedAbility1", Toast.LENGTH_SHORT).show()
            return
        }
        // Sprawdzanie, czy obie wybrane umiejętności są takie same
        if (selectedSkill1 != null && selectedSkill1 == selectedSkill2) {
            Toast.makeText(this, "Obie wybrane umiejętności nie mogą być takie same.", Toast.LENGTH_SHORT).show()
            return
        }

        val commonAbilitiesData = mutableListOf<Ability>()
        val rareAbilitiesData = mutableListOf<Ability>()
        val specialAbilitiesData = mutableListOf<Ability>()
        fun addAbilityToCategoryList(ability: Ability) {
            when (getAbilityCategory(ability)) {
                "Common" -> commonAbilitiesData.add(ability)
                "Rare" -> rareAbilitiesData.add(ability)
                else -> specialAbilitiesData.add(ability)
            }
        }
        for (ability in race.abilities) {
            addAbilityToCategoryList(ability)
        }
        listOf(selectedAbility1, selectedAbility2).forEachIndexed { index, selected ->
            race.optionalAbility.getOrNull(index)
                ?.find { it.name == selected }
                ?.let { addAbilityToCategoryList(it) }
        }

        val commonSkillsData = mutableListOf<Skill>()
        val statsSkillsData = mutableListOf<Skill>()
        val weaponSkillsData = mutableListOf<Skill>()
        val magicSkillsData = mutableListOf<Skill>()
        val knightSkillsData = mutableListOf<Skill>()
        val runeSkillsData = mutableListOf<Skill>()

        fun addSkillToCategoryList(skill: Skill) {
            when (getSkillCategory(skill)) {
                "Common" -> commonSkillsData.add(skill)
                "Stats" -> statsSkillsData.add(skill)
                "Weapon" -> weaponSkillsData.add(skill)
                "Magic" -> magicSkillsData.add(skill)
                "Knight" -> knightSkillsData.add(skill)
                "Rune" -> runeSkillsData.add(skill)
                else -> commonSkillsData.add(skill)
            }
        }

        for (skill in race.skills) {
            addSkillToCategoryList(skill)
        }
        listOf(selectedSkill1, selectedSkill2).forEachIndexed { index, selected ->
            race.optionalSkills.getOrNull(index)
                ?.find { it.name == selected }
                ?.let { addSkillToCategoryList(it) }
        }

        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

        // Tworzymy listę zadań (tasks), które będziemy monitorować
        val tasks = mutableListOf<Task<Void>>()

// Zapis atrybutów w subkolekcji "attributes"
        val attributesBaseTask = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("attributes").document("base")
            .set(attributesData)

        tasks.add(attributesBaseTask)

// Zapis abilities w subkolekcjach
        val abilitiesData = mapOf(
            "common" to commonAbilitiesData,
            "rare" to rareAbilitiesData,
            "special" to specialAbilitiesData
        )
        for ((abilityType, abilityData) in abilitiesData) {
            val abilityTask = db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("abilities").document(abilityType)
                .set(mapOf("owned" to abilityData))
            tasks.add(abilityTask)
        }

// Zapis skills w subkolekcjach
        val skillsData = mapOf(
            "common" to commonSkillsData,
            "stats" to statsSkillsData,
            "weapon" to weaponSkillsData,
            "magic" to magicSkillsData,
            "knight" to knightSkillsData,
            "rune" to runeSkillsData
        )
        for ((skillType, skillData) in skillsData) {
            val skillTask = db.collection("users").document(userId)
                .collection("characters").document(characterDocId!!)
                .collection("skills").document(skillType)
                .set(mapOf("owned" to skillData))
            tasks.add(skillTask)
        }

        // Uaktualnienie progressStage na 2
        val progressStageTask = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .update("progressStage", 2)  // Ustawienie progressStage na 4
        tasks.add(progressStageTask)

// Czekamy na zakończenie wszystkich operacji zapisu
        Tasks.whenAllSuccess<Void>(*tasks.toTypedArray())
            .addOnSuccessListener {
                // Jeśli wszystkie zapisy zakończyły się sukcesem
                Toast.makeText(
                    this,
                    "Statystyki, umiejętności i zdolności zapisane!",
                    Toast.LENGTH_SHORT
                ).show()


                val intent = Intent(this, NewCardBackstoryActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                    putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
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

        private fun updateAbilitiesAndSkills(race: Race) {
        val fullAbilitiesText = buildString {
            var isNotEmpty = false // Zmienna pomocnicza dla umiejętności

            // Dodajemy tylko, jeśli lista abilities nie jest pusta
            if (race.abilities.isNotEmpty()) {
                append("Umiejętności rasowe: ")
                append(race.abilities.joinToString(", ") { it.name })
                isNotEmpty = true
            }
            // Jeśli nie dodano niczego, pozostawiamy "Brak"
            if (!isNotEmpty) {
                append("Brak")
            }
        }
        abilitiesTextView.text = fullAbilitiesText.ifBlank { "Brak" }

        val fullSkillsText = buildString {
            var isNotEmpty = false // Zmienna pomocnicza dla umiejętności

            // Dodajemy tylko, jeśli lista skills nie jest pusta
            if (race.skills.isNotEmpty()) {
                append("Zdolności rasowe: ")
                append(race.skills.joinToString(", ") { it.name })
                isNotEmpty = true
            }
            // Jeśli nie dodano niczego, pozostawiamy "Brak"
            if (!isNotEmpty) {
                append("Brak")
            }
        }

        skillsTextView.text = fullSkillsText
    }

    fun rollZyw(base: Int): Int {
        val roll = (1..100).random()
        val bonus = when {
            roll <= 30 -> 0
            roll <= 60 -> 1
            roll <= 90 -> 2
            else -> 3
        }
        return base + bonus
    }

    fun rollPP(options: List<Int>): Int {
        if (options.size != 3) return 0  // zabezpieczenie

        val roll = (1..100).random()
        return when {
            roll <= 40 -> options[0]   // 40%
            roll <= 70 -> options[1]   // kolejne 30%
            else -> options[2]         // ostatnie 30%
        }
    }

    private fun setupAutoCalculation() {
        fun addTextWatcherForStat(inputView: EditText, updateView: EditText, divideBy: Int) {
            inputView.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    val value = inputView.text.toString().toIntOrNull() ?: 0
                    updateView.setText((value / divideBy).toString())
                }
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            })
        }

        addTextWatcherForStat(findViewById(R.id.inputK), findViewById(R.id.inputS), 10)
        addTextWatcherForStat(findViewById(R.id.inputOdp), findViewById(R.id.inputWt), 10)
    }

    private fun setupManualInputTracking() {
        listOf("WW", "US", "K", "Odp", "Zr", "Int", "SW", "Ogd").forEach { stat ->
            val editTextId = resources.getIdentifier("input$stat", "id", packageName)
            findViewById<EditText>(editTextId).addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    manualStats[stat] = s.toString()
                }
                override fun afterTextChanged(s: Editable?) {}
            })
        }
    }
}

