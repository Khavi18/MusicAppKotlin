package com.example.musicappkotlin.ui.theme

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.musicappkotlin.R

@Composable
fun BrowseView() {

    val categories = listOf("Pop", "Country", "Hip Hop", "Blues", "Jazz", "Rock")

    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(categories) { item ->
            BrowseItem(cat = item, drawable = R.drawable.baseline_apps_24)
        }
    }
}

