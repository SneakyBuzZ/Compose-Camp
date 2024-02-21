package com.example.basic_loginpage_ui.templates

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic_loginpage_ui.R

@Composable
fun DiscoverColumn() {
    Column (
        modifier = Modifier
            .padding(top = 80.dp, start = 40.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start
    ) {
        val nunitonSans = FontFamily(
            Font(R.font.nunito_sans_extrabold, FontWeight.Bold)
        )
        Text(
            text = "Discover",
            fontSize = 40.sp,
            color = Color.DarkGray,
            fontFamily = nunitonSans
        )
        Spacer(modifier = Modifier.height(2.dp))
        val discover = remember {
            mutableStateOf(TextFieldValue())
        }
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(0.89f),
            label = {
                Text(
                    text = "Search your favourites"
                )
            },
            value = discover.value,
            onValueChange = {
                discover.value = it
            }
        )
    }
}