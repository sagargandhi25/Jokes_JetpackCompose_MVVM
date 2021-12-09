package com.test.mvvm_jetpackcompose_jokes.domain.usecase

import com.test.mvvm_jetpackcompose_jokes.data.remote.jokesDTO.toJokes
import com.test.mvvm_jetpackcompose_jokes.domain.model.Jokes
import com.test.mvvm_jetpackcompose_jokes.domain.repository.JokesRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetJokesUseCase @Inject constructor(
    private val repository: JokesRepository
) {

    var list: List<Jokes> = emptyList()
    operator fun invoke(type:String,amount: String): Flow<List<Jokes>> = flow {
        try {
            list = repository.getAllJokes(type,amount).jokes.map {
                it.toJokes()
            }
            emit(list)
        }
        catch (e: HttpException)
        {
            emit(list)
        }
        catch (e:IOException)
        {
            emit(list)
        }
    }
}