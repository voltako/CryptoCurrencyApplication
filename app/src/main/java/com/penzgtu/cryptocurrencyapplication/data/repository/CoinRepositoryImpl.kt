package com.penzgtu.cryptocurrencyapplication.data.repository

import com.penzgtu.cryptocurrencyapplication.data.remote.CoinMarketCapApi
import com.penzgtu.cryptocurrencyapplication.data.remote.dto.CoinDto
import com.penzgtu.cryptocurrencyapplication.di.AppModule
import com.penzgtu.cryptocurrencyapplication.domain.model.Coin
import com.penzgtu.cryptocurrencyapplication.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(


    private val api: CoinMarketCapApi
) : CoinRepository{



    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }


}
