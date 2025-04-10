package com.dd.rpgcardapp

import BaseActivity
import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import android.graphics.Color
import android.animation.ValueAnimator
import android.view.MotionEvent
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.core.animation.addListener
import kotlin.random.Random

//NIEWOLNIK !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! podobnie pielgrzymem moze zostac kazdy
//DODATKOWE ZAKLECIE
//TODO Profesje: ksiega zbawienia, ksiega spaczenia, kraina królowej lodu, mroczni wladcy nocy, poradnik staroswiatowca, królestwa renegatów
// Duch przodka - ksiega zbawienia 81,

class MainActivity : BaseActivity() {
    private lateinit var auth: FirebaseAuth  // Firebase Authentication instance
    private val runes = listOf(
        "ᚠ", "ᚢ", "ᚦ", "ᚨ", "ᛃ", "ᚱ", "ᛇ", "ᛈ", "ᛉ", "ᛋ",
        "ᛏ", "ᛒ", "ᛖ", "ᛗ", "ᛚ", "ᛝ", "ᛟ", "ᛞ", "ᛡ", "ᛣ",
        "ᛤ", "ᛥ", "ᛦ", "ᛧ", "ᛨ", "ᛩ", "ᛪ",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        auth = Firebase.auth  // Initialize Firebase Authentication
        val rootLayout = findViewById<RelativeLayout>(R.id.rootLayout) // Główny layout, zmieniony na RelativeLayout

        val startButton: Button = findViewById(R.id.startButton)

        // 🔹 Animacja zmiany koloru napisu
        val animator = ValueAnimator.ofArgb(Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW).apply {
            duration = 6000 // Pełna zmiana kolorów trwa 6 sekund
            repeatCount = ValueAnimator.INFINITE // Nieskończona pętla
            repeatMode = ValueAnimator.REVERSE // Animacja idzie w przód i w tył
            addUpdateListener { animation ->
                startButton.setTextColor(animation.animatedValue as Int)
            }
        }
        animator.start() // Uruchomienie animacji

        // 🔹 Obsługa kliknięcia przycisku
        startButton.setOnClickListener {
            checkUser()
        }

        // 🔹 Obsługa dotyku na całym ekranie
        rootLayout.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                createFlyingRunes(rootLayout)  // Wywołujemy bez współrzędnych dotyku
            }
            true
        }
    }

    // This method checks if the user is logged in
    private fun checkUser() {
        val user = auth.currentUser  // Get the current user from Firebase Authentication
        if (user != null) {
            // If the user is logged in, navigate to MainActivity
            startActivity(Intent(this, HomeActivity::class.java))
        } else {
            // If the user is not logged in, navigate to LoginActivity
            startActivity(Intent(this, LoginActivity::class.java))
        }
        finish()  // Finish this activity so the user cannot return to it
    }

    // Metoda do tworzenia animowanych run
    private fun createFlyingRunes(parent: RelativeLayout) {
        // Obliczamy współrzędne środka ekranu
        val screenWidth = parent.width
        val screenHeight = parent.height
        val startX = (screenWidth / 4)   // Środek ekranu, przesunięcie w lewo o 100px
        val startY = screenHeight / 2  // Środek ekranu w pionie

        repeat(3) { // Tworzymy 5 run
            val runeText = TextView(this).apply {
                text = runes.random() // Wybieramy losową runę
                textSize = 32f
                setTextColor(Color.WHITE)
                // Ustawiamy pozycję na podstawie obliczonego miejsca
                layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                setX(startX.toFloat())  // Ustawiamy startową pozycję X
                setY(startY.toFloat())  // Ustawiamy startową pozycję Y
            }

            parent.addView(runeText)

            // Animacja - losowy kierunek i efekt zanikania
            val moveX = PropertyValuesHolder.ofFloat("translationX", Random.nextInt(-1000, 1000).toFloat())
            val moveY = PropertyValuesHolder.ofFloat("translationY", Random.nextInt(-300, -100).toFloat())
            val fadeOut = PropertyValuesHolder.ofFloat("alpha", 1f, 0f)

            ObjectAnimator.ofPropertyValuesHolder(runeText, moveX, moveY, fadeOut).apply {
                duration = 2000 // 1 sekunda animacji
                addListener(onEnd = { parent.removeView(runeText) }) // Usuwamy runę po animacji
                start()
            }
        }
    }
}