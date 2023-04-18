package com.example.meditationui.ui.screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.meditationui.ui.theme.ButtonBlue
import com.example.meditationui.ui.theme.DarkerButtonBlue
import com.example.meditationui.ui.theme.TextWhite

@Composable
fun LazyCategory(
    category: List<String>
) {
    var selectCategoryIndex by remember {
        mutableStateOf(0)
    }
    LazyRow(
        Modifier.padding(
            top = 24.dp,
        ),
    ) {
        items(category.size) {
            Box(
                modifier = Modifier
                    .padding(start = 15.dp)
                    .clickable {
                        selectCategoryIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectCategoryIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(category[it], color = TextWhite)
            }
        }
    }
}
