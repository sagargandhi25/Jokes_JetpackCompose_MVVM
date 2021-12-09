package com.test.mvvm_jetpackcompose_jokes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.test.mvvm_jetpackcompose_jokes.presentation.JokeScreen
import com.test.mvvm_jetpackcompose_jokes.ui.theme.MVVM_JetpackCompose_JokesTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVM_JetpackCompose_JokesTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                   JokeScreen()
                }
            }
        }
    }
}
