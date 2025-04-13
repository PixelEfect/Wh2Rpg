package com.dd.rpgcardapp

import BaseActivity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

// MainActivity.kt
class HomeActivity : BaseActivity() {

    // onCreate is called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Set an onClickListener for the logout button
        findViewById<Button>(R.id.logoutButton).setOnClickListener {
            // Sign out the user from Firebase Authentication
            Firebase.auth.signOut()

            // Start the LoginActivity after logging out
            startActivity(Intent(this, LoginActivity::class.java))

            // Finish the current activity so that the user can't go back to this screen
            finish()
        }

        findViewById<Button>(R.id.profileButton).setOnClickListener {
            // Start the ProfileActivity when the profile button is clicked
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        findViewById<Button>(R.id.myCardButton).setOnClickListener {
            // Start the ProfileActivity when the profile button is clicked
            startActivity(Intent(this, MyCardListActivity::class.java))
        }
        findViewById<Button>(R.id.unfinishedCardsButton).setOnClickListener {
            // Start the ProfileActivity when the profile button is clicked
            startActivity(Intent(this, UnfinishedCardsActivity::class.java))
        }

        findViewById<Button>(R.id.addCharacterButton).setOnClickListener {
            startActivity(Intent(this, NewCardAncestryActivity::class.java))
        }
        findViewById<Button>(R.id.testButton).setOnClickListener {
            startActivity(Intent(this, ProfessionsConsistencyChecker::class.java))
        }
    }

    // onStart is called when the activity is about to become visible
    override fun onStart() {
        super.onStart()

        val user = Firebase.auth.currentUser

        // Check if the user is logged in
        if (user == null) {
            // If the user is not logged in, start the LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
            return
        }

        val userId = user.uid  // Get the user's unique ID
        val db = Firebase.firestore  // Initialize Firestore database instance

        // Try to fetch the user document from Firestore using the userId
        db.collection("users").document(userId).get().addOnSuccessListener { document ->
            if (document != null && document.exists()) {
                // If the document exists, do nothing, user's profile is already created
                Log.d("MainActivity", "User profile already exists.")
            } else {
                // If the document doesn't exist, create a new profile for the user
                createProfile(userId)
            }
        }.addOnFailureListener { exception ->
            // Handle the case where fetching the document fails
            Toast.makeText(this, "Błąd pobierania danych profilu: ${exception.message}", Toast.LENGTH_SHORT).show()
        }
    }

    // This method is used to create a new profile for the user
    private fun createProfile(userId: String) {
        val db = Firebase.firestore  // Initialize Firestore database instance
        val email = Firebase.auth.currentUser?.email  // Get the user's email from Firebase Authentication

        // Check if the email is not null (user is logged in)
        if (email != null) {
            // Create a new user object with the email
            val user = hashMapOf("email" to email)

            // Try to add the new profile to Firestore
            db.collection("users").document(userId).set(user).addOnSuccessListener {
                // If successful, show a toast message
                Toast.makeText(this, "Utworzono profil.", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener { exception ->
                // If the creation fails, show an error message
                Toast.makeText(this, "Błąd tworzenia profilu: ${exception.message}", Toast.LENGTH_SHORT).show()
            }
        } else {
            // If the email is null, it means the user is not logged in
            Toast.makeText(this, "Użytkownik nie jest zalogowany.", Toast.LENGTH_SHORT).show()
        }
    }
}
