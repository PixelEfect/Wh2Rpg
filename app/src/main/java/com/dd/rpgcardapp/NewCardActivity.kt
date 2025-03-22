package com.dd.rpgcardapp

import BaseActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.content.Intent
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class NewCardActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_card)

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

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

    private fun saveCharacterToFirestore() {
        val name = findViewById<EditText>(R.id.inputName).text.toString()
        val race = findViewById<EditText>(R.id.inputRace).text.toString()
        val age = findViewById<EditText>(R.id.inputAge).text.toString()
        val sex = findViewById<EditText>(R.id.inputSex).text.toString()
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





















