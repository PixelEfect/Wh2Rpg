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
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.PopupWindow
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import android.widget.SeekBar
import com.dd.rpgcardapp.data.AllStarSigns
import com.dd.rpgcardapp.data.Race
import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.data.GroupRace
import com.dd.rpgcardapp.data.StarSign
import com.dd.rpgcardapp.data.StarSigns
import com.dd.rpgcardapp.utils.SystemUIUtils
import android.content.Context
import android.view.inputmethod.InputMethodManager
import com.dd.rpgcardapp.data.Eyes
import com.dd.rpgcardapp.data.Hair

class NewCardAncestryActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String

    private lateinit var raceTextView: TextView
    private lateinit var ageSeekBar: SeekBar
    private lateinit var ageTextView: TextView
    private lateinit var sexTextView: TextView
    private lateinit var hairTextView: TextView
    private lateinit var eyesTextView: TextView
    private lateinit var heightSeekBar: SeekBar
    private lateinit var heightTextView: TextView
    private lateinit var weightSeekBar: SeekBar
    private lateinit var weightTextView: TextView
    private lateinit var starSignTextView: TextView

    companion object {
        const val MALE = "Mężczyzna"
        const val FEMALE = "Kobieta"
    }

    private var selectedRace: Race = Races.Czlowiek
    private var selectedSex: String = MALE // Domyślna płeć
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
        hairTextView = findViewById(R.id.inputHairTextView)
        eyesTextView = findViewById(R.id.inputEyesTextView)
        heightSeekBar = findViewById(R.id.heightSeekBar)
        heightTextView = findViewById(R.id.heightView)
        weightSeekBar = findViewById(R.id.weightSeekBar)
        weightTextView = findViewById(R.id.weightView)
        starSignTextView = findViewById(R.id.inputStarSignTextView)

        // Ustaw domyślną rasę (Człowiek) i zakres wieku
        setAgeRange(Races.Czlowiek)
        setWeightRange(Races.Czlowiek)

        raceTextView.text = Races.Czlowiek.name
        selectedSex = MALE
        sexTextView.text = selectedSex
        starSignTextView.text = "${selectedStarSign.name}"
        setHeightRange(Races.Czlowiek, selectedSex)

        val defaultHairColor = Hair.brazowy.name
        val defaultEyesColor = Eyes.brazowy.name

        hairTextView.text = defaultHairColor
        eyesTextView.text = defaultEyesColor

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


        raceTextView.setOnClickListener { v ->
            showPopupWindow(v, GroupRace.All.map { it.name }) { selectedRaceName ->
                val foundRace = GroupRace.All.find { it.name == selectedRaceName }
                foundRace?.let {
                    selectedRace = it
                    raceTextView.text = selectedRaceName
                    setAgeRange(it)
                    setWeightRange(it)
                    hairTextView.text = it.hair.first().name
                    eyesTextView.text = it.eyes.first().name
                    setHeightRange(it, selectedSex)
                }
            }
        }

        sexTextView.setOnClickListener { v ->
            showPopupWindow(v, listOf(MALE, FEMALE)) { selectedSexValue ->
                selectedSex = selectedSexValue // Zmieniamy zmienną `selectedSex`
                sexTextView.text = selectedSex  // Aktualizujemy tekst w TextView
                setHeightRange(selectedRace, selectedSex)
            }
        }

        hairTextView.setOnClickListener { v ->
            showPopupWindow(v, selectedRace.hair.map { it.name }) { selectedHairColor ->
                hairTextView.text = selectedHairColor
            }
        }

        eyesTextView.setOnClickListener { v ->
            showPopupWindow(v, selectedRace.eyes.map { it.name }) { selectedeyesColor ->
                eyesTextView.text = selectedeyesColor
            }
        }

        starSignTextView.setOnClickListener { v ->
            showPopupWindow(v, getStarSignsList().map { it.name }) { selectedStarSignName ->
                val foundStarSign = getStarSignsList().find { it.name == selectedStarSignName }
                foundStarSign?.let {
                    selectedStarSign = it
                    starSignTextView.text = "$selectedStarSignName"
                }
            }
        }

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            // Pobieranie wartości z pola tekstowego imienia
            val name = findViewById<EditText>(R.id.inputName).text.toString()

            // Walidacja imienia
            if (name.isBlank()) {
                // Jeśli imię jest puste, wyświetlamy Toast z komunikatem o błędzie
                Toast.makeText(this, "Imię nie może być puste!", Toast.LENGTH_SHORT).show()
            } else {
                // Jeśli imię nie jest puste, zapisujemy postać do Firestore
                saveCharacterToFirestore()
            }
        }

        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    // Wspólna funkcja do ustawiania SeekBar dla wieku, wagi, wzrostu
    private fun setupSeekBar(
        seekBar: SeekBar,
        textView: TextView,
        minValue: Int,
        maxValue: Int,
        step: Int = 1,
        labelPrefix: String
    ) {
        seekBar.max = (maxValue - minValue) / step
        seekBar.progress = 0
        textView.text = "$labelPrefix: $minValue"

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                val value = minValue + progress * step
                textView.text = "$labelPrefix: $value"
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
            labelPrefix = "Wiek"
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
            labelPrefix = "Waga"
        )
    }

    // Ustawianie zakresu dla wzrostu
    private fun setHeightRange(race: Race, sex: String) {
        setupSeekBar(
            heightSeekBar,
            heightTextView,
            race.minHeight,
            race.minHeight + 20,
            step = 1,
            labelPrefix = "Wzrost"
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

    // Funkcja do wyświetlania PopupWindow z listą do wyboru
    private fun showPopupWindow(view: View, items: List<String>, onItemSelected: (String) -> Unit) {
        val context = this
        val listView = ListView(context)
        val adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter

        // Tworzenie PopupWindow
        val popupWindow = PopupWindow(listView, WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT)
        popupWindow.isFocusable = true
        popupWindow.setBackgroundDrawable(getDrawable(android.R.drawable.screen_background_light))

        // Ukrywanie systemowego UI, jak pasek stanu
        popupWindow.setOnDismissListener {
            SystemUIUtils.hideSystemUI(this)
        }

        // Obsługa kliknięcia na element w liście
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = items[position]
            onItemSelected(selectedItem) // Wywołanie funkcji zwrotnej z wybranym elementem
            popupWindow.dismiss() // Zamknięcie PopupWindow po wyborze
        }

        // Wyświetlanie PopupWindow
        popupWindow.showAsDropDown(view)

        view.postDelayed({
            SystemUIUtils.hideSystemUI(this)
        }, 1)
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
            setHeightRange(it, savedSex ?: MALE) // Użyj domyślnej płci, jeśli nie zapisano
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
        ageTextView.text = "Wiek: ${selectedRace.minAge + savedAgeProgress}"
        heightSeekBar.progress = savedHeightProgress
        heightTextView.text = "Wzrost: ${calculateMinHeight(selectedRace, selectedSex) + savedHeightProgress}"
        weightSeekBar.progress = savedWeightProgress
        weightTextView.text = "Waga: ${selectedRace.minWeight + savedWeightProgress}"
    }

    // Zapisanie postaci do Firestore
    private fun saveCharacterToFirestore() {
        val name = findViewById<EditText>(R.id.inputName).text.toString()
        val race = raceTextView.text.toString()
        val age = ageSeekBar.progress + selectedRace.minAge
        val sex = sexTextView.text.toString()
        val eyes = eyesTextView.text.toString()
        val hair = hairTextView.text.toString()
        val growth = heightSeekBar.progress + calculateMinHeight(selectedRace, selectedSex)
        val weight = weightSeekBar.progress + selectedRace.minWeight
        val placeOfBirth = findViewById<EditText>(R.id.inputPlaceOfBirth).text.toString()
        val starSign = selectedStarSign.name
        val specialSigns = findViewById<EditText>(R.id.inputSpecialSigns).text.toString()
        val family = findViewById<EditText>(R.id.inputFamily).text.toString()
        val createdAt = FieldValue.serverTimestamp()

        val characterData = hashMapOf(
            "name" to name,
            "race" to race,
            "age" to age,
            "sex" to sex,
            "eyes" to eyes,
            "hair" to hair,
            "growth" to growth,
            "weight" to weight,
            "placeOfBirth" to placeOfBirth,
            "starSign" to starSign,
            "specialSigns" to specialSigns,
            "family" to family,
            "createdAt" to createdAt,
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