package com.penzgtu.cryptocurrencyapplication.presentation

sealed class Screen(val route:String){
    object CoinListScreen: Screen("coin_list_screen")
}
