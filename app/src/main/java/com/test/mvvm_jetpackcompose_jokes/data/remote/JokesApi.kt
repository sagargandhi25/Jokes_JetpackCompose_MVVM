package com.test.mvvm_jetpackcompose_jokes.data.remote

import com.test.mvvm_jetpackcompose_jokes.data.remote.jokesDTO.JokeDto
import com.test.mvvm_jetpackcompose_jokes.data.remote.jokesDTO.JokesDto
import retrofit2.http.GET
import retrofit2.http.Query

interface JokesApi {

    //https://sv443.net/jokeapi/v2/
    //https://v2.jokeapi.dev/joke/Any?type=single&amount=10
    @GET("joke/Any?")
    suspend fun getAllJokes(@Query("type") type: String,
                            @Query("amount") amount: String): JokesDto
}