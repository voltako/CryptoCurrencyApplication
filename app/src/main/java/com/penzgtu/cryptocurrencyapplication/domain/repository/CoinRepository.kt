package com.penzgtu.cryptocurrencyapplication.domain.repository


import com.penzgtu.cryptocurrencyapplication.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

}