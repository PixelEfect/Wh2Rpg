package com.dd.rpgcardapp

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
import com.dd.rpgcardapp.base.BaseActivity
import com.dd.rpgcardapp.databinding.ActivityMyCardListBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MyCardListActivity : BaseActivity() {

    private lateinit var db: FirebaseFirestore
    private lateinit var userId: String
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
        val container = binding.buttonContainer
        container.removeAllViews()

        db.collection(getString(R.string.collection_users)).document(userId)
            .collection(getString(R.string.collection_characters))
            .whereGreaterThanOrEqualTo(getString(R.string.field_progress_stage), 5)
            .orderBy(getString(R.string.field_last_active_at), com.google.firebase.firestore.Query.Direction.DESCENDING)
            .get()
            .addOnSuccessListener { querySnapshot ->
                for (document in querySnapshot) {
                    val name = document.getString(getString(R.string.field_name)) ?: continue
                    val race = document.getString(getString(R.string.field_race)) ?: getString(R.string.default_race)
                    val documentId = document.id

                    db.collection(getString(R.string.collection_users)).document(userId)
                        .collection(getString(R.string.collection_characters)).document(documentId)
                        .collection(getString(R.string.collection_profession)).document(getString(R.string.document_owned))
                        .get()
                        .addOnSuccessListener { professionDoc ->
                            val professionName = professionDoc.getString(getString(R.string.field_profession_name)) ?: getString(R.string.default_profession)

                            val displayText = if (name.length > 20) {
                                name.substring(0, 17) + getString(R.string.text_truncate_suffix)
                            } else {
                                name
                            }

                            val fullDisplay = "$displayText\n${getString(R.string.race_label)} $race\n${getString(R.string.profession_label)} $professionName"

                            val button = Button(this).apply {
                                layoutParams = LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.WRAP_CONTENT
                                ).apply {
                                    setMargins(0, 16, 0, 16)
                                }

                                background = ContextCompat.getDrawable(this@MyCardListActivity, R.drawable.buttony)
                                setTextColor(Color.BLACK)
                                textSize = 16f
                                textAlignment = View.TEXT_ALIGNMENT_CENTER
                                isAllCaps = false
                                text = fullDisplay

                                gravity = Gravity.CENTER_VERTICAL or Gravity.CENTER_HORIZONTAL
                                setPadding(70, 70, 70, 70)
                                minHeight = 200
                                maxLines = 5
                            }

                            button.setOnClickListener {
                                db.collection(getString(R.string.collection_users)).document(userId)
                                    .collection(getString(R.string.collection_characters)).document(documentId)
                                    .update(getString(R.string.field_last_active_at), com.google.firebase.Timestamp.now())
                                    .addOnSuccessListener {
                                        Log.d(getString(R.string.log_tag_last_active), getString(R.string.log_last_active_updated, name))
                                    }
                                    .addOnFailureListener {
                                        Log.e(getString(R.string.log_tag_last_active), getString(R.string.log_last_active_error), it)
                                    }

                                val intent = Intent(this@MyCardListActivity, MyCardAttributesActivity::class.java)
                                intent.putExtra(getString(R.string.extra_character_doc_id), documentId)
                                intent.putExtra(getString(R.string.extra_character_race), race)
                                intent.putExtra(getString(R.string.extra_character_profession), professionName)
                                intent.putExtra(getString(R.string.extra_character_name), name)
                                startActivity(intent)
                            }
                            container.addView(button)
                        }
                        .addOnFailureListener {
                            Log.e(getString(R.string.log_tag_firestore), getString(R.string.log_profession_fetch_error, name), it)
                        }
                }

                if (querySnapshot.isEmpty) {
                    Toast.makeText(this, getString(R.string.no_cards_available), Toast.LENGTH_SHORT).show()
                }
            }
            .addOnFailureListener {
                Toast.makeText(this, getString(R.string.error_loading_characters, it.message), Toast.LENGTH_SHORT).show()
                Log.e(getString(R.string.log_tag_my_card_list), getString(R.string.log_characters_fetch_error), it)
            }
    }
}