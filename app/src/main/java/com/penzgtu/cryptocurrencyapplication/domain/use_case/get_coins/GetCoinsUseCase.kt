package com.penzgtu.cryptocurrencyapplication.domain.use_case.get_coins

import com.penzgtu.cryptocurrencyapplication.common.Resource
import com.penzgtu.cryptocurrencyapplication.data.remote.dto.toCoin
import com.penzgtu.cryptocurrencyapplication.domain.model.Coin
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.Flow
import retrofit2.HttpException
import com.penzgtu.cryptocurrencyapplication.domain.repository.CoinRepository
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            emit(Resource.Success<List<Coin>>(coins))
        }   catch (e: HttpException){
            emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occured"))
        }   catch (e: IOException){
            emit(Resource.Error<List<Coin>>("Couldn't reach server. Check your internet connection. "))
        }
    }
}