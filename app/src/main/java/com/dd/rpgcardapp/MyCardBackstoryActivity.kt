package com.dd.rpgcardapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.databinding.ActivityMyCardBackstoryBinding
import com.dd.rpgcardapp.utils.SystemUIUtils
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MyCardBackstoryActivity : BaseActivity() {
    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
    private var characterDocId: String? = null
    private var characterRace: String? = null
    private var characterProfession: String? = null
    private var characterName: String? = null
    private lateinit var binding: ActivityMyCardBackstoryBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyCardBackstoryBinding.inflate(layoutInflater)  // Binding dla aktywności
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        db = Firebase.firestore
        userId = Firebase.auth.currentUser?.uid ?: ""

        // Pobierz ID dokumentu postaci
        characterDocId = intent.getStringExtra("CHARACTER_DOC_ID")
        characterRace = intent.getStringExtra("CHARACTER_RACE")
        characterProfession = intent.getStringExtra("CHARACTER_PROFESSION")
        characterName = intent.getStringExtra("CHARACTER_NAME")

        if (characterDocId == null) {
            Toast.makeText(this, "Błąd: Brak ID postaci", Toast.LENGTH_SHORT).show()
            finish()
        }
        binding.nameView.text = characterName ?: "Brak imienia"
        setupUIToHideKeyboard(binding.root)

        binding.nextButton.setOnClickListener {
            saveBackstoryToFirestore()
            saveCharacerToFirestore()
            val intent = Intent(this@MyCardBackstoryActivity,
                MyCardAttributesActivity::class.java)
            intent.putExtra("CHARACTER_DOC_ID", characterDocId)  // Ustaw odpowiedni klucz
            intent.putExtra("CHARACTER_RACE", characterRace)
            intent.putExtra("CHARACTER_PROFESSION", characterProfession)
            intent.putExtra("CHARACTER_NAME", characterName)
            startActivity(intent)
        }
        binding.exitButton.setOnClickListener {
            saveBackstoryToFirestore()
            saveCharacerToFirestore()
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
        loadCharacterData()
    }

    @SuppressLint("ClickableViewAccessibility")
    fun setupUIToHideKeyboard(view: View) {
        // Jeśli to nie jest EditText – dodaj listener do chowania klawiatury
        if (view !is EditText) {
            view.setOnTouchListener { _, _ ->
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                currentFocus?.let {
                    imm.hideSoftInputFromWindow(it.windowToken, 0)
                    it.clearFocus()
                }
                SystemUIUtils.hideSystemUI(this)
                false
            }
        }

        // Jeśli to jest ViewGroup – przejdź rekurencyjnie po dzieciach
        if (view is ViewGroup) {
            for (i in 0 until view.childCount) {
                setupUIToHideKeyboard(view.getChildAt(i))
            }
        }
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

    private fun loadCharacterData() {
        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) return

        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .get()
            .addOnSuccessListener { document ->
                if (document.exists()) {
                    val data = document.data
                    // Dodane pola
                    binding.inputPlaceOfBirth.setText(data?.get("placeOfBirth") as? String)
                    binding.inputSpecialSigns.setText(data?.get("specialSigns") as? String)
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
            .set(backstoryData, SetOptions.merge())
            .addOnSuccessListener {
            }
            .addOnFailureListener {
            }
    }

    private fun saveCharacerToFirestore() {
        // Pobranie wartości z bindingu
        val characterData = hashMapOf(
            "placeOfBirth" to binding.inputPlaceOfBirth.text.toString(),
            "specialSigns" to binding.inputSpecialSigns.text.toString(),
        )

        if (userId.isEmpty() || characterDocId.isNullOrEmpty()) {
            Toast.makeText(this, "Błąd: Nie można zapisać statystyk", Toast.LENGTH_SHORT).show()
            return
        }

        // Zapis statystyk jako poddokument "backstory"
        db.collection("users").document(userId)
            .collection("characters").document(characterDocId!!)
            .set(characterData, SetOptions.merge())
            .addOnSuccessListener {
                Toast.makeText(this, "Opisy zapisane!", Toast.LENGTH_SHORT).show()
            }
            .addOnFailureListener { e ->
                Toast.makeText(this, "Błąd zapisu: ${e.message}", Toast.LENGTH_SHORT).show()
            }
    }


}
