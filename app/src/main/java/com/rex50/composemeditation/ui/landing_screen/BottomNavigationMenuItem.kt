package com.rex50.composemeditation.ui.landing_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rex50.composemeditation.entities.BottomMenuItem
import com.rex50.composemeditation.ui.theme.AquaBlue
import com.rex50.composemeditation.ui.theme.ButtonBlue

@Composable
fun BottomNavigationMenuItem(
    item: BottomMenuItem,
    isSelected: Boolean = false,
    activeHighlightColor: Color = ButtonBlue,
    activeTextColor: Color = Color.White,
    inactiveColor: Color = AquaBlue,
    onItemClick: () -> Unit
) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.clickable {
            onItemClick()
        }
    ) {
        Box(
            contentAlignment =  Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(if (isSelected) activeHighlightColor else Color.Transparent)
                .padding(8.dp)
        ) {
            Icon(
                painter = painterResource(id = item.iconId),
                contentDescription = item.title,
                tint = if(isSelected) activeTextColor else inactiveColor,
                modifier = Modifier.size(20.dp)
            )
        }

        Text(
            text = item.title,
            color = if(isSelected) activeTextColor else inactiveColor
        )
    }
}