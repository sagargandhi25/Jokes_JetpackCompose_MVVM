package com.test.mvvm_jetpackcompose_jokes.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@SuppressLint("RememberReturnType")
@Composable
fun JokeScreen(
    viewModel: JokesViewModel = hiltViewModel()
) {
    remember {
        viewModel.getAllJokes("single","10")
    }

    val state = viewModel.jokeState.value
    
    Box( 
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(state.jokes) {jokeItem ->
                JokeItem(joke = jokeItem)
            }
        }
        if(state.error.isNotBlank()) {
            Text(text = state.error,
            color = MaterialTheme.colors.error,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
                .align(Alignment.Center)
                .padding(horizontal = 20.dp)
            )
        }
    }
}