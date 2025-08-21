package com.dd.rpgcardapp

import android.animation.ObjectAnimator
import android.animation.PropertyValuesHolder
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import android.graphics.Color
import android.animation.ValueAnimator
import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.widget.RelativeLayout
import androidx.core.animation.addListener
import androidx.core.content.ContextCompat
import kotlin.random.Random
import androidx.core.graphics.toColorInt
import com.dd.rpgcardapp.base.BaseActivity

class MainActivity : BaseActivity() {
    private lateinit var auth: FirebaseAuth  // Firebase Authentication instance
    private val runes = listOf(
        "ᚠ", "ᚢ", "ᚦ", "ᚨ", "ᛃ", "ᚱ", "ᛇ", "ᛈ", "ᛉ", "ᛋ",
        "ᛏ", "ᛒ", "ᛖ", "ᛗ", "ᛚ", "ᛝ", "ᛟ", "ᛞ", "ᛡ", "ᛣ",
        "ᛤ", "ᛥ", "ᛦ", "ᛧ", "ᛨ", "ᛩ", "ᛪ",
    )
    val blueColors = listOf(
        Color.argb(255, 173, 216, 230), // Light Blue
        Color.argb(255, 135, 206, 250), // Sky Blue
        Color.argb(255, 0, 191, 255),   // Deep Sky Blue
        Color.argb(255, 176, 224, 230), // Powder Blue
        Color.argb(255, 240, 248, 255), // Alice Blue
        Color.argb(255, 70, 130, 180),  // Steel Blue
        Color.argb(255, 135, 206, 235), // Light Sky Blue
        Color.argb(255, 224, 255, 255), // Light Cyan
        Color.argb(255, 0, 255, 255),   // Aqua
        Color.argb(255, 64, 224, 208)   // Turquoise
    )

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        enableTouchToHideKeyboardAndSystemUI()

        auth = Firebase.auth  // Initialize Firebase Authentication
        val rootLayout = findViewById<RelativeLayout>(R.id.rootLayout)
        val option = Random.nextInt(7)
        val backgroundImage = when (option) {
            0 -> R.drawable.welcome_0001
            1 -> R.drawable.welcome_0002
            2 -> R.drawable.welcome_0003
            3 -> R.drawable.welcome_0004
            4 -> R.drawable.welcome_0005
            5 -> R.drawable.welcome_0006
            6 -> R.drawable.welcome_0007
            else -> R.drawable.welcome_0001
        }

        rootLayout.setBackgroundResource(backgroundImage)

        val startButton: Button = findViewById(R.id.startButton)

        val animator = ValueAnimator.ofArgb(Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW).apply {
            duration = 6000
            repeatCount = ValueAnimator.INFINITE
            repeatMode = ValueAnimator.REVERSE
            addUpdateListener { animation ->
                startButton.setTextColor(animation.animatedValue as Int)
            }
        }
        animator.start()

        startButton.setOnClickListener {
            checkUser()
        }
        rootLayout.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                when (option) {
                    0 -> createFlyingRunes(rootLayout)
                    1 -> createFlyingLights(rootLayout)
                    2 -> createSparks(rootLayout)
                    3 -> createRisingSmoke(rootLayout)
                }
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


    private fun createFlyingRunes(parent: RelativeLayout) {

        val screenWidth = parent.width
        val screenHeight = parent.height
        val startX = (screenWidth * 7  / 19)
        val startY = (screenHeight * 11) / 19

        repeat(3) {
            val runeText = TextView(this).apply {
                text = runes.random()
                textSize = 32f
                setTextColor(blueColors.random())

                layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
                x = startX.toFloat()
                y = startY.toFloat()
            }

            parent.addView(runeText)

            val moveX = PropertyValuesHolder.ofFloat("translationX", runeText.x, runeText.x + Random.nextInt(-1000, 1000).toFloat())
            val moveY = PropertyValuesHolder.ofFloat("translationY", Random.nextInt(-300, -100).toFloat())
            val fadeOut = PropertyValuesHolder.ofFloat("alpha", 1f, 0f)

            ObjectAnimator.ofPropertyValuesHolder(runeText, moveX, moveY, fadeOut).apply {
                duration = 2000
                addListener(onEnd = { parent.removeView(runeText) })
                start()
            }
        }
    }
    private fun createFlyingLights(parent: RelativeLayout) {
        val screenWidth = parent.width
        val screenHeight = parent.height

        val baseY = screenHeight * 7 / 19
        val yLevels = listOf(
            baseY, baseY, baseY,
            baseY - screenHeight / 30,
            baseY - screenHeight / 20,
            baseY - screenHeight / 15,
            baseY - (screenHeight / 10)
        )

        repeat(50) {
            val light = View(parent.context).apply {
                setBackgroundColor(blueColors.random())
                val size = Random.nextInt(1, 10)
                layoutParams = ViewGroup.LayoutParams(size, size)

                val startX = screenWidth / 4
                val startY = yLevels.random()

                x = startX.toFloat()
                y = startY.toFloat()
            }

            parent.addView(light)

            val moveX = PropertyValuesHolder.ofFloat("translationX", light.x, light.x + Random.nextInt(-500, 500).toFloat())
            val moveY = PropertyValuesHolder.ofFloat("translationY", light.y, light.y + Random.nextInt(-500, 500).toFloat())
            val fadeOut = PropertyValuesHolder.ofFloat("alpha", 1f, 0f)

            ObjectAnimator.ofPropertyValuesHolder(light, moveX, moveY, fadeOut).apply {
                duration = Random.nextLong(2000, 4000)
                addListener(onEnd = { parent.removeView(light) })
                start()
            }
        }
    }


