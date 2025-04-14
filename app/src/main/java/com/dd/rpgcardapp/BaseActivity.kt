import android.os.Build
import android.os.Bundle
import android.view.MotionEvent
import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.view.View
import android.view.WindowInsetsController
import androidx.activity.ComponentActivity
import com.dd.rpgcardapp.utils.SystemUIUtils

open class BaseActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SystemUIUtils.hideSystemUI(this)// Ukrywanie systemowego UI w każdej aktywności
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

    protected fun enableTouchToHideKeyboardAndSystemUI() {
        val rootView = findViewById<View>(android.R.id.content)
        rootView.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_DOWN && currentFocus != null) {
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            }
            SystemUIUtils.hideSystemUI(this)
            false
        }
    }
}
