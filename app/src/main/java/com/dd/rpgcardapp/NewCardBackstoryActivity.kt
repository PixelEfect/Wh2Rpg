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
import com.dd.rpgcardapp.databinding.ActivityNewCardBackstoryBinding
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class NewCardBackstoryActivity : BaseActivity() {
    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private lateinit var binding: ActivityNewCardBackstoryBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewCardBackstoryBinding.inflate(layoutInflater)  // Binding dla aktywności
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")

        if (characterDocId == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
        }

        // Obsługa przycisku "Dalej"
        binding.nextButton.setOnClickListener {
            saveBackstoryToFirestore() // Wywołanie zapisu po kliknięciu
        }
        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // Obsługa przycisku "Wstecz"
        binding.backButton.setOnClickListener {
            val intent = Intent(this, NewCardAttributesActivity::class.java).apply {
                putExtra("CHARACTER_DOC_ID", characterDocId)  // Przekazanie characterDocId
                putExtra("CHARACTER_RACE", intent.getStringExtra("CHARACTER_RACE"))
            }
            startActivity(intent)
        }
        loadBackstoryData()
    }

    // Funkcja do pobierania danych z Firestore
    private fun loadBackstoryData() {
        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) return

        // Pobieranie danych z Firestore
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .collection("backstory").document("main_backstory")
            .get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val data = document.data
                    // Ustawienie pobranych danych w odpowiednich polach tekstowych
                    binding.inputStateOfHealth.setText(data?.get("stateOfHealth") as? String)
                    binding.inputFamily.setText(data?.get("family") as? String)
                    binding.inputHistory.setText(data?.get("history") as? String)
                    binding.inputAdditionalInformation.setText(data?.get("additionalInformation") as? String)
                } else {
                    Toast.makeText(this, "Nie znaleziono danych w bazie", Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd pobierania danych: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }

    private fun saveBackstoryToFirestore() {
        // Pobranie wartości z bindingu
        val backstoryData = hashMapOf(
            "stateOfHealth" to binding.inputStateOfHealth.text.toString(),
            "family" to binding.inputFamily.text.toString(),
            "history" to binding.inputHistory.text.toString(),
            "additionalInformation" to binding.inputAdditionalInformation.text.toString(),
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
