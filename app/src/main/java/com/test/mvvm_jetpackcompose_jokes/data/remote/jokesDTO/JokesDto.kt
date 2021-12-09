package com.test.mvvm_jetpackcompose_jokes.data.remote.jokesDTO


import com.google.gson.annotations.SerializedName

data class JokesDto(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("error")
    val error: Boolean,
    @SerializedName("jokes")
    val jokes: List<JokeDto>
)