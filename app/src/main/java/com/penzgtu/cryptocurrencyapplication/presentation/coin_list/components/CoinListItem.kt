package com.penzgtu.cryptocurrencyapplication.presentation.coin_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.penzgtu.cryptocurrencyapplication.domain.model.Coin

@Composable
fun CoinListItem(
    coin: Coin
){
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween


    ){
        Text(
            text = "${coin.id}. ${coin.name}. (${coin.symbol})" ,
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Ellipsis


        )
    }

}