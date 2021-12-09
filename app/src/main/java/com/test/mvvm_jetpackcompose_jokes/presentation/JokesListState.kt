package com.test.mvvm_jetpackcompose_jokes.presentation

import com.test.mvvm_jetpackcompose_jokes.domain.model.Jokes

data class JokesListState(
    val isLoading: Boolean = false,
    val jokes: List<Jokes> = emptyList(),
    val error: String = ""
) {
}