package com.dd.rpgcardapp

import BaseActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.content.Intent
import android.view.MotionEvent
import android.view.View
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import android.widget.SeekBar
import com.dd.rpgcardapp.data.AllStarSigns
import com.dd.rpgcardapp.data.SkillsGroupSimplifier
import com.dd.rpgcardapp.data.Race
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.data.GroupRace
import com.dd.rpgcardapp.data.StarSign
import com.dd.rpgcardapp.data.StarSigns
import com.dd.rpgcardapp.utils.SystemUIUtils
import android.content.Context
import android.view.inputmethod.InputMethodManager
import com.dd.rpgcardapp.data.AbilityGroupSimplifier
import com.dd.rpgcardapp.data.Eyes
import com.dd.rpgcardapp.data.Hair
import com.dd.rpgcardapp.utils.showAlertDialog

class NewCardAncestryActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String

    private lateinit var raceTextView: TextView
    private lateinit var ageSeekBar: SeekBar
    private lateinit var ageTextView: TextView
    private lateinit var sexTextView: TextView
    private lateinit var eyesTextView: TextView
    private lateinit var hairTextView: TextView
    private lateinit var heightSeekBar: SeekBar
    private lateinit var heightTextView: TextView
    private lateinit var weightSeekBar: SeekBar
    private lateinit var weightTextView: TextView
    private lateinit var starSignTextView: TextView
    private lateinit var abilitiesTextView: TextView
    private lateinit var skillsTextView: TextView

    companion object {
        const val MALE = "Mężczyzna"
        const val FEMALE = "Kobieta"
    }

    private var selectedRace: Race = Races.Czlowiek
    private var selectedSex: String = MALE
    private var selectedStarSign: StarSign = StarSigns.bebniarz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card_ancestry)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Wyszukaj widżety
        raceTextView = findViewById(R.id.inputRaceTextView)
        ageSeekBar = findViewById(R.id.ageSeekBar)
        ageTextView = findViewById(R.id.ageView)
        sexTextView = findViewById(R.id.inputSexTextView)
        eyesTextView = findViewById(R.id.inputEyesTextView)
        hairTextView = findViewById(R.id.inputHairTextView)
        heightSeekBar = findViewById(R.id.heightSeekBar)
        heightTextView = findViewById(R.id.heightView)
        weightSeekBar = findViewById(R.id.weightSeekBar)
        weightTextView = findViewById(R.id.weightView)
        starSignTextView = findViewById(R.id.inputStarSignTextView)
        abilitiesTextView = findViewById(R.id.abilitiesTextView)
        skillsTextView = findViewById(R.id.skillsTextView)


        raceTextView.text = Races.Czlowiek.name
        setAgeRange(Races.Czlowiek)
        selectedSex = MALE
        sexTextView.text = selectedSex
        val defaultEyesColor = Eyes.brazowy.name
        eyesTextView.text = defaultEyesColor
        val defaultHairColor = Hair.brazowy.name
        hairTextView.text = defaultHairColor

        setHeightRange(Races.Czlowiek, selectedSex)
        setWeightRange(Races.Czlowiek)
        starSignTextView.text = "${selectedStarSign.name}"

        updateAbilitiesAndSkills(selectedRace)
        // Nasłuchiwanie kliknięć na głównym kontenerze aktywności
        val rootLayout = findViewById<View>(R.id.rootLayout) // Zmienna 'rootLayout' to główny layout aktywności
        rootLayout.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                if (currentFocus != null) {
                    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                    imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
                }
            }
            SystemUIUtils.hideSystemUI(this)
            false
        }

        raceTextView.setOnClickListener {
            val raceNames = GroupRace.All.map { it.name }
            showAlertDialog(
                context = this,
                title = "Wybierz rasę",
                items = raceNames
            ) { selectedRaceName ->
                GroupRace.All.find { it.name == selectedRaceName }?.let { foundRace ->
                    selectedRace = foundRace
                    raceTextView.text = selectedRaceName
                    setAgeRange(foundRace)
                    setWeightRange(foundRace)
                    hairTextView.text = foundRace.hair.first().name
                    eyesTextView.text = foundRace.eyes.first().name
                    setHeightRange(foundRace, selectedSex)
                    updateAbilitiesAndSkills(foundRace)
                }
            }
        }

        sexTextView.setOnClickListener {
            val sexes = listOf(MALE, FEMALE)
            showAlertDialog(context = this, title = "Wybierz płeć", items = sexes) { selected ->
                selectedSex = selected
                sexTextView.text = selected
                setHeightRange(selectedRace, selectedSex)
            }
        }

        eyesTextView.setOnClickListener {
            val eyeColors = selectedRace.eyes.map { it.name }
            showAlertDialog(context = this, title = "Wybierz kolor oczu", items = eyeColors) { selected ->
                eyesTextView.text = selected
            }
        }

        hairTextView.setOnClickListener {
            val hairColors = selectedRace.hair.map { it.name }
            showAlertDialog(context = this, title = "Wybierz kolor włosów", items = hairColors) { selected ->
                hairTextView.text = selected
            }
        }

        starSignTextView.setOnClickListener {
            val starSigns = getStarSignsList()
            val starSignNames = starSigns.map { it.name }

            showAlertDialog(context = this, title = "Wybierz znak gwiezdny", items = starSignNames) { selectedName ->
                starSigns.find { it.name == selectedName }?.let {
                    selectedStarSign = it
                    starSignTextView.text = selectedName
                }
            }
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            val name = findViewById<EditText>(R.id.inputName).text.toString()
            if (name.isBlank()) {
                Toast.makeText(this, "Imię nie może być puste!", Toast.LENGTH_SHORT).show()
            } else {
                saveCharacterToFirestore()
            }
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

    // Wspólna funkcja do ustawiania SeekBar dla wieku, wagi, wzrostu
    private fun setupSeekBar(
        seekBar: SeekBar,
        textView: TextView,
        minValue: Int,
        maxValue: Int,
        step: Int = 1,
    ) {
        seekBar.max = (maxValue - minValue) / step
        seekBar.progress = 0
        textView.text = "$minValue"

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val value = minValue + progress * step
                textView.text = "$value"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    // Ustawianie zakresu dla wieku
    private fun setAgeRange(race: Race) {
        setupSeekBar(
            ageSeekBar,
            ageTextView,
            race.minAge,
            race.maxAge,
            step = 1,
        )
    }

    // Ustawianie zakresu dla wagi
    private fun setWeightRange(race: Race) {
        setupSeekBar(
            weightSeekBar,
            weightTextView,
            race.minWeight,
            race.maxWeight,
            step = 5,
        )
    }

    // Ustawianie zakresu dla wzrostu
    private fun setHeightRange(race: Race, sex: String) {
        val minHeight = calculateMinHeight(race, sex)
        setupSeekBar(
            heightSeekBar,
            heightTextView,
            minHeight,
            minHeight + 20,
            step = 1,
        )
    }

    // Obliczanie minimalnego wzrostu na podstawie rasy i płci
    private fun calculateMinHeight(race: Race, sex: String): Int {
        var minHeight = race.minHeight
        if (sex == FEMALE) {
            minHeight -= 10
            if (race.name.lowercase().contains("krasnolud")) {
                minHeight -= 5
            }
        }
        return minHeight
    }

    // Pobieranie listy znaków zodiaku
    private fun getStarSignsList(): List<StarSign> {
        return AllStarSigns.All
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("selectedRaceName", selectedRace.name)
        outState.putString("selectedSex", selectedSex)
        outState.putString("selectedHairColor", hairTextView.text.toString())
        outState.putString("selectedEyesColor", eyesTextView.text.toString())
        outState.putString("selectedStarSignName", selectedStarSign.name)
        outState.putInt("ageProgress", ageSeekBar.progress)
        outState.putInt("heightProgress", heightSeekBar.progress)
        outState.putInt("weightProgress", weightSeekBar.progress)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val savedRaceName = savedInstanceState.getString("selectedRaceName")
        val savedSex = savedInstanceState.getString("selectedSex")
        val savedHairColor = savedInstanceState.getString("selectedHairColor")
        val savedEyesColor = savedInstanceState.getString("selectedEyesColor")
        val savedStarSignName = savedInstanceState.getString("selectedStarSignName")
        val savedAgeProgress = savedInstanceState.getInt("ageProgress")
        val savedHeightProgress = savedInstanceState.getInt("heightProgress")
        val savedWeightProgress = savedInstanceState.getInt("weightProgress")

        // Przywróć rasę
        val foundRace = GroupRace.All.find { it.name == savedRaceName }
        foundRace?.let {
            selectedRace = it
            raceTextView.text = savedRaceName
            setAgeRange(it)
            setWeightRange(it)
            setHeightRange(it, savedSex ?: MALE)
            updateAbilitiesAndSkills(it)

        }

        // Przywróć płeć
        selectedSex = savedSex ?: MALE
        sexTextView.text = selectedSex

        // Przywróć kolor włosów i oczu
        hairTextView.text = savedHairColor
        eyesTextView.text = savedEyesColor

        // Przywróć znak gwiezdny
        val foundStarSign = getStarSignsList().find { it.name == savedStarSignName }
        foundStarSign?.let {
            selectedStarSign = it
            starSignTextView.text = savedStarSignName
        }

        // Przywróć postęp SeekBarów
        ageSeekBar.progress = savedAgeProgress
        ageTextView.text = "${selectedRace.minAge + savedAgeProgress}"
        heightSeekBar.progress = savedHeightProgress
        heightTextView.text = "${calculateMinHeight(selectedRace, selectedSex) + savedHeightProgress}"
        weightSeekBar.progress = savedWeightProgress
        weightTextView.text = "${selectedRace.minWeight + savedWeightProgress* 5}"

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

            // Dodajemy optionalAbility tylko jeśli jest coś do dodania
            if (race.optionalAbility.isNotEmpty()) {
                if (isNotEmpty) append(", ") // Dodaj przecinek, jeśli coś już było
                if (!isNotEmpty) append("Umiejętności rasowe: ") // Jeśli wcześniej nic nie było, dodajemy nagłówek
                append(race.optionalAbility.joinToString(", ") { group ->
                    AbilityGroupSimplifier.simplify(group) ?: group.joinToString(" lub ") { it.name }
                })
                isNotEmpty = true
            }

            // Jeśli nie dodano niczego, pozostawiamy "Brak"
            if (!isNotEmpty) {
                append("Brak umiejętności")
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

            // Dodajemy optionalSkills tylko jeśli jest coś do dodania
            if (race.optionalSkills.isNotEmpty()) {
                if (isNotEmpty) append(", ") // Dodaj przecinek, jeśli coś już było
                if (!isNotEmpty) append("Zdolności rasowe: ") // Jeśli wcześniej nic nie było, dodajemy nagłówek
                append(race.optionalSkills.joinToString(", ") { group ->
                    SkillsGroupSimplifier.simplify(group) ?: group.joinToString(" lub ") { it.name }
                })
                isNotEmpty = true
            }

            // Jeśli nie dodano niczego, pozostawiamy "Brak"
            if (!isNotEmpty) {
                append("Brak zdolności")
            }
        }
        skillsTextView.text = fullSkillsText.ifBlank { "Brak" }
    }

    // Zapisanie postaci do Firestore
    private fun saveCharacterToFirestore() {

        val race = raceTextView.text.toString()

        val characterData = hashMapOf(
            "name" to findViewById<EditText>(R.id.inputName).text.toString(),
            "race" to race,
            "age" to findViewById<TextView>(R.id.ageView).text.toString(),
            "sex" to sexTextView.text.toString(),
            "eyes" to eyesTextView.text.toString(),
            "hair" to hairTextView.text.toString(),
            "height" to findViewById<TextView>(R.id.heightView).text.toString(),
            "weight" to findViewById<TextView>(R.id.weightView).text.toString(),
            "placeOfBirth" to findViewById<EditText>(R.id.inputPlaceOfBirth).text.toString(),
            "starSign" to selectedStarSign.name,
            "specialSigns" to findViewById<EditText>(R.id.inputSpecialSigns).text.toString(),
            "createdAt" to FieldValue.serverTimestamp(),
            "lastActiveAt" to FieldValue.serverTimestamp(),
            "progressStage" to 1
        )

        if (userId.isEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać postaci", Toast.LENGTH_SHORT).show()
            return
        }

        db.collection("users").document(userId).collection("characters")
            .add(characterData)
            .addOnSuccessListener { documentReference ->
                val documentId = documentReference.id
                Toast.makeText(this, "Karta postaci zapisana!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, NewCardAttributesActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", documentId)
                    putExtra("CHARACTER_RACE", race)
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }
}