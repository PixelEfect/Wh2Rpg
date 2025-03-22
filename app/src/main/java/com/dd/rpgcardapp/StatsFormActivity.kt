package com.dd.rpgcardapp

import BaseActivity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class StatsFormActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats_form)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")

        if (characterDocId == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
        }
        setupAutoCalculation()

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            saveStatsToFirestore() // Wywołanie zapisu po kliknięciu
        }
    }

    private fun saveStatsToFirestore() {
        val k = findViewById<EditText>(R.id.inputK).text.toString().toIntOrNull() ?: 0
        val odp = findViewById<EditText>(R.id.inputOdp).text.toString().toIntOrNull() ?: 0

        val s = k / 10 // Zaokrąglanie w dół dla liczb całkowitych
        val wt = odp / 10 // To samo dla Wt

        // Pobranie wartości i konwersja do Int (lub 0, jeśli puste)
        val statsData = hashMapOf(
            "WW" to (findViewById<EditText>(R.id.inputWW).text.toString().toIntOrNull() ?: 0),
            "US" to (findViewById<EditText>(R.id.inputUS).text.toString().toIntOrNull() ?: 0),
            "K" to k,
            "Odp" to odp,
            "Zr" to (findViewById<EditText>(R.id.inputZr).text.toString().toIntOrNull() ?: 0),
            "Int" to (findViewById<EditText>(R.id.inputInt).text.toString().toIntOrNull() ?: 0),
            "SW" to (findViewById<EditText>(R.id.inputSW).text.toString().toIntOrNull() ?: 0),
            "Ogd" to (findViewById<EditText>(R.id.inputOgd).text.toString().toIntOrNull() ?: 0),
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

        // Zapis statystyk jako poddokument "stats"
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("stats").document("main_stats")
            .set(statsData)
            .addOnSuccessListener {
                Toast.makeText(this, "Statystyki zapisane!", Toast.LENGTH_SHORT).show()
                // Przejście do nowej aktywności z przekazaniem ID dokumentu postaci
                val intent = Intent(this, DescriptionFormActivity::class.java).apply {
                    putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                }
                startActivity(intent)
                finish()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
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
}

