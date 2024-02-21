package com.example.basic_loginpage_ui.templates

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic_loginpage_ui.R

@Composable
fun SignUpButton() {
    val nunitonSans = FontFamily(
        Font(R.font.nunito_sans_extrabold, FontWeight.Bold)
    )
    Button(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(52.dp),
        shape = RoundedCornerShape(10.dp),
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.my_orange),
            contentColor = Color.White
        )
    ) {
        Text(
            text = "Sign Up",
            fontFamily = nunitonSans,
            fontSize = 18.sp
        )
    }
}