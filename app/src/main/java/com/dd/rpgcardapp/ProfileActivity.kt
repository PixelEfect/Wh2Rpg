package com.dd.rpgcardapp

import BaseActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class ProfileActivity : BaseActivity() {

    // onCreate is called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Get the current user from Firebase Authentication
        val user = Firebase.auth.currentUser

        // Check if a user is logged in
        if (user != null) {
            val db = Firebase.firestore  // Initialize Firestore database instance
            val userId = user.uid  // Get the user's unique ID
            Log.d("ProfileActivity", "UserId in onCreate: $userId")

            // Try to fetch the user document from Firestore using the userId
            db.collection("users").document(userId).get().addOnSuccessListener { document ->
                if (document != null && document.exists()) {
                    // If the document exists, retrieve the email and display it
                    val email = document.getString("email")
                    findViewById<TextView>(R.id.emailTextView).text = email
                }
            }.addOnFailureListener { exception ->
                // Handle the case where fetching the document fails
                Toast.makeText(this, "Błąd pobierania danych profilu: ${exception.message}", Toast.LENGTH_SHORT).show()
                findViewById<TextView>(R.id.emailTextView).text = "Błąd"  // Show error message in the TextView
            }
        } else {
            // If the user is not logged in, display an error message
            Toast.makeText(this, "Użytkownik nie jest zalogowany.", Toast.LENGTH_SHORT).show()
            findViewById<TextView>(R.id.emailTextView).text = "Błąd"  // Update TextView with error
        }
    }
}