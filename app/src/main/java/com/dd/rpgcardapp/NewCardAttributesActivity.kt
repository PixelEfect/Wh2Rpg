package com.dd.rpgcardapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.data.Ability
import com.dd.rpgcardapp.data.Race

import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.data.Skill
import com.dd.rpgcardapp.data.getAbilityCategory
import com.dd.rpgcardapp.data.getSkillCategory
import com.dd.rpgcardapp.databinding.ActivityNewCardAttributesBinding
import com.google.android.gms.tasks.Task
import com.google.android.gms.tasks.Tasks
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.util.concurrent.ThreadLocalRandom
import com.dd.rpgcardapp.utils.showAlertDialog
import androidx.core.view.isVisible
import com.dd.rpgcardapp.base.BaseActivity

class NewCardAttributesActivity : BaseActivity() {

    private lateinit var binding: ActivityNewCardAttributesBinding
    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var selectedGrace: String? = null
    private lateinit var race: Race
    private val randomStats = mutableMapOf<String, Int>()
    private val graceStats = mutableMapOf<String, Int>()
    private val manualStats = mutableMapOf<String, String>()
    private val graceBonus = 11
    private var selectedSkill1: String? = null
    private var selectedSkill2: String? = null
    private var selectedAbility1: String? = null
    private var selectedAbility2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewCardAttributesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")

