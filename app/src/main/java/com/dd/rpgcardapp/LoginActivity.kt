package com.dd.rpgcardapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.credentials.CredentialManager
import androidx.credentials.GetCredentialRequest
import androidx.credentials.exceptions.GetCredentialException
import com.dd.rpgcardapp.base.BaseActivity
import com.google.android.libraries.identity.googleid.GetGoogleIdOption
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

// Modern LoginActivity using Credential Manager API (recommended approach)
class LoginActivity : BaseActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var credentialManager: CredentialManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        enableTouchToHideKeyboardAndSystemUI()

        auth = FirebaseAuth.getInstance()
        credentialManager = CredentialManager.create(this)

        val signInButton: Button = findViewById(R.id.signInButton)
        signInButton.setOnClickListener {
            signInWithGoogle()
        }
    }

    private fun signInWithGoogle() {
        val googleIdOption = GetGoogleIdOption.Builder()
            .setFilterByAuthorizedAccounts(false)
            .setServerClientId(getString(R.string.default_web_client_id))
            .build()

        val request = GetCredentialRequest.Builder()
            .addCredentialOption(googleIdOption)
            .build()

        CoroutineScope(Dispatchers.Main).launch {
            try {
                val result = credentialManager.getCredential(
                    request = request,
                    context = this@LoginActivity,
                )
                handleSignIn(result)
            } catch (e: GetCredentialException) {
                Log.e("LoginActivity", "Sign-in failed", e)
                Toast.makeText(this@LoginActivity, "Sign-in failed", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private suspend fun handleSignIn(result: androidx.credentials.GetCredentialResponse) {
        when (val credential = result.credential) {
            is androidx.credentials.CustomCredential -> {
                if (credential.type == GoogleIdTokenCredential.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL) {
                    try {
                        val googleIdTokenCredential = GoogleIdTokenCredential.createFrom(credential.data)
                        firebaseAuthWithGoogle(googleIdTokenCredential.idToken)
                    } catch (e: GoogleIdTokenParsingException) {
                        Log.e("LoginActivity", "Invalid Google ID token", e)
                        withContext(Dispatchers.Main) {
                            Toast.makeText(this@LoginActivity, "Invalid Google ID token", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    Log.e("LoginActivity", "Unexpected credential type")
                    withContext(Dispatchers.Main) {
                        Toast.makeText(this@LoginActivity, "Unexpected credential type", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            else -> {
                Log.e("LoginActivity", "Unexpected credential type")
                withContext(Dispatchers.Main) {
                    Toast.makeText(this@LoginActivity, "Unexpected credential type", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private suspend fun firebaseAuthWithGoogle(idToken: String) {
        val credential = GoogleAuthProvider.getCredential(idToken, null)

        withContext(Dispatchers.Main) {
            auth.signInWithCredential(credential)
                .addOnCompleteListener(this@LoginActivity) { task ->
                    if (task.isSuccessful) {
                        val user = auth.currentUser
                        user?.let {
                            saveUserToFirestore(it.email ?: "")
                            startActivity(Intent(this@LoginActivity, HomeActivity::class.java))
                            finish()
                        }
                    } else {
                        Log.e("LoginActivity", "Firebase authentication failed", task.exception)
                        Toast.makeText(this@LoginActivity, "Authentication failed", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }

    private fun saveUserToFirestore(email: String) {
        val db = Firebase.firestore
        val user = hashMapOf("email" to email)
        auth.currentUser?.let { currentUser ->
            db.collection("users").document(currentUser.uid).set(user)
                .addOnSuccessListener {
                    Log.d("LoginActivity", "User saved to Firestore")
                }
                .addOnFailureListener { e ->
                    Log.e("LoginActivity", "Error saving user to Firestore", e)
                }
        }
    }
}