package com.example.basic_loginpage_ui.templates

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic_loginpage_ui.R

@Preview
@Composable
fun LoginField() {
    Card (
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(450.dp),
        shape = RoundedCornerShape(30.dp)
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
        ){
            val nightBlue = colorResource(id = R.color.my_nightblue)
            val nunitonSans = FontFamily(
                Font(R.font.nunito_sans_extrabold, FontWeight.Bold)
            )
            val ptSans = FontFamily(
                Font(R.font.pt_sans_regular , FontWeight.Normal)
            )
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = nightBlue),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Create Account",
                    color = Color.LightGray,
                    fontSize = 28.sp,
                    fontFamily = nunitonSans
                )
                Spacer(modifier = Modifier.height(20.dp))
                UsernameTextField()
                PasswordTextField()
                Spacer(modifier = Modifier.height(15.dp))
                SignUpButton()
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Gray,
                                fontSize = 16.sp,
                                fontFamily = ptSans
                            )
                        ){

                            append("Already have an account? ")

                        }
                        withStyle(
                            style = SpanStyle(
                                color = colorResource(id = R.color.my_orange),
                                fontSize = 16.sp,
                                fontFamily = ptSans
                            )
                        ){

                            append("Login?")

                        }
                    }
                )
            }
        }
    }
}
