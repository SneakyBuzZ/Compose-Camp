package com.example.basic_loginpage_ui.templates

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basic_loginpage_ui.R

@Preview
@Composable
fun PasswordTextField() {
    val password = remember {
        mutableStateOf(TextFieldValue())
    }
    val ptSans = FontFamily(
        Font(R.font.pt_sans_regular , FontWeight.Normal)
    )
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(62.dp),
        value = password.value,
        onValueChange = {
            password.value = it
        },
        label = {
            Text(
                text = "password",
                color = Color.Gray,
                fontFamily = ptSans
            )
        },
        singleLine = true,
        visualTransformation = PasswordVisualTransformation(),
        shape = RoundedCornerShape(10.dp)
    )
}