package com.penzgtu.cryptocurrencyapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Coin(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("status")
    val status: Status
)