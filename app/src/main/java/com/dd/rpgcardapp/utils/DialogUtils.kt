package com.dd.rpgcardapp.utils

import android.app.AlertDialog
import android.content.Context
import android.content.res.Resources
import android.graphics.Color
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.ListView
import androidx.core.content.ContextCompat
import com.dd.rpgcardapp.R
import android.widget.TextView
import android.widget.LinearLayout
import android.text.TextUtils
import android.util.TypedValue
import android.widget.ScrollView

// Funkcja pomocnicza do kolorowania gwiazdek
fun colorizeAsterisks(text: String, color: Int = Color.RED): SpannableString {
    val spannableString = SpannableString(text)
    var index = 0

    while (index < text.length) {
        val asteriskIndex = text.indexOf('*', index)
        if (asteriskIndex == -1) break

        spannableString.setSpan(
            ForegroundColorSpan(color),
            asteriskIndex,
            asteriskIndex + 1,
            Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        index = asteriskIndex + 1
    }

    return spannableString
}

fun showAlertDialog(
    context: Context,
    title: String? = null,
    items: List<String>,
    onItemSelected: (String) -> Unit
) {
    val dialog = AlertDialog.Builder(context).apply {
        title?.let { setTitle(it) }
        setCancelable(true)
    }.create()

    // Tworzymy własny ListView z customowym adapterem
    val listView = ListView(context).apply {
        adapter = object : ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, items) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                val textView = view.findViewById<TextView>(android.R.id.text1)

                // Kolorujemy gwiazdki w każdym elemencie
                textView.text = colorizeAsterisks(items[position])

                return view
            }
        }

        setOnItemClickListener { _, _, position, _ ->
            onItemSelected(items[position])
            dialog.dismiss()
        }
    }

    dialog.setView(listView)
    dialog.show()

    // Ustawiamy marginesy
    val marginHorizontalDp = 60
    val scale = context.resources.displayMetrics.density
    val marginPx = (marginHorizontalDp * scale).toInt()

    dialog.window?.setLayout(
        context.resources.displayMetrics.widthPixels - (2 * marginPx),
        WindowManager.LayoutParams.WRAP_CONTENT
    )

    dialog.window?.setBackgroundDrawable(
        ContextCompat.getDrawable(context, R.drawable.bg_alert_dialog)
    )
}

fun showAlertDialogWithTiles(
    context: Context,
    title: String? = null,
    items: List<String>,
    onItemSelected: (String) -> Unit
) {
    val dialog = AlertDialog.Builder(context).apply {
        setCancelable(false)
    }.create()

    // Tworzymy TextView dla komunikatu z kolorowaniem gwiazdek
    val messageTextView = TextView(context).apply {
        text = title?.let { colorizeAsterisks(it) } ?: ""
        setPadding(40, 20, 40, 20)
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f)
        setLineSpacing(1.5f, 1f)
        maxLines = 5
        ellipsize = TextUtils.TruncateAt.END
    }

    val scrollView = ScrollView(context)
    scrollView.addView(messageTextView)

    // Tworzymy GridView dla kafelków z własnym adapterem
    val gridView = GridView(context).apply {
        numColumns = items.size
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        adapter = object : ArrayAdapter<String>(context, R.layout.button_item, R.id.item_text, items) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val inflater = LayoutInflater.from(context)
                val view = convertView ?: inflater.inflate(R.layout.button_item, parent, false)
                val textView = view.findViewById<TextView>(R.id.item_text)

                // Kolorujemy gwiazdki w każdym elemencie
                textView.text = colorizeAsterisks(items[position])

                return view
            }
        }

        setOnItemClickListener { _, _, position, _ ->
            onItemSelected(items[position])
            dialog.dismiss()
        }
    }

    val linearLayout = LinearLayout(context).apply {
        orientation = LinearLayout.VERTICAL
        addView(scrollView)
        addView(gridView)
    }

    dialog.setView(linearLayout)
    dialog.show()

    // Ustawianie marginesów i wyglądu dialogu
    val marginHorizontalDp = 60
    val scale = context.resources.displayMetrics.density
    val marginPx = (marginHorizontalDp * scale).toInt()

    dialog.window?.setLayout(
        context.resources.displayMetrics.widthPixels - (2 * marginPx),
        WindowManager.LayoutParams.WRAP_CONTENT
    )

    dialog.window?.setBackgroundDrawable(
        ContextCompat.getDrawable(context, R.drawable.bg_alert_dialog)
    )
}

val Int.dp: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()