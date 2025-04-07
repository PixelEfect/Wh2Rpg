package com.dd.rpgcardapp

import BaseActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.PopupWindow
import android.widget.TextView
import android.widget.Toast
import com.dd.rpgcardapp.data.Race

import com.dd.rpgcardapp.data.Races
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.util.concurrent.ThreadLocalRandom

class NewCardAttributesActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var selectedGrace: String? = null
    private lateinit var race: Race
    private val randomStats = mutableMapOf<String, Int>()
    private val graceStats = mutableMapOf<String, Int>()
    private val manualStats = mutableMapOf<String, String>()

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
        setupAutoCalculation()
        setupManualInputTracking()

        getRaceFromIntent()?.let { foundRace ->
            race = foundRace
            updateAttributesWithGrace(race)
        } ?: run {
            // Obsłuż brak rasy (jeśli nie znaleziono)
            Toast.makeText(this, "Błąd: Brak informacji o rasie", Toast.LENGTH_SHORT).show()
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

        val laskaTextView = findViewById<TextView>(R.id.LaskaTextView)
        laskaTextView.setOnClickListener {
            val items = listOf("Nie korzystam z łaski", "Walka Wręcz", "Umiejętności Strzeleckie", "Krzepa", "Odporność", "Zręczność", "Inteligencja", "Siła Woli", "Ogłada")
            showPopupWindow(it, items) { selectedItem ->
                selectedGrace = selectedItem
                laskaTextView.text = selectedItem
                updateAttributesWithGrace(race) // <- teraz masz dostęp!
            }
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
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    private fun getRaceFromIntent(): Race? {
        val raceName = intent.getStringExtra("CHARACTER_RACE")
        return raceName?.let { Races.getByName(it) }
    }

    private fun updateAttributesWithGrace(race: Race) {
        val graceBonus = 11

        // Resetujemy graceStats
        graceStats.clear()

        // Aktualizujemy graceStats tylko dla wybranej Łaski
        when (selectedGrace) {
            "Walka Wręcz" -> graceStats["WW"] = race.ww + graceBonus
            "Umiejętności Strzeleckie" -> graceStats["US"] = race.us + graceBonus
            "Krzepa" -> graceStats["K"] = race.k + graceBonus
            "Odporność" -> graceStats["Odp"] = race.odp + graceBonus
            "Zręczność" -> graceStats["Zr"] = race.zr + graceBonus
            "Inteligencja" -> graceStats["Int"] = race.int + graceBonus
            "Siła Woli" -> graceStats["SW"] = race.sw + graceBonus
            "Ogłada" -> graceStats["Ogd"] = race.ogd + graceBonus
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
            val graceBonus = 11
            val baseValueWithBonus = (race.getStatByName(statKey) ?: 0) + graceBonus
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
        val editTexts = listOf(
            R.id.inputWW, R.id.inputUS, R.id.inputK, R.id.inputOdp,
            R.id.inputZr, R.id.inputInt, R.id.inputSW, R.id.inputOgd,
            R.id.inputA, R.id.inputZyw, R.id.inputSz, R.id.inputMag,
            R.id.inputPO, R.id.inputPP
        )

        for (id in editTexts) {
            val text = findViewById<EditText>(id).text.toString()
            if (text.isBlank()) {
                Toast.makeText(this, "Żadne z pól nie może być puste.", Toast.LENGTH_SHORT).show()
                return
            }
        }

        val wwToSave = findViewById<EditText>(R.id.inputWW).text.toString().toIntOrNull() ?: 0
        val usToSave = findViewById<EditText>(R.id.inputUS).text.toString().toIntOrNull() ?: 0
        val kToSave = findViewById<EditText>(R.id.inputK).text.toString().toIntOrNull() ?: 0
        val odpToSave = findViewById<EditText>(R.id.inputOdp).text.toString().toIntOrNull() ?: 0
        val zrToSave = findViewById<EditText>(R.id.inputZr).text.toString().toIntOrNull() ?: 0
        val intToSave = findViewById<EditText>(R.id.inputInt).text.toString().toIntOrNull() ?: 0
        val swToSave = findViewById<EditText>(R.id.inputSW).text.toString().toIntOrNull() ?: 0
        val ogdToSave = findViewById<EditText>(R.id.inputOgd).text.toString().toIntOrNull() ?: 0

        val aToSave = findViewById<EditText>(R.id.inputA).text.toString().toIntOrNull() ?: 0
        val zywToSave = findViewById<EditText>(R.id.inputZyw).text.toString().toIntOrNull() ?: 0
        val s = kToSave / 10 // Zaokrąglanie w dół dla liczb całkowitych
        val wt = odpToSave / 10// To samo dla Wt
        val szToSave = findViewById<EditText>(R.id.inputSz).text.toString().toIntOrNull() ?: 0
        val magToSave = findViewById<EditText>(R.id.inputMag).text.toString().toIntOrNull() ?: 0
        val poToSave = findViewById<EditText>(R.id.inputPO).text.toString().toIntOrNull() ?: 0
        val ppToSave = findViewById<EditText>(R.id.inputPP).text.toString().toIntOrNull() ?: 0

        // Sprawdzanie, czy łaska została wybrana
        if (selectedGrace.isNullOrEmpty()) {
            Toast.makeText(this, "Musisz wybrać łaskę.", Toast.LENGTH_SHORT).show()
            return
        }

        val firstEightStatsAndZyw = listOf(wwToSave, usToSave, kToSave, odpToSave, zrToSave, intToSave, swToSave, ogdToSave, zywToSave)
        for (stat in firstEightStatsAndZyw) {
            if (stat > 95) {
                Toast.makeText(this, "Wartości podstawowych statystyk oraz Żyw nie mogą przekraczać 95.", Toast.LENGTH_SHORT).show()
                return
            }
        }

        val remainingStats = listOf(aToSave, szToSave, magToSave, poToSave, ppToSave)
        for (stat in remainingStats) {
            if (stat > 10) {
                Toast.makeText(this, "Wartości drugorzędnych statystyk nie mogą przekraczać 10.", Toast.LENGTH_SHORT).show()
                return
            }
        }

        // Pobranie wartości i konwersja do Int (lub 0, jeśli puste)
        val attributesData = hashMapOf(
            "WW" to wwToSave,
            "US" to usToSave,
            "K" to kToSave,
            "Odp" to odpToSave,
            "Zr" to zrToSave,
            "Int" to intToSave,
            "SW" to swToSave,
            "Ogd" to ogdToSave,
            "A" to aToSave,
            "Zyw" to zywToSave,
            "S" to s,
            "Wt" to wt,
            "Sz" to szToSave,
            "Mag" to magToSave,
            "PO" to poToSave,
            "PP" to ppToSave
        )

        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

        // Zapis statystyk jako poddokument "attributes"
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("attributes").document("main_attributes")
            .set(attributesData)
            .addOnSuccessListener {
                db.collection("users").document(userId)
                    .collection("characters").document(characterDocId!!)
                    .update("progressStage", 2)

                Toast.makeText(this, "Statystyki zapisane!", Toast.LENGTH_SHORT).show()
                // Przejście do nowej aktywności z przekazaniem ID dokumentu postaci
                val intent = Intent(this, NewCardBackstoryActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                    putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
            }

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
            // Tutaj możesz ukrywać systemowe UI, jeśli chcesz
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

}

