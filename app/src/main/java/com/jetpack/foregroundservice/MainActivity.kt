package com.jetpack.foregroundservice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.foregroundservice.ui.theme.ForegroundServiceTheme
import com.jetpack.foregroundservice.ui.theme.Purple500
import com.jetpack.foregroundservice.utils.foregroundStartService

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ForegroundServiceTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Purple500)
                                .padding(15.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                text = "Foreground Service",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                        }

                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Button(
                                onClick = {
                                    foregroundStartService("Start")
                                },
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(45.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            ) {
                                Text(
                                    text = "Trigger",
                                    color = Color.White,
                                    fontSize = 15.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(50.dp))

                            Button(
                                onClick = {
                                    foregroundStartService("Exit")
                                },
                                modifier = Modifier
                                    .width(100.dp)
                                    .height(45.dp)
                                    .clip(RoundedCornerShape(10.dp))
                            ) {
                                Text(
                                    text = "Exit",
                                    color = Color.White,
                                    fontSize = 15.sp
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}



















