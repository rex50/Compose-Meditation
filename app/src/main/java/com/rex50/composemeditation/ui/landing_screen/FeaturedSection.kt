package com.rex50.composemeditation.ui.landing_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rex50.composemeditation.entities.Featured

@ExperimentalFoundationApi
@Composable
fun FeaturedSection(
    featuredItems: List<Featured>
) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = "Featured",
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(15.dp)
        )

    }

    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(start = 7.5.dp, end = 7.5.dp, bottom = 100.dp),
        modifier = Modifier.fillMaxHeight()
    ) {
        items(featuredItems.size) { index ->
            FeaturedCard(featured = featuredItems[index])
        }
    }
    
}