package com.dd.rpgcardapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class StatProgressView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrs, defStyle) {

    var maxPoints: Int = 8
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
        val squareSize = height.toFloat()
        val totalWidth = width.toFloat()
        val spacing = 4f
        val availableWidth = totalWidth - spacing * (maxPoints - 1)
        val squareWidth = availableWidth / maxPoints

        for (i in 0 until maxPoints) {
            val left = i * (squareWidth + spacing)
            val paint = if (i < currentPoints) filledPaint else emptyPaint
            canvas.drawRect(left, 0f, left + squareWidth, squareSize, paint)
        }
    }
}
