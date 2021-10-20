package com.rex50.composemeditation.ui.landing_screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.rex50.composemeditation.entities.Featured
import com.rex50.composemeditation.R
import com.rex50.composemeditation.entities.BottomMenuItem
import com.rex50.composemeditation.ui.theme.*

@ExperimentalFoundationApi
@Composable
fun LandingScreen() {
    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxWidth()
        .fillMaxHeight()
    ) {
        Column {

            GreetingSection()

            FiltersSection(filters = listOf(
                "Sweet sleep",
                "Insomnia",
                "Depression",
                "Rise"
            ))

            CurrentMeditationSection()

            FeaturedSection(featuredItems = listOf(
                Featured(
                    title = "Sleep meditation",
                    R.drawable.ic_headphone,
                    BlueViolet1,
                    BlueViolet2,
                    BlueViolet3
                ),
                Featured(
                    title = "Tips for sleeping",
                    R.drawable.ic_videocam,
                    LightGreen1,
                    LightGreen2,
                    LightGreen3
                ),
                Featured(
                    title = "Night island",
                    R.drawable.ic_headphone,
                    OrangeYellow1,
                    OrangeYellow2,
                    OrangeYellow3
                ),
                Featured(
                    title = "Calming sounds",
                    R.drawable.ic_headphone,
                    Beige1,
                    Beige2,
                    Beige3
                )
            ))
        }

        BottomNavigation(
            items = listOf(
                BottomMenuItem("Home", R.drawable.ic_home),
                BottomMenuItem("Meditate", R.drawable.ic_bubble),
                BottomMenuItem("Sleep", R.drawable.ic_moon),
                BottomMenuItem("Music", R.drawable.ic_music),
                BottomMenuItem("Profile", R.drawable.ic_profile)
            ),
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}














