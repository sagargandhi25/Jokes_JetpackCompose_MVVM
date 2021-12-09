package com.test.mvvm_jetpackcompose_jokes.data.remote.jokesDTO


import com.google.gson.annotations.SerializedName
import com.test.mvvm_jetpackcompose_jokes.domain.model.Jokes

data class JokeDto(
    @SerializedName("category")
    val category: String,
    @SerializedName("delivery")
    val delivery: String,
    @SerializedName("flags")
    val flags: Flags,
    @SerializedName("id")
    val id: Int,
    @SerializedName("joke")
    val joke: String,
    @SerializedName("lang")
    val lang: String,
    @SerializedName("safe")
    val safe: Boolean,
    @SerializedName("setup")
    val setup: String,
    @SerializedName("type")
    val type: String
)
fun JokeDto.toJokes(): Jokes {
    return Jokes(
        category = category,
        joke = joke,
        lang = lang,
        type = type
    )
}