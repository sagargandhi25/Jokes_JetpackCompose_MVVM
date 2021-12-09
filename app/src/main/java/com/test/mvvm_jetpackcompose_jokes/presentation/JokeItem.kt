package com.test.mvvm_jetpackcompose_jokes.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.test.mvvm_jetpackcompose_jokes.domain.model.Jokes

@Composable
fun JokeItem(
    joke: Jokes
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "${joke.category}  ${joke.lang}  ${joke.type}",
            style = MaterialTheme.typography.body1
        )
        Text(
            text = "${joke.joke}",
            style = MaterialTheme.typography.h2,
            fontSize = 16.sp
        )

    }
}