package com.penzgtu.cryptocurrencyapplication.presentation.coin_list

import com.penzgtu.cryptocurrencyapplication.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
