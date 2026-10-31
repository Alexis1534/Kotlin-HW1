package com.example.kotlin_hw1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource

// квадратная карточка с элементом внутри
// чет-красный, нечет-синий
@Composable
fun NumberCard(index: Int, modifier: Modifier = Modifier){
    //цвет квадрата
    val colour_background = if (index%2 == 0){
        colorResource(R.color.card_chet)
    } else {
        colorResource(R.color.card_nechet)
    }

    //размер текста из dimens
    val textSize = with(LocalDensity.current){
        dimensionResource(R.dimen.card_text_size).toSp()
    }

    Box(
        modifier = modifier.aspectRatio(1f).background(colour_background),
            contentAlignment = Alignment.Center
    ) {
        Text(
            text = index.toString(),
            color = colorResource(R.color.card_text),
            fontSize = textSize
        )
    }
}