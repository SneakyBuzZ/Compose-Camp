package com.example.basic_loginpage_ui.templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.basic_loginpage_ui.R

@Composable
fun HomeScreenTopGradient() {
    Box(
        contentAlignment = Alignment.TopCenter,
        modifier = Modifier
            .fillMaxHeight(0.3f)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .height(200.dp),
            painter = painterResource(id = R.drawable.myapp_home_top_gradient),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
        )
        HomeTopIcons()
        DiscoverColumn()
        Spacer(modifier = Modifier.height(50.dp))
    }
}