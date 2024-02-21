package com.example.basic_loginpage_ui.templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.basic_loginpage_ui.R

@Composable
fun HomeTopIcons() {
    Row (
        modifier = Modifier
            .padding(top = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            modifier = Modifier
                .size(40.dp)
                .padding(start = 10.dp),
            painter = painterResource(id = R.drawable.myapp_hamburger),
            contentDescription = null
        )
        Image(
            modifier = Modifier
                .size(40.dp)
                .padding(end = 10.dp),
            painter = painterResource(id = R.drawable.myapp_bell_icon),
            contentDescription = null
        )
    }
}