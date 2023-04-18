package com.example.meditationui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.meditationui.ui.screens.HomeScreen
import com.example.meditationui.ui.theme.MeditationUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUITheme(true, ) {
                //TODO: change system status bar color
                // val systemUiController = rememberSystemUiController()
                HomeScreen()
            }
        }
    }
}