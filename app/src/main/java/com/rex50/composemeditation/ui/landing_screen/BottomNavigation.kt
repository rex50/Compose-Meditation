package com.rex50.composemeditation.ui.landing_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.rex50.composemeditation.entities.BottomMenuItem
import com.rex50.composemeditation.ui.theme.AquaBlue
import com.rex50.composemeditation.ui.theme.ButtonBlue
import com.rex50.composemeditation.ui.theme.DeepBlue

@Composable
fun BottomNavigation(
    items: List<BottomMenuItem>,
    modifier: Modifier = Modifier,
    activeHighlightColor: Color = ButtonBlue,
    activeTextColor: Color = Color.White,
    inactiveColor: Color = AquaBlue,
    initialSelectedIndex: Int = 0
) {

    var selectedItemIndex by remember {
        mutableStateOf(initialSelectedIndex)
    }

    Row (
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .background(DeepBlue)
            .padding(15.dp)
    ) {
        items.forEachIndexed { index, item ->
            BottomNavigationMenuItem(
                item = item,
                isSelected = index == selectedItemIndex,
                activeHighlightColor = activeHighlightColor,
                activeTextColor = activeTextColor,
                inactiveColor = inactiveColor
            ) {
                selectedItemIndex = index
            }
        }
    }

}