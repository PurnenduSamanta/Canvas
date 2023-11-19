package com.purnendu.canvas

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import kotlinx.coroutines.delay


data class Particle(
    val position: Offset,
    val velocity: Offset
)

@Composable
fun ParticleEffect(particles: List<Particle>) {
    val mutableParticles = remember { mutableStateListOf<Particle>() }
    mutableParticles.addAll(particles)

    var counter = 0

    LaunchedEffect(Unit) {
        while (true) {
            val particlesCopy = ArrayList(mutableParticles.map { it.copy() })
            particlesCopy.forEachIndexed { index, particle ->
                mutableParticles[index] =
                    particle.copy(position = particle.position + particle.velocity)
            }
            delay(16L)
            counter += 1

            // modify as needed or change the condition to something like
            // when all particles are out of bounds of the screen
            if (counter > 3000) {
                break
            }
        }
    }

    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .background(Brush.horizontalGradient(listOf(Color.Yellow, Color.Magenta)))
    ) {
        mutableParticles.forEach { particle ->
            drawCircle(color = Color.Gray, alpha = 0.6F, center = particle.position, radius =10f)
        }
    }

}