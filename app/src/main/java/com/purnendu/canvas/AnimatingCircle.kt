package com.purnendu.canvas

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun AnimatingCircle() {

    val centerX = remember { mutableStateOf(0f) }
    val x by rememberInfiniteTransition(label = "animation").animateFloat(
        initialValue = 0f,
        targetValue = centerX.value,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 5000,
            ),
            repeatMode = RepeatMode.Restart
        ), label = "animation"
    )


    Canvas(modifier = Modifier.fillMaxSize())
    {

        centerX.value=center.x
        drawCircle(radius = 120f, center = Offset(x=x,y=size.height*0.52f), color = Color.Yellow)

        drawCircle(radius = 100f, center = Offset(x=x,y=size.height*0.4f), color = Color.Cyan)

        drawCircle(radius = 80f, center = Offset(x=x,y=size.height*0.3f), color = Color.Blue)

        drawCircle(radius = 60f, center = Offset(x=x,y=size.height*0.2f), color = Color.Red)

    }

}