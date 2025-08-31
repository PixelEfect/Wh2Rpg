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

    // Dodaj te metody:
    protected fun setCustomTransition(enterAnim: Int, exitAnim: Int) {
        overridePendingTransition(enterAnim, exitAnim)
    }

    protected fun setFadeTransition() {
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    protected fun setSlideFromBottomTransition() {
        overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
    }

    // Użycie przy starcie nowej aktywności:
    protected fun startActivityWithTransition(intent: android.content.Intent, transitionType: TransitionType = TransitionType.FADE) {
        startActivity(intent)
        when (transitionType) {
            TransitionType.FADE -> setFadeTransition()
            TransitionType.SLIDE_LEFT -> overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
            //TransitionType.SLIDE_UP -> overridePendingTransition(com.dd.rpgcardapp.R.anim.slide_up_in, com.dd.rpgcardapp.R.anim.slide_down_out)
            TransitionType.DEFAULT ->{}
        }
    }

    enum class TransitionType {
        FADE, SLIDE_LEFT, DEFAULT,// SLIDE_UP
    }

    @SuppressLint("ClickableViewAccessibility")
    protected fun enableTouchToHideKeyboardAndSystemUI() {
        val rootView = findViewById<View>(android.R.id.content)
        setupUI(rootView)
    }

    private fun setupUI(view: View) {
        if (view !is android.widget.EditText) {
            view.setOnTouchListener { _, event ->
                if (event.action == MotionEvent.ACTION_DOWN) {
                    currentFocus?.let {
                        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(it.windowToken, 0)
                    }
                    SystemUIUtils.hideSystemUI(this)
                }
                false
            }
        }

        if (view is android.view.ViewGroup) {
            for (i in 0 until view.childCount) {
                setupUI(view.getChildAt(i))
            }
        }
    }
}