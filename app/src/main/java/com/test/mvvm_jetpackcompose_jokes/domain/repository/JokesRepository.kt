package com.test.mvvm_jetpackcompose_jokes.domain.repository

import com.test.mvvm_jetpackcompose_jokes.data.remote.jokesDTO.JokesDto

interface JokesRepository {
    suspend fun getAllJokes(type: String, amount: String): JokesDto
}