        characterDocId ?: run {
            Toast.makeText(this, getString(R.string.error_no_character_id), Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        setupAutoCalculation()
        setupManualInputTracking()
        loadAttributesFromFirestore()
        getRaceFromIntent()?.let { foundRace ->
            race = foundRace
            updateAttributesWithGrace(race)
        } ?: run {
            Toast.makeText(this, getString(R.string.error_no_race_info), Toast.LENGTH_SHORT).show()
        }

        binding.LaskaTextView.setOnClickListener {
            val items = listOf(
                getString(R.string.grace_none),
                getString(R.string.grace_melee),
                getString(R.string.grace_ranged),
                getString(R.string.grace_strength),
                getString(R.string.grace_toughness),
                getString(R.string.grace_agility),
                getString(R.string.grace_intelligence),
                getString(R.string.grace_willpower),
                getString(R.string.grace_fellowship)
            )
            showAlertDialog(context = this, title = getString(R.string.grace_dialog_title), items = items) { selectedItem ->
                selectedGrace = selectedItem
                binding.LaskaTextView.text = selectedItem
                updateAttributesWithGrace(race)
            }
        }

        updateAbilitiesAndSkills(race)

        if (race.optionalAbility.getOrNull(0)?.isEmpty() != false) {
            binding.ability1TextView.visibility = View.GONE
            binding.ability1View.visibility = View.GONE
        } else {
            binding.ability1TextView.setOnClickListener {
                race.optionalAbility.getOrNull(0)?.let { abilitiesList ->
                    showAlertDialog(context = this, title = getString(R.string.ability_dialog_title), items = abilitiesList.map { it.name }) { selectedItem ->
                        selectedAbility1 = selectedItem
                        binding.ability1TextView.text = selectedItem
                    }
                }
            }
        }

        if (race.optionalAbility.getOrNull(1)?.isEmpty() != false) {
            binding.ability2TextView.visibility = View.GONE
            binding.ability2View.visibility = View.GONE
        } else {
            binding.ability2TextView.setOnClickListener {
                race.optionalAbility.getOrNull(1)?.let { abilitiesList ->
                    showAlertDialog(context = this, title = getString(R.string.ability_dialog_title), items = abilitiesList.map { it.name }) { selectedItem ->
                        selectedAbility2 = selectedItem
                        binding.ability2TextView.text = selectedItem
                    }
                }
            }
        }

        if (race.optionalSkills.getOrNull(0)?.isEmpty() != false) {
            binding.skill1TextView.visibility = View.GONE
            binding.skill1View.visibility = View.GONE
        } else {
            binding.skill1TextView.setOnClickListener {
                race.optionalSkills.getOrNull(0)?.let { skillsList ->
                    showAlertDialog(context = this, title = getString(R.string.skill_dialog_title), items = skillsList.map { it.name }) { selectedItem ->
                        selectedSkill1 = selectedItem
                        binding.skill1TextView.text = selectedItem
                    }
                }
            }
        }

        if (race.optionalSkills.getOrNull(1)?.isEmpty() != false) {
            binding.skill2TextView.visibility = View.GONE
            binding.skill2View.visibility = View.GONE
        } else {
            binding.skill2TextView.setOnClickListener {
                race.optionalSkills.getOrNull(1)?.let { skillsList ->
                    showAlertDialog(context = this, title = getString(R.string.skill_dialog_title), items = skillsList.map { it.name }) { selectedItem ->
                        selectedSkill2 = selectedItem
                        binding.skill2TextView.text = selectedItem
                    }
                }
            }
        }

        binding.rollButton.setOnClickListener {
            getRaceFromIntent()?.let {
                fillAttributesFromRace(it)
            } ?: run {
                Toast.makeText(this, "Błąd: Brak informacji o rasie", Toast.LENGTH_SHORT).show()
            }
        }

        binding.nextButton.setOnClickListener {
            saveAttributesToFirestore()
        }
        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        binding.backButton.setOnClickListener {
            val characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
            val intent = Intent(this, NewCardAncestryActivity::class.java)
            intent.putExtra("CHARACTER_DOC_ID", characterDocId)
            startActivity(intent)
        }

    }

    private fun getRaceFromIntent(): Race? {
        val raceName = intent.getStringExtra("CHARACTER_RACE")
        return raceName?.let { Races.getByName(it) }
    }

    private fun updateAttributesWithGrace(race: Race) {
        graceStats.clear()

        val graceBonusMap = mapOf(
            "Walka Wręcz" to "WW",
            "Umiejętności Strzeleckie" to "US",
            "Krzepa" to "K",
            "Odporność" to "Odp",
            "Zręczność" to "Zr",
            "Inteligencja" to "Int",
            "Siła Woli" to "SW",
            "Ogłada" to "Ogd"
        )

        selectedGrace?.let { grace ->
            graceBonusMap[grace]?.let { statKey ->
                graceStats[statKey] = (race.getStatByName(statKey) ?: 0) + graceBonus
            }
        }
        updateDisplayedStats()
    }

    private fun fillAttributesFromRace(race: Race) {

        fun rollStat(): Int {
            return ThreadLocalRandom.current().nextInt(1, 11) + ThreadLocalRandom.current().nextInt(1, 11)
        }

        randomStats["WW"] = race.ww + rollStat()
        randomStats["US"] = race.us + rollStat()
        randomStats["K"] = race.k + rollStat()
        randomStats["Odp"] = race.odp + rollStat()
        randomStats["Zr"] = race.zr + rollStat()
        randomStats["Int"] = race.int + rollStat()
        randomStats["SW"] = race.sw + rollStat()
        randomStats["Ogd"] = race.ogd + rollStat()

        manualStats.clear()

        binding.inputA.setText(race.a.toString())
        binding.inputZyw.setText(rollZyw(race.zyw).toString())
        binding.inputSz.setText(race.sz.toString())
        binding.inputMag.setText(race.mag.toString())
        binding.inputPO.setText("0")
        binding.inputPP.setText(rollPP(race.ppOptions).toString())

        updateDisplayedStats()
    }

    private fun updateDisplayedStats() {
        listOf("WW", "US", "K", "Odp", "Zr", "Int", "SW", "Ogd").forEach { updateStatField(it) }
        updateNonGraceStatField(binding.inputA, race.a.toString())
        updateNonGraceStatField(binding.inputZyw, binding.inputZyw.text.toString())
        updateNonGraceStatField(binding.inputSz, race.sz.toString())
        updateNonGraceStatField(binding.inputMag, race.mag.toString())
        updateNonGraceStatField(binding.inputPO, binding.inputPO.text.toString())
        updateNonGraceStatField(binding.inputPP, binding.inputPP.text.toString())
    }

    @SuppressLint("DiscouragedApi")
    private fun updateStatField(statKey: String) {
        val editText = findViewById<EditText>(resources.getIdentifier("input$statKey", "id", packageName))
        val manualValue = manualStats[statKey]?.toIntOrNull()
        val baseRaceStat = race.getStatByName(statKey) ?: 0
        var displayedValue = manualValue ?: (randomStats[statKey] ?: baseRaceStat)

        val graceBonusActive = selectedGrace != "Nie korzystam z łaski"
        val graceBonusStat = baseRaceStat + graceBonus

        when (statKey) {
            "WW" -> if (graceBonusActive && selectedGrace == "Walka Wręcz") displayedValue = maxOf(displayedValue, graceBonusStat)
            "US" -> if (graceBonusActive && selectedGrace == "Umiejętności Strzeleckie") displayedValue = maxOf(displayedValue, graceBonusStat)
            "K" -> if (graceBonusActive && selectedGrace == "Krzepa") displayedValue = maxOf(displayedValue, graceBonusStat)
            "Odp" -> if (graceBonusActive && selectedGrace == "Odporność") displayedValue = maxOf(displayedValue, graceBonusStat)
            "Zr" -> if (graceBonusActive && selectedGrace == "Zręczność") displayedValue = maxOf(displayedValue, graceBonusStat)
            "Int" -> if (graceBonusActive && selectedGrace == "Inteligencja") displayedValue = maxOf(displayedValue, graceBonusStat)
            "SW" -> if (graceBonusActive && selectedGrace == "Siła Woli") displayedValue = maxOf(displayedValue, graceBonusStat)
            "Ogd" -> if (graceBonusActive && selectedGrace == "Ogłada") displayedValue = maxOf(displayedValue, graceBonusStat)
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

    private fun updateNonGraceStatField(editText: TextView, defaultValue: String) {
        if (editText.text.isNullOrEmpty()) {
            editText.text = defaultValue
        }
    }

    private fun saveAttributesToFirestore() {
        // Używamy binding do dostępu do EditTextów
        val editTextsMap = mapOf(
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
            "Sz" to binding.inputSz,
            "Mag" to binding.inputMag,
            "PO" to binding.inputPO,
            "PP" to binding.inputPP
        )

        val emptyField = editTextsMap.entries.firstOrNull { it.value.text.toString().isBlank() }
        if (emptyField != null) {
            Toast.makeText(this, getString(R.string.complete_stats), Toast.LENGTH_SHORT).show()
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

        if (selectedGrace.isNullOrEmpty()) {
            Toast.makeText(this, getString(R.string.choose_grace), Toast.LENGTH_SHORT).show()
            return
        }

        if (listOf(
                attributesData["WW"], attributesData["US"], attributesData["K"],
                attributesData["Odp"], attributesData["Zr"], attributesData["Int"],
                attributesData["SW"], attributesData["Ogd"], attributesData["Zyw"]
            ).any { (it ?: 0) > 95 }
        ) {
            Toast.makeText(this, getString(R.string.primary_stats_limit), Toast.LENGTH_SHORT).show()
            return
        }

        if (listOf(
                attributesData["A"], attributesData["Sz"], attributesData["Mag"],
                attributesData["PO"], attributesData["PP"]
            ).any { (it ?: 0) > 10 }
        ) {
            Toast.makeText(this, getString(R.string.secondary_stats_limit), Toast.LENGTH_SHORT).show()
            return
        }

        if (
            (binding.ability1TextView.isVisible && selectedAbility1.isNullOrEmpty()) ||
            (binding.ability2TextView.isVisible && selectedAbility2.isNullOrEmpty()) ||
            (binding.skill1TextView.isVisible && selectedSkill1.isNullOrEmpty()) ||
            (binding.skill2TextView.isVisible && selectedSkill2.isNullOrEmpty())
        ){
            Toast.makeText(this, getString(R.string.choose_all_skills_abilities), Toast.LENGTH_SHORT).show()
            return
        }

        if (selectedAbility1 != null && selectedAbility1 == selectedAbility2) {
            Toast.makeText(this, getString(R.string.abilities_cannot_be_same, selectedAbility1), Toast.LENGTH_SHORT).show()
            return
        }

        if (selectedSkill1 != null && selectedSkill1 == selectedSkill2) {
            Toast.makeText(this, getString(R.string.skills_cannot_be_same), Toast.LENGTH_SHORT).show()
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
            Toast.makeText(this, getString(R.string.error_save_stats), Toast.LENGTH_SHORT).show()
            return
        }

        val characterRef = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)

        val tasks = mutableListOf<Task<Void>>()

        // Zapis atrybutów
        tasks.add(characterRef.collection("attributes").document("base").set(attributesData))

        // Zapis abilities
        val abilitiesDataMap = mapOf(
            "Common" to commonAbilitiesData,
            "Rare" to rareAbilitiesData,
            "Special" to specialAbilitiesData
        )
        for ((type, data) in abilitiesDataMap) {
            tasks.add(characterRef.collection("abilities").document(type).set(mapOf("owned" to data)))
        }

        // Zapis skills
        val skillsDataMap = mapOf(
            "Common" to commonSkillsData,
            "Stats" to statsSkillsData,
            "Weapon" to weaponSkillsData,
            "Magic" to magicSkillsData,
            "Knight" to knightSkillsData,
            "Rune" to runeSkillsData
        )
        for ((type, data) in skillsDataMap) {
            tasks.add(characterRef.collection("skills").document(type).set(mapOf("owned" to data)))
        }
        tasks.add(characterRef.update("grace", selectedGrace))
        // Aktualizacja progressStage
        tasks.add(characterRef.update("progressStage", 2))

        Tasks.whenAllSuccess<Void>(*tasks.toTypedArray())
            .addOnSuccessListener {
                Toast.makeText(this, getString(R.string.stats_saved_success), Toast.LENGTH_SHORT).show()

                val intent = Intent(this, NewCardBackstoryActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)
                    putExtra("CHARACTER_RACE", this@NewCardAttributesActivity.intent.getStringExtra("CHARACTER_RACE"))
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, getString(R.string.error_save_character, e.message), Toast.LENGTH_SHORT).show()
            }
    }

    private fun updateAbilitiesAndSkills(race: Race) {
        val fullAbilitiesText = if (race.abilities.isNotEmpty()) {
            getString(R.string.racial_abilities, race.abilities.joinToString(", ") { it.name })
        } else {
            getString(R.string.noAbilities)
        }
        binding.abilitiesTextView.text = fullAbilitiesText

        val fullSkillsText = if (race.skills.isNotEmpty()) {
            getString(R.string.racial_skills, race.skills.joinToString(", ") { it.name })
        } else {
            getString(R.string.noSkills)
        }
        binding.skillsTextView.text = fullSkillsText
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
        if (options.size != 3) return 0

        val roll = (1..100).random()
        return when {
            roll <= 40 -> options[0]
            roll <= 70 -> options[1]
            else -> options[2]
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

        addTextWatcherForStat(binding.inputK, binding.inputS, 10)
        addTextWatcherForStat(binding.inputOdp, binding.inputWt, 10)
    }

    @SuppressLint("DiscouragedApi")
    private fun setupManualInputTracking() {
        listOf("WW", "US", "K", "Odp", "Zr", "Int", "SW", "Ogd").forEach { stat ->
            val editText = findViewById<EditText>(resources.getIdentifier("input$stat", "id", packageName))
            editText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    manualStats[stat] = s.toString()
                }
                override fun afterTextChanged(s: Editable?) {}
            })
        }
    }
    private fun loadAttributesFromFirestore() {
        val characterRef = db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)

