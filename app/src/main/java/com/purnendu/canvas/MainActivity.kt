package com.purnendu.canvas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.tooling.preview.Preview
import com.purnendu.canvas.form.Form
import com.purnendu.canvas.ui.theme.CanvasTheme

// https://medium.com/falabellatechnology/jetpack-compose-canvas-8aee73eab393
// https://stackoverflow.com/questions/76082906/how-to-draw-text-in-jetpack-compose-at-the-center-of-another-object

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CanvasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center)
                    {
                        //InstagramIcon()
                        //FacebookIcon()
                        //AnimatingCircle()
                     /*   ParticleEffect(
                            particles = listOf<Particle>(
                                Particle(Offset(100f, 1820f), Offset(1f, -2f)),
                                Particle(Offset(200f, 1680f), Offset(-0.5f, -1.5f)),
                                Particle(Offset(300f, 1700f), Offset(0.2f, -1.8f)),
                                Particle(Offset(400f, 1850f), Offset(-0.8f, -2f)),
                                Particle(Offset(500f, 1800f), Offset(0.4f, -1.2f)),
                                Particle(Offset(600f, 1960f), Offset(1f, -2f)),
                                Particle(Offset(700f, 1980f), Offset(-0.5f, -1.5f)),
                                Particle(Offset(800f, 2010f), Offset(0.2f, -1.8f)),
                                Particle(Offset(900f, 1950f), Offset(-0.8f, -2f)),
                                Particle(Offset(750f, 2000f), Offset(0.4f, -1.2f)),
                                Particle(Offset(100f, 1780f), Offset(1f, -2f)),
                                Particle(Offset(200f, 1790f), Offset(-0.5f, -1.5f)),
                                Particle(Offset(300f, 1805f), Offset(0.2f, -1.8f)),
                                Particle(Offset(400f, 1815f), Offset(-0.8f, -2f)),
                                Particle(Offset(500f, 1825f), Offset(0.4f, -1.2f)),
                                Particle(Offset(600f, 1915f), Offset(1f, -2f)),
                                Particle(Offset(700f, 1922f), Offset(-0.5f, -1.5f)),
                                Particle(Offset(800f, 2014f), Offset(0.2f, -1.8f)),
                                Particle(Offset(900f, 2012f), Offset(-0.8f, -2f)),
                                Particle(Offset(750f, 2004f), Offset(0.4f, -1.2f))
                            )
                        )*/
                        Form()
                    }
                  }
            }
        }
    }
}

