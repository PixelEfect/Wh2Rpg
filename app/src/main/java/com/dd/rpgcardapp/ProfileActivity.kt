package com.dd.rpgcardapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.databinding.ActivityProfileBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class ProfileActivity : BaseActivity() {
    private lateinit var binding: ActivityProfileBinding

    // onCreate is called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableTouchToHideKeyboardAndSystemUI()

        loadUserProfile()

        binding.exitButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }
    }

    private fun loadUserProfile() {
        val user = Firebase.auth.currentUser

        if (user != null) {
            val db = Firebase.firestore
            val userId = user.uid
            Log.d("ProfileActivity", "UserId in loadUserProfile: $userId")

            db.collection("users").document(userId).get()
                .addOnSuccessListener { document ->
                    if (document != null && document.exists()) {
                        val email = document.getString("email")
                        binding.emailTextView.text = email
                    }
                }
                .addOnFailureListener { exception ->
                    Toast.makeText(
                        this,
                        "Błąd pobierania danych profilu: ${exception.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                    binding.emailTextView.text = "Błąd"
                }
        } else {
            Toast.makeText(this, "Użytkownik nie jest zalogowany.", Toast.LENGTH_SHORT).show()
            binding.emailTextView.text = "Błąd"
        }

    }
}