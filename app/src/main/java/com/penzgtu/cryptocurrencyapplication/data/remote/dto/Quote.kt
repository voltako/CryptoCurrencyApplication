package com.penzgtu.cryptocurrencyapplication.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("USD")
    val uSD: USD
)