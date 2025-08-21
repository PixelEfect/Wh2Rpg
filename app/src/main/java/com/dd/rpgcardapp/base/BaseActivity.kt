package com.dd.rpgcardapp.base

import android.R
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.activity.ComponentActivity
import com.dd.rpgcardapp.utils.SystemUIUtils

open class BaseActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //SystemUIUtils.hideSystemUI(this)// Ukrywanie systemowego UI w każdej aktywności
    }
    override fun onStart() {
        super.onStart()
        SystemUIUtils.hideSystemUI(this)
    }

    override fun onResume() {
        super.onResume()
        SystemUIUtils.hideSystemUI(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            SystemUIUtils.hideSystemUI(this)
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    protected fun enableTouchToHideKeyboardAndSystemUI() {
        val rootView = findViewById<View>(android.R.id.content)
        setupUI(rootView)
    }

    private fun setupUI(view: View) {
        // Jeśli to nie jest pole tekstowe, ustaw listener
        if (view !is android.widget.EditText) {
            view.setOnTouchListener { _, event ->
                if (event.action == MotionEvent.ACTION_DOWN) {
                    // Chowamy klawiaturę
                    currentFocus?.let {
                        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(it.windowToken, 0)
                    }
                    // Chowamy system UI
                    SystemUIUtils.hideSystemUI(this)
                }
                false
            }
        }

        // Jeśli to jest ViewGroup, przejdź rekurencyjnie przez wszystkie dzieci
        if (view is android.view.ViewGroup) {
            for (i in 0 until view.childCount) {
                setupUI(view.getChildAt(i))
            }
        }
    }

}