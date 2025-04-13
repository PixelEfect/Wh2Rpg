package com.dd.rpgcardapp

import BaseActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.SeekBar
import android.widget.Toast
import com.dd.rpgcardapp.data.AbilityGroupSimplifier
import com.dd.rpgcardapp.data.AllStarSigns
import com.dd.rpgcardapp.data.Eyes
import com.dd.rpgcardapp.data.GroupRace
import com.dd.rpgcardapp.data.Hair
import com.dd.rpgcardapp.data.Race
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.data.SkillsGroupSimplifier
import com.dd.rpgcardapp.data.StarSign
import com.dd.rpgcardapp.data.StarSigns
import com.dd.rpgcardapp.databinding.ActivityNewCardAncestryBinding
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.dd.rpgcardapp.utils.showAlertDialog
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class NewCardAncestryActivity : BaseActivity() {

    private lateinit var binding: ActivityNewCardAncestryBinding
    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var selectedRace: Race = Races.Czlowiek
    private var selectedSex: String = MALE
    private var selectedStarSign: StarSign = StarSigns.bebniarz

    companion object {
        const val MALE = "Mężczyzna"
        const val FEMALE = "Kobieta"
        const val CHARACTER_DOC_ID_EXTRA = "CHARACTER_DOC_ID"
        private const val STEP_WEIGHT = 5
        private const val HEIGHT_RANGE = 20
        private const val FEMALE_HEIGHT_PENALTY = 10
        private const val DWARF_FEMALE_HEIGHT_PENALTY = 5
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewCardAncestryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""
        characterDocId = intent.getStringExtra(CHARACTER_DOC_ID_EXTRA)

        setupListeners()

        if (characterDocId != null) {
            loadCharacterData(characterDocId!!)
        } else {
            setDefaultValues()
        }

        // Hide keyboard on touch outside edit texts
        binding.rootLayout.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN && currentFocus != null) {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            }
            SystemUIUtils.hideSystemUI(this)
            false
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

    private fun setupListeners() {
        binding.inputRaceTextView.setOnClickListener { showRaceSelectionDialog() }
        binding.inputSexTextView.setOnClickListener { showSexSelectionDialog() }
        binding.inputEyesTextView.setOnClickListener { showEyeColorSelectionDialog() }
        binding.inputHairTextView.setOnClickListener { showHairColorSelectionDialog() }
        binding.inputStarSignTextView.setOnClickListener { showStarSignSelectionDialog() }
        binding.nextButton.setOnClickListener { saveCharacterToFirestore() }
        binding.backButton.setOnClickListener { navigateToHome() }

        binding.ageSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.ageView.text = (selectedRace.minAge + progress).toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        binding.heightSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Obliczanie aktualnej wysokości
                val minHeight = calculateMinHeight(selectedRace, selectedSex)
                val currentHeight = minHeight + progress // dodajemy progress do minimalnej wysokości
                binding.heightView.text = currentHeight.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        binding.weightSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Obliczanie aktualnej wagi
                val minWeight = selectedRace.minWeight
                val currentWeight = minWeight + progress * STEP_WEIGHT // dodajemy progres pomnożony przez STEP_WEIGHT
                binding.weightView.text = currentWeight.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    private fun setDefaultValues() {
        binding.inputRaceTextView.text = Races.Czlowiek.name
        setAgeRange(Races.Czlowiek)
        selectedSex = MALE
        binding.inputSexTextView.text = selectedSex
        binding.inputEyesTextView.text = Eyes.brazowy.name
        binding.inputHairTextView.text = Hair.brazowy.name
        setHeightRange(Races.Czlowiek, selectedSex)
        setWeightRange(Races.Czlowiek)
        binding.inputStarSignTextView.text = selectedStarSign.name
        updateAbilitiesAndSkills(selectedRace)
    }

    private fun loadCharacterData(docId: String) {
        db.collection("users").document(userId).collection("characters")
            .document(docId)
            .get()
            .addOnSuccessListener { document ->
                document.data?.let { data ->
                    binding.inputName.setText(data["name"] as? String)
                    val raceName = data["race"] as? String ?: Races.Czlowiek.name
                    selectedRace = Races.getByName(raceName) ?: Races.Czlowiek
                    binding.inputRaceTextView.text = selectedRace.name

                    selectedSex = data["sex"] as? String ?: MALE
                    binding.inputSexTextView.text = selectedSex

                    val ageString = data["age"] as? String
                    val age = ageString?.toIntOrNull() ?: selectedRace.minAge
                    setAgeRange(selectedRace, age)
                    println("Loaded age: $age") // Added print statement

                    binding.inputEyesTextView.text = data["eyes"] as? String
                    binding.inputHairTextView.text = data["hair"] as? String

                    val heightString = data["height"] as? String
                    val height = heightString?.toIntOrNull() ?: calculateMinHeight(selectedRace, selectedSex)
                    setHeightRange(selectedRace, selectedSex, height)
                    println("Loaded height: $height")

                    val weightString = data["weight"] as? String
                    val weight = weightString?.toIntOrNull() ?: selectedRace.minWeight
                    setWeightRange(selectedRace, weight)
                    println("Loaded weight: $weight")

                    binding.inputPlaceOfBirth.setText(data["placeOfBirth"] as? String)
                    val starSignName = data["starSign"] as? String ?: StarSigns.bebniarz.name
                    selectedStarSign = AllStarSigns.All.find { it.name == starSignName } ?: AllStarSigns.All.firstOrNull { it.name == "Bębniarz" } ?: StarSigns.bebniarz
                    binding.inputStarSignTextView.text = selectedStarSign.name
                    binding.inputSpecialSigns.setText(data["specialSigns"] as? String)
                    updateAbilitiesAndSkills(selectedRace)
                }
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd ładowania danych: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    private fun showRaceSelectionDialog() {
        val raceNames = GroupRace.All.map { it.name }
        showAlertDialog(this, "Wybierz rasę", raceNames) { selectedRaceName ->
            GroupRace.All.find { it.name == selectedRaceName }?.let { foundRace ->
                selectedRace = foundRace
                binding.inputRaceTextView.text = selectedRaceName
                setAgeRange(foundRace)
                setWeightRange(foundRace)
                binding.inputHairTextView.text = foundRace.hair.first().name
                binding.inputEyesTextView.text = foundRace.eyes.first().name
                setHeightRange(foundRace, selectedSex)
                updateAbilitiesAndSkills(foundRace)
            }
        }
    }

    private fun showSexSelectionDialog() {
        val sexes = listOf(MALE, FEMALE)
        showAlertDialog(this, "Wybierz płeć", sexes) { selected ->
            selectedSex = selected
            binding.inputSexTextView.text = selected
            setHeightRange(selectedRace, selectedSex)
        }
    }

    private fun showEyeColorSelectionDialog() {
        val eyeColors = selectedRace.eyes.map { it.name }
        showAlertDialog(this, "Wybierz kolor oczu", eyeColors) { selected ->
            binding.inputEyesTextView.text = selected
        }
    }

    private fun showHairColorSelectionDialog() {
        val hairColors = selectedRace.hair.map { it.name }
        showAlertDialog(this, "Wybierz kolor włosów", hairColors) { selected ->
            binding.inputHairTextView.text = selected
        }
    }

    private fun showStarSignSelectionDialog() {
        val starSigns = AllStarSigns.All
        val starSignNames = starSigns.map { it.name }
        showAlertDialog(this, "Wybierz znak gwiezdny", starSignNames) { selectedName ->
            starSigns.find { it.name == selectedName }?.let {
                selectedStarSign = it
                binding.inputStarSignTextView.text = selectedName
            }
        }
    }

    private fun setAgeRange(race: Race, currentAge: Int? = null) {
        binding.ageSeekBar.min = race.minAge
        binding.ageSeekBar.max = race.maxAge
        val ageToSet = currentAge ?: race.minAge
        println("setAgeRange - minAge: ${race.minAge}, maxAge: ${race.maxAge}, ageToSet: $ageToSet")
        val progressToSet = ageToSet - race.minAge
        binding.ageSeekBar.progress = progressToSet
        binding.ageView.text = ageToSet.toString()
    }

    private fun setHeightRange(race: Race, sex: String, currentHeight: Int? = null) {
        val minHeight = calculateMinHeight(race, sex)
        val heightToSet = currentHeight ?: minHeight
        println("setHeightRange - minHeight: $minHeight, currentHeight: $heightToSet")
        binding.heightSeekBar.min = 0
        binding.heightSeekBar.max = HEIGHT_RANGE
        val progressToSet = (heightToSet - minHeight)
        binding.heightSeekBar.progress = progressToSet
        binding.heightView.text = heightToSet.toString()
    }

    private fun setWeightRange(race: Race, currentWeight: Int? = null) {
        val minWeight = race.minWeight
        val maxWeight = race.maxWeight
        val weightToSet = currentWeight ?: minWeight
        println("setWeightRange - minWeight: $minWeight, maxWeight: $maxWeight, weightToSet: $weightToSet")
        binding.weightSeekBar.min = 0
        binding.weightSeekBar.max = (maxWeight - minWeight) / STEP_WEIGHT
        val progressToSet = (weightToSet - minWeight) / STEP_WEIGHT
        binding.weightSeekBar.progress = progressToSet
        binding.weightView.text = weightToSet.toString()
    }

    private fun calculateMinHeight(race: Race, sex: String): Int {
        var minHeight = race.minHeight
        if (sex == FEMALE) {
            minHeight -= FEMALE_HEIGHT_PENALTY
            if (race.name.lowercase().contains("krasnolud")) {
                minHeight -= DWARF_FEMALE_HEIGHT_PENALTY
            }
        }
        return minHeight
    }

    private fun calculateCurrentHeight(): Int {
        return calculateMinHeight(selectedRace, selectedSex) + binding.heightSeekBar.progress
    }

    private fun calculateCurrentWeight(): Int {
        return selectedRace.minWeight + binding.weightSeekBar.progress * STEP_WEIGHT
    }

    private fun getStarSignsList(): List<StarSign> {
        return AllStarSigns.All
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("selectedRaceName", selectedRace.name)
        outState.putString("selectedSex", selectedSex)
        outState.putString("selectedHairColor", binding.inputHairTextView.text.toString())
        outState.putString("selectedEyesColor", binding.inputEyesTextView.text.toString())
        outState.putString("selectedStarSignName", selectedStarSign.name)
        outState.putInt("ageProgress", binding.ageSeekBar.progress)
        outState.putInt("heightProgress", binding.heightSeekBar.progress)
        outState.putInt("weightProgress", binding.weightSeekBar.progress)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val savedRaceName = savedInstanceState.getString("selectedRaceName")
        val savedSex = savedInstanceState.getString("selectedSex")
        val savedHairColor = savedInstanceState.getString("selectedHairColor")
        val savedEyesColor = savedInstanceState.getString("selectedEyesColor")
        val savedStarSignName = savedInstanceState.getString("selectedStarSignName")
        val savedAgeProgress = savedInstanceState.getInt("ageProgress")
        println("onRestoreInstanceState - savedAgeProgress: $savedAgeProgress")

        val savedHeightProgress = savedInstanceState.getInt("heightProgress")
        val savedWeightProgress = savedInstanceState.getInt("weightProgress")

        GroupRace.All.find { it.name == savedRaceName }?.let {
            selectedRace = it
            binding.inputRaceTextView.text = savedRaceName
            val restoredAge = it.minAge + savedAgeProgress

            println("onRestoreInstanceState - restoredAge: $restoredAge")
            setAgeRange(it, restoredAge)
            setWeightRange(it, it.minWeight + savedWeightProgress * STEP_WEIGHT)
            setHeightRange(it, savedSex ?: MALE, calculateMinHeight(it, savedSex ?: MALE) + savedHeightProgress)
            updateAbilitiesAndSkills(it)
        }

        selectedSex = savedSex ?: MALE
        binding.inputSexTextView.text = selectedSex
        binding.inputHairTextView.text = savedHairColor
        binding.inputEyesTextView.text = savedEyesColor

        getStarSignsList().find { it.name == savedStarSignName }?.let {
            selectedStarSign = it
            binding.inputStarSignTextView.text = savedStarSignName
        }
    }

    private fun updateAbilitiesAndSkills(race: Race) {
        binding.abilitiesTextView.text = buildString {
            val racialAbilities = race.abilities.joinToString(", ") { it.name }
            val optionalAbilities = race.optionalAbility.joinToString(", ") { group ->
                AbilityGroupSimplifier.simplify(group) ?: group.joinToString(" lub ") { it.name }
            }

            if (racialAbilities.isNotEmpty()) {
                append("Umiejętności rasowe: $racialAbilities")
            }
            if (optionalAbilities.isNotEmpty()) {
                if (racialAbilities.isNotEmpty()) append(", ")
                append("Dodatkowe umiejętności: $optionalAbilities")
            }
            if (isEmpty()) append("Brak umiejętności rasowych")
        }

        binding.skillsTextView.text = buildString {
            val racialSkills = race.skills.joinToString(", ") { it.name }
            val optionalSkills = race.optionalSkills.joinToString(", ") { group ->
                SkillsGroupSimplifier.simplify(group) ?: group.joinToString(" lub ") { it.name }
            }

            if (racialSkills.isNotEmpty()) {
                append("Zdolności rasowe: $racialSkills")
            }
            if (optionalSkills.isNotEmpty()) {
                if (racialSkills.isNotEmpty()) append(", ")
                append("Dodatkowe zdolności: $optionalSkills")
            }
            if (isEmpty()) append("Brak zdolności rasowych")
        }
    }

    private fun saveCharacterToFirestore() {
        val race = binding.inputRaceTextView.text.toString()

        val characterData = hashMapOf(
            "name" to binding.inputName.text.toString(),
            "race" to race,
            "age" to binding.ageView.text.toString(),
            "sex" to binding.inputSexTextView.text.toString(),
            "eyes" to binding.inputEyesTextView.text.toString(),
            "hair" to binding.inputHairTextView.text.toString(),
            "height" to binding.heightView.text.toString(),
            "weight" to binding.weightView.text.toString(),
            "placeOfBirth" to binding.inputPlaceOfBirth.text.toString(),
            "starSign" to selectedStarSign.name,
            "specialSigns" to binding.inputSpecialSigns.text.toString(),
            "createdAt" to FieldValue.serverTimestamp(),
            "lastActiveAt" to FieldValue.serverTimestamp(),
            "progressStage" to 1
        )

        if (userId.isEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać postaci", Toast.LENGTH_SHORT).show()
            return
        }

        if (characterDocId != null) {
            db.collection("users").document(userId).collection("characters")
                .document(characterDocId!!) // Używamy ID istniejącego dokumentu
                .update(characterData) // Używamy set, aby nadpisać dane
                .addOnSuccessListener {
                    Toast.makeText(this, "Karta postaci zapisana!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, NewCardAttributesActivity::class.java).apply {
                        putExtra("CHARACTER_DOC_ID", characterDocId)
                        putExtra("CHARACTER_RACE", binding.inputRaceTextView.text.toString())
                    }
                    startActivity(intent)
                    finish()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
                }
        } else {
            db.collection("users").document(userId).collection("characters")
                .add(characterData)
                .addOnSuccessListener { documentReference ->
                    val documentId = documentReference.id
                    Toast.makeText(this, "Karta postaci zapisana!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, NewCardAttributesActivity::class.java).apply {
                        putExtra("CHARACTER_DOC_ID", documentId)
                        putExtra("CHARACTER_RACE", binding.inputRaceTextView.text.toString())
                    }
                    startActivity(intent)
                    finish()
                }
                .addOnFailureListener { e ->
                    Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
                }
        }
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}