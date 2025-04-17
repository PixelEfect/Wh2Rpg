package com.dd.rpgcardapp.utils

import android.app.AlertDialog
import android.content.Context
import android.content.res.Resources
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.core.content.ContextCompat
import com.dd.rpgcardapp.R
import android.widget.TextView
import android.widget.LinearLayout
import android.text.TextUtils
import android.util.TypedValue
import android.widget.ScrollView

fun showAlertDialog(
    context: Context,
    title: String? = null,
    items: List<String>,
    onItemSelected: (String) -> Unit
) {
    val dialog = AlertDialog.Builder(context).apply {
        title?.let { setTitle(it) }
        setItems(items.toTypedArray()) { dialog, which ->
            onItemSelected(items[which])
            dialog.dismiss()
        }
    }.create()

    dialog.show()

    // 🪄 Ustawiamy marginesy (np. 40dp po bokach)
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
    // Tworzymy dialog wcześniej, aby był dostępny w całej funkcji
    val dialog = AlertDialog.Builder(context).apply {
        setCancelable(false)  // Zapobiega zamknięciu dialogu przez kliknięcie poza nim
    }.create()

    // Tworzymy TextView dla komunikatu
    val messageTextView = TextView(context).apply {
        text = title // Komunikat przekazywany do tytułu
        setPadding(40, 20, 40, 20) // Padding wokół tekstu
        setTextSize(TypedValue.COMPLEX_UNIT_SP, 16f) // Ustawiamy rozmiar czcionki
        setLineSpacing(1.5f, 1f) // Ustawiamy odstępy między wierszami
        maxLines = 5  // Możemy ustawić limit linii, by zapewnić odpowiednią wysokość
        ellipsize = TextUtils.TruncateAt.END  // Skracamy tekst, jeśli jest za długi
    }

    // Tworzymy ScrollView, aby umożliwić przewijanie tekstu, jeśli jest zbyt długi
    val scrollView = ScrollView(context)
    scrollView.addView(messageTextView)

    // Tworzymy GridView dla kafelków
    val gridView = GridView(context).apply {
        numColumns = items.size // Liczba kolumn w GridView
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        adapter = object : ArrayAdapter<String>(context, R.layout.button_item, R.id.item_text, items) {}
        setOnItemClickListener { _, _, position, _ ->
            onItemSelected(items[position])
            dialog.dismiss()  // Zamykamy dialog po wybraniu elementu
        }
    }

    // Ustawiamy widok na dialogu (pierwszy będzie komunikat, potem kafelki)
    val linearLayout = LinearLayout(context).apply {
        orientation = LinearLayout.VERTICAL
        addView(scrollView) // Dodajemy ScrollView z komunikatem
        addView(gridView)   // Dodajemy GridView z kafelkami
    }

    dialog.setView(linearLayout)  // Ustawiamy cały układ w dialogu
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
