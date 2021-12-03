package com.penzgtu.cryptocurrencyapplication.data.remote

import com.penzgtu.cryptocurrencyapplication.common.Constants
import com.penzgtu.cryptocurrencyapplication.data.remote.dto.CoinDto
import com.penzgtu.cryptocurrencyapplication.di.AppModule
import com.penzgtu.cryptocurrencyapplication.domain.model.Coin
import retrofit2.http.GET


interface CoinMarketCapApi {
    @GET("listings/latest?CMC_PRO_API_KEY=4f2487d1-83f4-4306-8ca7-94c87ffa3ab0&start=1&limit=1")
    suspend fun getCoins(): List<CoinDto>

}