package com.dd.rpgcardapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class VerticalProgressView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrs, defStyle) {

    var maxPoints: Int = 3 // Zmieniono na 3
    var currentPoints: Int = 0
        set(value) {
            field = value
            invalidate()
        }

    private val filledPaint = Paint().apply {
        color = Color.GREEN
        style = Paint.Style.FILL
    }

    private val emptyPaint = Paint().apply {
        color = Color.LTGRAY
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val barWidth = width.toFloat() // Szerokość paska będzie szerokością widoku
        val totalHeight = height.toFloat()
        val spacing = 4f // Odstęp między paskami
        val availableHeight = totalHeight - spacing * (maxPoints - 1) // Dostępna wysokość na paski
        val barHeight = availableHeight / maxPoints // Wysokość pojedynczego paska

        for (i in 0 until maxPoints) {
            // Obliczamy górną krawędź każdego paska.
            val top = i * (barHeight + spacing)
            // Wybieramy kolor paska na podstawie jego pozycji i currentPoints.
            val paint = if (i < currentPoints) filledPaint else emptyPaint
            // Rysujemy pionowy prostokąt.  Argumenty to: lewa krawędź, górna krawędź, prawa krawędź, dolna krawędź, Paint
            canvas.drawRect(0f, top, barWidth, top + barHeight, paint)
        }
    }
}
