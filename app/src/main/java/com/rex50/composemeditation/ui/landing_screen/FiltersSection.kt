package com.rex50.composemeditation.ui.landing_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.rex50.composemeditation.ui.theme.ButtonBlue
import com.rex50.composemeditation.ui.theme.DarkerButtonBlue
import com.rex50.composemeditation.ui.theme.TextWhite

@Composable
fun FiltersSection(
    filters: List<String>
) {

    var selectedFilterIndex by remember {
        mutableStateOf(0)
    }

    LazyRow {
        items(filters.size) { index ->
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedFilterIndex = index
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if(selectedFilterIndex == index) ButtonBlue else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ) {
                Text(
                    text = filters[index],
                    color = TextWhite
                )
            }
        }
    }

}