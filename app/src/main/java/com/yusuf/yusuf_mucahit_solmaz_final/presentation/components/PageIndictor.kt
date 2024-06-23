package com.yusuf.yusuf_mucahit_solmaz_final.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.yusuf.yusuf_mucahit_solmaz_final.ui.theme.Blue

@Composable
fun PageIndicator(
    pageSize: Int,
    selectedPage: Int
){
    Row(horizontalArrangement = Arrangement.SpaceBetween) {
        repeat(pageSize){
                page ->

            Box(
                modifier = Modifier
                    .padding(horizontal = 4.dp)
                    .size(20.dp)
                    .clip(CircleShape)
                    .background(
                        color = if(page == selectedPage) Blue else Color.Gray
                    )
            ) {

            }
        }
    }
}