        characterRef.get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val grace = document.getString("grace")

                    if (!grace.isNullOrEmpty()) {
                        selectedGrace = grace
                        binding.LaskaTextView.text = grace
                    }

                    val attributesRef = db.collection("users").document(userId)
                        .collection("characters").document(characterDocId!!)
                        .collection("attributes").document("base")

                    attributesRef.get()
                        .addOnSuccessListener { attributesDocument ->
                            if (attributesDocument.exists()) {
                                val attributesData = attributesDocument.data

                                attributesData?.let {
                                    binding.inputWW.setText(it["WW"].toString())
                                    binding.inputUS.setText(it["US"].toString())
                                    binding.inputK.setText(it["K"].toString())
                                    binding.inputOdp.setText(it["Odp"].toString())
                                    binding.inputZr.setText(it["Zr"].toString())
                                    binding.inputInt.setText(it["Int"].toString())
                                    binding.inputSW.setText(it["SW"].toString())
                                    binding.inputOgd.setText(it["Ogd"].toString())
                                    binding.inputA.setText(it["A"].toString())
                                    binding.inputZyw.setText(it["Zyw"].toString())
                                    binding.inputSz.setText(it["Sz"].toString())
                                    binding.inputMag.setText(it["Mag"].toString())
                                    binding.inputPO.setText(it["PO"].toString())
                                    binding.inputPP.setText(it["PP"].toString())
                                }
                            } else {
                                Toast.makeText(this, getString(R.string.attributes_data_not_found), Toast.LENGTH_SHORT).show()
                            }
                        }
                        .addOnFailureListener { exception ->
                            Toast.makeText(this, getString(R.string.error_loading_attributes, exception.message), Toast.LENGTH_SHORT).show()
                        }

                } else {
                    Toast.makeText(this, getString(R.string.character_data_not_found), Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { exception ->
                Toast.makeText(this, getString(R.string.error_loading_data, exception.message), Toast.LENGTH_SHORT).show()
            }
    }

}

