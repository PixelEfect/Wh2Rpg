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

class NewCardAttributesActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card_attributes)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        val race = intent.getStringExtra("CHARACTER_RACE")

        if (characterDocId == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
        }
        setupAutoCalculation()

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
            val items = listOf("Nie kożystam z łaski", "Walka Wręcz", "Umiejętności Strzeleckie", "Krzepa", "Odporność", "Zręczność", "Inteligencja", "Siła Woli", "Ogłada") // Możesz podać tutaj własną listę opcji
            showPopupWindow(it, items) { selectedItem ->
                // Po wybraniu elementu, ustaw tekst w LaskaTextView
                laskaTextView.text = selectedItem
            }
        }

        val rollButton = findViewById<Button>(R.id.rollButton)
        rollButton.setOnClickListener {
            val raceName = intent.getStringExtra("CHARACTER_RACE")
            if (raceName != null) {
                val race = Races.getByName(raceName)
                race?.let {
                    fillAttributesFromRace(it)
                }
            } else {
                Toast.makeText(this, "Błąd: Brak informacji o rasie", Toast.LENGTH_SHORT).show()
            }
        }


        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            saveAttributesToFirestore() // Wywołanie zapisu po kliknięciu
        }
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    private fun fillAttributesFromRace(race: Race) {
        val random = java.util.Random()

        findViewById<EditText>(R.id.inputWW).setText((race.ww + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputUS).setText((race.us + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputK).setText((race.k + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputOdp).setText((race.odp + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputZr).setText((race.zr + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputInt).setText((race.int + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputSW).setText((race.sw + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputOgd).setText((race.ogd + random.nextInt(10) + random.nextInt(10) + 2).toString())
        findViewById<EditText>(R.id.inputA).setText(race.a.toString())
        findViewById<EditText>(R.id.inputŻyw).setText(rollZyw(race.zyw).toString())
        findViewById<EditText>(R.id.inputSz).setText(race.sz.toString())
        findViewById<EditText>(R.id.inputMag).setText(race.mag.toString())

        // PO i PP mogą być na start ustawione na 0 (chyba że masz inne zasady)
        findViewById<EditText>(R.id.inputPO).setText("0")
        findViewById<EditText>(R.id.inputPP).setText(rollPP(race.ppOptions).toString())
    }

    private fun saveAttributesToFirestore() {
        val k = findViewById<EditText>(R.id.inputK).text.toString().toIntOrNull() ?: 0
        val odp = findViewById<EditText>(R.id.inputOdp).text.toString().toIntOrNull() ?: 0
        val laskaOption = findViewById<TextView>(R.id.LaskaTextView).text.toString()

// Pobranie wartości z rasy
        val race = intent.getStringExtra("CHARACTER_RACE")?.let { Races.getByName(it) }
        val baseWW = race?.ww ?: 0
        val baseUS = race?.us ?: 0
        val baseK = race?.k ?: 0
        val baseOdp = race?.odp ?: 0
        val baseZr = race?.zr ?: 0
        val baseInt = race?.int ?: 0
        val baseSW = race?.sw ?: 0
        val baseOgd = race?.ogd ?: 0

        var wwToSave = findViewById<EditText>(R.id.inputWW).text.toString().toIntOrNull() ?: 0
        var usToSave = findViewById<EditText>(R.id.inputUS).text.toString().toIntOrNull() ?: 0
        var kToSave = findViewById<EditText>(R.id.inputK).text.toString().toIntOrNull() ?: 0
        var odpToSave = findViewById<EditText>(R.id.inputOdp).text.toString().toIntOrNull() ?: 0
        var zrToSave = findViewById<EditText>(R.id.inputZr).text.toString().toIntOrNull() ?: 0
        var intToSave = findViewById<EditText>(R.id.inputInt).text.toString().toIntOrNull() ?: 0
        var swToSave = findViewById<EditText>(R.id.inputSW).text.toString().toIntOrNull() ?: 0
        var ogdToSave = findViewById<EditText>(R.id.inputOgd).text.toString().toIntOrNull() ?: 0

        // Dla każdej opcji sprawdzamy, czy wartość wprowadzona przez użytkownika jest mniejsza niż ta z rasy + 11
        if (laskaOption == "Walka Wręcz" && wwToSave < (baseWW + 11)) {
            wwToSave = baseWW + 11
        }
        if (laskaOption == "Umiejętności Strzeleckie" && usToSave < (baseUS + 11)) {
            usToSave = baseUS + 11
        }
        if (laskaOption == "Krzepa" && kToSave < (baseK + 11)) {
            kToSave = baseK + 11
        }
        if (laskaOption == "Odporność" && odpToSave < (baseOdp + 11)) {
            odpToSave = baseOdp + 11
        }
        if (laskaOption == "Zręczność" && zrToSave < (baseZr + 11)) {
            zrToSave = baseZr + 11
        }
        if (laskaOption == "Inteligencja" && intToSave < (baseInt + 11)) {
            intToSave = baseInt + 11
        }
        if (laskaOption == "Siła Woli" && swToSave < (baseSW + 11)) {
            swToSave = baseSW + 11
        }
        if (laskaOption == "Ogłada" && ogdToSave < (baseOgd + 11)) {
            ogdToSave = baseOgd + 11
        }

        val s = kToSave / 10 // Zaokrąglanie w dół dla liczb całkowitych
        val wt = odpToSave / 10// To samo dla Wt


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
            "A" to (findViewById<EditText>(R.id.inputA).text.toString().toIntOrNull() ?: 0),
            "Żyw" to (findViewById<EditText>(R.id.inputŻyw).text.toString().toIntOrNull() ?: 0),
            "S" to s,
            "Wt" to wt,
            "Sz" to (findViewById<EditText>(R.id.inputSz).text.toString().toIntOrNull() ?: 0),
            "Mag" to (findViewById<EditText>(R.id.inputMag).text.toString().toIntOrNull() ?: 0),
            "PO" to (findViewById<EditText>(R.id.inputPO).text.toString().toIntOrNull() ?: 0),
            "PP" to (findViewById<EditText>(R.id.inputPP).text.toString().toIntOrNull() ?: 0)
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

    fun setupAutoCalculation() {
        val inputK = findViewById<EditText>(R.id.inputK)
        val inputOdp = findViewById<EditText>(R.id.inputOdp)
        val inputS = findViewById<EditText>(R.id.inputS)
        val inputWt = findViewById<EditText>(R.id.inputWt)

        val watcherK = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val k = inputK.text.toString().toIntOrNull() ?: 0
                inputS.setText((k / 10).toString()) // Aktualizuje tylko S
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        }

        val watcherOdp = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val odp = inputOdp.text.toString().toIntOrNull() ?: 0
                inputWt.setText((odp / 10).toString()) // Aktualizuje tylko Wt
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        }

        inputK.addTextChangedListener(watcherK)
        inputOdp.addTextChangedListener(watcherOdp)
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