    private fun createRisingSmoke(parent: RelativeLayout) {
        val screenWidth = parent.width
        val screenHeight = parent.height

        repeat(20) {
            val smoke = View(parent.context).apply {
                val size = Random.nextInt(20, 60)
                layoutParams = ViewGroup.LayoutParams(size, size)
                background = ContextCompat.getDrawable(context, R.drawable.smoke_circle)
                alpha = 0.4f + Random.nextFloat() * 0.2f

                val minX = screenWidth * 11 / 25
                val maxX = screenWidth * 17 / 25

                val bias = Random.nextFloat()
                val biasedX = when {
                    bias < 0.2f -> Random.nextInt(minX, minX + (maxX - minX) / 4)
                    bias > 0.8f -> Random.nextInt(maxX - (maxX - minX) / 4, maxX)
                    else -> Random.nextInt(minX + (maxX - minX) / 4, maxX - (maxX - minX) / 4)
                }

                val baseY = screenHeight * 39 / 56
                val adjustedY = if (bias < 0.2f || bias > 0.8f) baseY - 20 else baseY

                x = biasedX.toFloat()
                y = adjustedY.toFloat()
            }

            parent.addView(smoke)

            val moveX = PropertyValuesHolder.ofFloat("translationX", smoke.x, smoke.x + Random.nextInt(-100, 100))
            val moveY = PropertyValuesHolder.ofFloat("translationY", smoke.y, smoke.y - Random.nextInt(300, 600))
            val fade = PropertyValuesHolder.ofFloat("alpha", smoke.alpha, 0f)

            ObjectAnimator.ofPropertyValuesHolder(smoke, moveX, moveY, fade).apply {
                duration = Random.nextLong(4000, 7000)
                interpolator = AccelerateDecelerateInterpolator()
                addListener(onEnd = { parent.removeView(smoke) })
                start()
            }
        }
    }



    private fun createSparks(parent: RelativeLayout) {
        val screenWidth = parent.width
        val screenHeight = parent.height

        val sources = listOf(
            Pair(screenWidth *3/8, screenHeight * 4 / 5),
            Pair(screenWidth *3/8- 20, screenHeight * 4 / 5),
            Pair(screenWidth *3/8- 10, screenHeight * 4 / 5 - 20)
        )
        val sparkNumber = Random.nextInt(15)
        sources.forEachIndexed { index, (startX, startY) ->
            repeat(sparkNumber) {
                val spark = View(parent.context).apply {
                    val size = Random.nextInt(4, 10)
                    layoutParams = ViewGroup.LayoutParams(size, size)
                    setBackgroundColor(ContextCompat.getColor(context, R.color.light_blue))
                    x = startX.toFloat()
                    y = startY.toFloat()
                }

                parent.addView(spark)

                val directionX = when (index) {
                    0 -> Random.nextInt(100, 400)
                    1 -> -Random.nextInt(100, 400)
                    2 -> Random.nextInt(-200,200)
                    else -> 0
                }

                val directionY = if (index == 2) Random.nextInt(-200, -100) else Random.nextInt(0, 300)

                val moveX = PropertyValuesHolder.ofFloat("translationX", spark.x, spark.x + directionX)
                val moveY = PropertyValuesHolder.ofFloat("translationY", spark.y, spark.y + directionY)
                val fade = PropertyValuesHolder.ofFloat("alpha", 1f, 0f)

                ObjectAnimator.ofPropertyValuesHolder(spark, moveX, moveY, fade).apply {
                    duration = Random.nextLong(1000, 2500)
                    interpolator = DecelerateInterpolator()
                    addListener(onEnd = { parent.removeView(spark) })
                    start()
                }
            }
        }
    }



}