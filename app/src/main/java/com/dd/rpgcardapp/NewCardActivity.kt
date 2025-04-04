package com.dd.rpgcardapp

import BaseActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import android.os.Build
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.TextView
import kotlin.reflect.full.memberProperties
import com.dd.rpgcardapp.data.Race
import com.dd.rpgcardapp.data.Races
import android.widget.AdapterView
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import com.dd.rpgcardapp.utils.SystemUIUtils

class NewCardActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String

    private lateinit var raceSpinner: Spinner
    private lateinit var ageSeekBar: SeekBar
    private lateinit var ageTextView: TextView
    private var selectedRace: Race = Races.Czlowiek

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Sprawdzamy wersję systemu operacyjnego
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            // Ukryj pasek statusu oraz pasek nawigacyjny
            val windowInsetsController = window.insetsController
            windowInsetsController?.hide(WindowInsets.Type.statusBars() or WindowInsets.Type.navigationBars())
            windowInsetsController?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_DEFAULT
        } else {
            // Dla starszych wersji Androida, używamy systemUiVisibility
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_IMMERSIVE)
        }

        SystemUIUtils.hideSystemUI(this)

        // Wyszukaj widżety
        raceSpinner = findViewById(R.id.inputRaceSpinner)
        ageSeekBar = findViewById(R.id.ageSeekBar)
        ageTextView = findViewById(R.id.ageView)

        raceSpinner.setOnTouchListener { v, event ->
            if (event.action == android.view.MotionEvent.ACTION_DOWN) {
                SystemUIUtils.hideSystemUI(this)
            }
            false // Zwróć false, aby event był kontynuowany
        }
        // Pobranie wszystkich właściwości typu Race z obiektu Races
        val races = Races::class.memberProperties
            .mapNotNull { it.getter.call(Races) as? Race }
        val raceNames = races.map { it.name }
        val raceAdapter = ArrayAdapter(this, R.layout.spinner_item_bold, raceNames)
        raceAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item_bold)
        raceSpinner.adapter = raceAdapter

        // Ustaw domyślną rasę (Człowiek) i zakres wieku
        setAgeRange(Races.Czlowiek)

        raceSpinner.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedRaceName = parent.getItemAtPosition(position).toString()
                SystemUIUtils.hideSystemUI(this@NewCardActivity)
                val selectedRace = races.find { it.name == selectedRaceName }
                selectedRace?.let {
                    this@NewCardActivity.selectedRace = it // Aktualizujemy wybraną rasę
                    setAgeRange(it) // Ustawiamy zakres wieku na podstawie wybranej rasy
                }
                SystemUIUtils.hideSystemUI(this@NewCardActivity)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Możesz obsłużyć przypadek, gdy nic nie jest wybrane.
            }
        })

        val sexSpinner = findViewById<Spinner>(R.id.inputSexSpinner)
        val sexOptions = listOf("Mężczyzna", "Kobieta")
        val sexAdapter = ArrayAdapter(this, R.layout.spinner_item_bold, sexOptions)
        sexAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item_bold)
        sexSpinner.adapter = sexAdapter

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            saveCharacterToFirestore()
        }

        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

    private fun setAgeRange(race: Race) {
        // Ustawienie zakresu wieku w SeekBar na podstawie rasy
        ageSeekBar.max = race.maxAge - race.minAge
        ageSeekBar.progress = race.minAge

        // Ustawienie domyślnego wieku
        ageTextView.text = "Wiek: ${race.minAge}"

        // Aktualizowanie tekstu wieku na bieżąco w zależności od suwaka
        ageSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                // Aktualizowanie wieku w TextView
                ageTextView.text = "Wiek: ${progress + race.minAge}"
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }

    private fun saveCharacterToFirestore() {
        val name = findViewById<EditText>(R.id.inputName).text.toString()
        val race = findViewById<Spinner>(R.id.inputRaceSpinner).selectedItem.toString()
        val age = ageSeekBar.progress + selectedRace.minAge
        val sex = findViewById<Spinner>(R.id.inputSexSpinner).selectedItem.toString()
        val eyes = findViewById<EditText>(R.id.inputEyes).text.toString()
        val hair = findViewById<EditText>(R.id.inputHair).text.toString()
        val growth = findViewById<EditText>(R.id.inputGrowth).text.toString()
        val weight = findViewById<EditText>(R.id.inputWeight).text.toString()
        val placeOfBirth = findViewById<EditText>(R.id.inputPlaceOfBirth).text.toString()
        val starSign = findViewById<EditText>(R.id.inputStarSign).text.toString()
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
        )

        if (userId.isEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać postaci", Toast.LENGTH_SHORT).show()
            return
        }

        db.collection("users").document(userId).collection("characters")
            .add(characterData)
            .addOnSuccessListener { documentReference ->
                val documentId = documentReference.id  // Pobranie ID nowego dokumentu

                Toast.makeText(this, "Karta postaci zapisana!", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, StatsFormActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", documentId)
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

}





















