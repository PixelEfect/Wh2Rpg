package com.dd.rpgcardapp

import BaseActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.graphics.Color
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.dd.rpgcardapp.databinding.ActivityMyCardListBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.dd.rpgcardapp.utils.SystemUIUtils

class UnfinishedCardsActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private lateinit var binding: ActivityMyCardListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCardListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        loadCharacters()

        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }

    private fun loadCharacters() {
        val container = findViewById<LinearLayout>(R.id.buttonContainer)
        container.removeAllViews()

        db.collection("users").document(userId)
            .collection("characters")
            .whereLessThanOrEqualTo("progressStage", 4)
            .orderBy("lastActiveAt", com.google.firebase.firestore.Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { querySnapshot ->
                for (document in querySnapshot) {
                    val name = document.getString("name") ?: continue
                    val race = document.getString("race") ?: "Brak rasy"
                    val lastActive = document.getTimestamp("lastActiveAt")
                    val progressStage = document.getLong("progressStage")?.toInt() ?: continue

                    val documentId = document.id

                    // Pobieramy professionName z subkolekcji
                    db.collection("users").document(userId)
                        .collection("characters").document(documentId)
                        .collection("profession").document("owned")
                        .get()
                        .addOnSuccessListener { professionDoc ->
                            val professionName = professionDoc.getString("professionName") ?: "Brak profesji"

                            val displayText = if (name.length > 20) {
                                name.substring(0, 17) + "..."
                            } else {
                                name
                            }

                            val fullDisplay = "$displayText\nRasa: $race\nProfesja: $professionName"

                            val button = Button(this).apply {
                                layoutParams = LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                                ).apply {
                                    setMargins(0, 16, 0, 16)
                                }

                                background = ContextCompat.getDrawable(this@UnfinishedCardsActivity, R.drawable.buttony)
                                setTextColor(Color.BLACK)
                                textSize = 16f
                                textAlignment = View.TEXT_ALIGNMENT_CENTER
                                isAllCaps = false
                                text = fullDisplay

                                gravity = Gravity.CENTER_VERTICAL or Gravity.CENTER_HORIZONTAL
                                setPadding(70, 70, 70, 70)  // większy padding góra/dół
                                minHeight = 200  // lub więcej, zależnie jak dużo tekstu
                                maxLines = 5     // jeśli chcesz ograniczyć
                            }
                            button.setOnClickListener {
                                when (progressStage) {
                                    1 -> {
                                        val intent = Intent(this@UnfinishedCardsActivity, NewCardAttributesActivity::class.java)
                                        intent.putExtra("CHARACTER_DOC_ID", documentId)  // Ustaw odpowiedni klucz
                                        intent.putExtra("CHARACTER_RACE", race)
                                        startActivity(intent)
                                    }
                                    2 -> {
                                        val intent = Intent(this@UnfinishedCardsActivity, NewCardBackstoryActivity::class.java)
                                        intent.putExtra("CHARACTER_DOC_ID", documentId)  // Ustaw odpowiedni klucz
                                        intent.putExtra("CHARACTER_RACE", race)
                                        startActivity(intent)
                                    }
                                    3 -> {
                                        val intent = Intent(this@UnfinishedCardsActivity, NewCardProfessionsActivity::class.java)
                                        intent.putExtra("CHARACTER_DOC_ID", documentId)  // Ustaw odpowiedni klucz
                                        intent.putExtra("CHARACTER_RACE", race)
                                        startActivity(intent)
                                    }
                                    4 -> {
                                        val intent = Intent(this@UnfinishedCardsActivity, NewCardSkillsAndAbilitiesActivity::class.java)
                                        intent.putExtra("CHARACTER_DOC_ID", documentId)  // Ustaw odpowiedni klucz
                                        intent.putExtra("CHARACTER_RACE", race)
                                        intent.putExtra("CHARACTER_PROFESSION", professionName)
                                        startActivity(intent)
                                    }
                                    else -> {
                                        Toast.makeText(this, "Nieobsługiwany etap postaci", Toast.LENGTH_SHORT).show()
                                    }
                                }
                            }
                            container.addView(button)
                        }
                        .addOnFailureListener {
                            Log.e("Firestore", "Nie udało się pobrać profession dla $name", it)
                        }
                }

                if (querySnapshot.isEmpty) {
                    Toast.makeText(this, "Brak dostępnych kart do wyświetlenia.", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener {
                Toast.makeText(this, "Błąd podczas ładowania postaci: ${it.message}", Toast.LENGTH_SHORT).show()
                Log.e("MyCardListActivity", "Błąd podczas pobierania postaci", it)
            }
    }




}