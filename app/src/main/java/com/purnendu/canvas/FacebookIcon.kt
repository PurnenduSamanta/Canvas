package com.purnendu.canvas

import android.graphics.Paint
import android.graphics.Typeface
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.drawText
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalTextApi::class)
@Composable
fun FacebookIcon() {

    val assetManager = LocalContext.current.assets
    val paint = Paint().apply {
        textAlign = Paint.Align.CENTER
        textSize = 200f
        color = Color.White.toArgb()
        typeface = Typeface.createFromAsset(assetManager, "facebookletterfaces.OTF")
    }

    val textMeasurer = rememberTextMeasurer()

    val textToDraw = "F"

    val font = FontFamily(
        Font(R.font.facebookletterfaces, FontWeight.Normal),
        Font(R.font.facebookletterfaces,FontWeight.Light),
        Font(R.font.facebookletterfaces, FontWeight.SemiBold),
        Font(R.font.facebookletterfaces, FontWeight.ExtraBold)
    )

    val style = TextStyle(
        fontFamily = font,
        fontSize = 30.sp,
        color = Color.White,
        background = Color.Transparent
    )

    val textLayoutResult = remember(textToDraw) {
        textMeasurer.measure(textToDraw, style)
    }

    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ) {

        drawRoundRect(
            color = Color(0xFF1776d1),
            cornerRadius = CornerRadius(20f, 20f)
        )

        drawText(
            textMeasurer = textMeasurer,
            text = textToDraw,
            style = style,
            topLeft = Offset(
                x = center.x + 10 ,
                y = 10f ,
            )
        )

       // drawContext.canvas.nativeCanvas.drawText("f", center.x + 25, center.y + 90, paint)



    }




}