package com.dd.rpgcardapp

import BaseActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

// LoginActivity.kt
class LoginActivity : BaseActivity() {
    private lateinit var auth: FirebaseAuth  // Declare FirebaseAuth instance
    private lateinit var googleSignInClient: GoogleSignInClient  // Declare GoogleSignInClient instance

    // onCreate is called when the activity is first created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()  // Initialize Firebase Authentication

        val signInButton: Button = findViewById(R.id.signInButton)  // Find the sign-in button in the layout
        signInButton.setOnClickListener {
            // Trigger Google Sign-In when the button is clicked
            signInWithGoogle()
        }

        // Configure Google Sign-In
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))  // Ensure you have the correct client ID
            .requestEmail()  // Request user's email
            .build()

        googleSignInClient = GoogleSignIn.getClient(this, gso)  // Create GoogleSignInClient
    }

    // This method initiates the Google sign-in process
    private fun signInWithGoogle() {
        val signInIntent = googleSignInClient.signInIntent  // Get the sign-in intent
        startActivityForResult(signInIntent, RC_SIGN_IN)  // Start the sign-in activity
    }

    // Handle the result from the Google Sign-In activity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RC_SIGN_IN) {
            val task: Task<GoogleSignInAccount> = GoogleSignIn.getSignedInAccountFromIntent(data)  // Get the Google sign-in task
            handleSignInResult(task)  // Handle the sign-in result
        }
    }

    // This method processes the result of the Google sign-in
    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)  // Try to get the signed-in account
            firebaseAuthWithGoogle(account.idToken!!)  // Authenticate with Firebase using the Google ID token
        } catch (e: ApiException) {
            // Handle the error if sign-in fails
        }
    }

    // Authenticate with Firebase using the Google ID token
    private fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)  // Get the Firebase credential
        auth.signInWithCredential(credential)  // Sign in with the Google credential
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // If sign-in is successful, get the current user
                    val user = auth.currentUser
                    saveUserToFirestore(user?.email ?: "")  // Save the user's email to Firestore
                    startActivity(Intent(this, MainActivity::class.java))  // Navigate to MainActivity
                    finish()  // Finish the login activity
                } else {
                    // Handle error in login
                }
            }
    }

    // Save the user's email to Firestore when they sign in
    private fun saveUserToFirestore(email: String) {
        val db = Firebase.firestore  // Initialize Firestore
        val user = hashMapOf("email" to email)  // Create a user map with email
        db.collection("users").document(auth.currentUser!!.uid).set(user)  // Save the user document with the current user's UID
    }

    companion object {
        private const val RC_SIGN_IN = 9001  // Request code for Google Sign-In
    }
}