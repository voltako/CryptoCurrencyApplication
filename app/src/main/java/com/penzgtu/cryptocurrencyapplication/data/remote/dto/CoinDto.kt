package com.penzgtu.cryptocurrencyapplication.data.remote.dto

import android.util.Log
import android.widget.TextView
import com.penzgtu.cryptocurrencyapplication.domain.model.Coin
import com.google.gson.annotations.SerializedName
import com.penzgtu.cryptocurrencyapplication.R

data class CoinDto(
    val id: String,
    val name: String,
    val symbol: String
//    val slug: String,
//    val price: Double,
//    val value_change: Double
)



fun CoinDto.toCoin(): Coin{
    return Coin(
        id = id,
        name = name,
        symbol = symbol
//        slug = slug,
//        price = price,
//        value_change = value_change

    )
}
