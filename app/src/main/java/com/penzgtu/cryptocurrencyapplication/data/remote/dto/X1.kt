package com.penzgtu.cryptocurrencyapplication.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.penzgtu.cryptocurrencyapplication.domain.model.Coin

data class X1(
    @SerializedName("circulating_supply")
    val circulatingSupply: String,
    @SerializedName("cmc_rank")
    val cmcRank: Int,
    @SerializedName("date_added")
    val dateAdded: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("is_active")
    val isActive: Int,
    @SerializedName("is_fiat")
    val isFiat: Int,
    @SerializedName("last_updated")
    val lastUpdated: String,
    @SerializedName("max_supply")
    val maxSupply: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("num_market_pairs")
    val numMarketPairs: Int,
    @SerializedName("platform")
    val platform: Any,
    @SerializedName("quote")
    val quote: Quote,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("total_supply")
    val totalSupply: Int
)
fun X1.toCoin(): Coin {
    return Coin(
        id = id,
        name = name,
        symbol = symbol
//        slug = slug,
//        price = price,
//        value_change = value_change

    )
}
