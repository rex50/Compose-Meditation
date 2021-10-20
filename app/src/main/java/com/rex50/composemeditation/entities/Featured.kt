package com.rex50.composemeditation.entities

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class Featured(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color,
)
