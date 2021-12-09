package com.test.mvvm_jetpackcompose_jokes.data.repository

import com.test.mvvm_jetpackcompose_jokes.data.remote.JokesApi
import com.test.mvvm_jetpackcompose_jokes.data.remote.jokesDTO.JokesDto
import com.test.mvvm_jetpackcompose_jokes.domain.repository.JokesRepository
import javax.inject.Inject

class JokesRepoImpl @Inject constructor(
    private val jokesApi: JokesApi
): JokesRepository {
    override suspend fun getAllJokes(type: String, amount: String): JokesDto {
       return jokesApi.getAllJokes(type, amount)
    }
}