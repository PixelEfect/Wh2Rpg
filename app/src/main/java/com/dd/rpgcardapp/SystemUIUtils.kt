package com.dd.rpgcardapp.utils

import android.os.Build
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.activity.ComponentActivity

object SystemUIUtils {

    // Metoda do ukrywania paska systemowego
    fun hideSystemUI(activity: ComponentActivity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val windowInsetsController = activity.window.insetsController
            windowInsetsController?.hide(WindowInsets.Type.systemBars()) // Ukryj pasek systemowy
            windowInsetsController?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_DEFAULT // Umożliwia wyświetlenie paska przez przesunięcie
        } else {
            // Dla starszych wersji Androida zachowanie z SYSTEM_UI_FLAG_FULLSCREEN
            activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        }
    }
}
