package com.dd.rpgcardapp

import BaseActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class NewCardBackstoryActivity : BaseActivity() {
    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card_backstory)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")

        if (characterDocId == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
        }
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

        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            saveBackstoryToFirestore() // Wywołanie zapisu po kliknięciu
        }

        val exitButton = findViewById<Button>(R.id.exitButton)
        exitButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun saveBackstoryToFirestore() {

        // Pobranie wartości i konwersja do Int (lub 0, jeśli puste)
        val backstoryData = hashMapOf(
            "stateOfHealth" to findViewById<EditText>(R.id.inputStateOfHealth).text.toString(),
            "history" to findViewById<EditText>(R.id.inputHistory).text.toString(),
            "additionalInformation" to findViewById<EditText>(R.id.inputAdditionalInformation).text.toString(),
        )

        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

        // Zapis statystyk jako poddokument "backstory"
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("backstory").document("main_backstory")
            .set(backstoryData)
            .addOnSuccessListener {
                db.collection("users").document(userId)
                    .collection("characters").document(characterDocId!!)
                    .update("progressStage", 3)

                Toast.makeText(this, "Opisy zapisane!", Toast.LENGTH_SHORT).show()
                // Przejście do nowej aktywności z przekazaniem ID dokumentu postaci
                val intent = Intent(this, NewCardProfessionsActivity::class.java).apply {
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
}
