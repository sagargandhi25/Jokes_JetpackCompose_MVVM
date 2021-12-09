package com.test.mvvm_jetpackcompose_jokes.di

import com.test.mvvm_jetpackcompose_jokes.data.remote.JokesApi
import com.test.mvvm_jetpackcompose_jokes.data.repository.JokesRepoImpl
import com.test.mvvm_jetpackcompose_jokes.domain.repository.JokesRepository
import com.test.mvvm_jetpackcompose_jokes.network.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideJokesApi(): JokesApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JokesApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: JokesApi): JokesRepository {
        return JokesRepoImpl(api)
    }
}