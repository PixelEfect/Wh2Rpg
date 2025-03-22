package com.dd.rpgcardapp

import BaseActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class DescriptionFormActivity : BaseActivity() {
    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description_form)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")

        if (characterDocId == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
        }
        val nextButton = findViewById<Button>(R.id.nextButton)
        nextButton.setOnClickListener {
            saveDescriptionToFirestore() // Wywołanie zapisu po kliknięciu
        }
    }

    private fun saveDescriptionToFirestore() {

        // Pobranie wartości i konwersja do Int (lub 0, jeśli puste)
        val descriptionData = hashMapOf(
            "stateOfHealth" to findViewById<EditText>(R.id.inputStateOfHealth).text.toString(),
            "history" to findViewById<EditText>(R.id.inputHistory).text.toString(),
            "additionalInformation" to findViewById<EditText>(R.id.inputAdditionalInformation).text.toString(),
        )

        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

        // Zapis statystyk jako poddokument "stats"
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("description").document("main_description")
            .set(descriptionData)
            .addOnSuccessListener {
                Toast.makeText(this, "Opisy zapisane!", Toast.LENGTH_SHORT).show()
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
}
