package com.example.basic_loginpage_ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic_loginpage_ui.templates.LoginField

@Composable
fun SignUpScreen() {
    Surface {
        Box(
            contentAlignment = Alignment.TopCenter,
            modifier = Modifier
                .fillMaxHeight()
                .background(color = colorResource(id = R.color.my_darkblue))
        ){
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(1f)
                    .height(200.dp)
                    .padding(top = 400.dp),
                painter = painterResource(id = R.drawable.myapp_signup_gradient),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
            )
            Column (
                modifier = Modifier
                    .padding(top = 60.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.size(150.dp),
                    painter = painterResource(id = R.drawable.myapp_logo),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(70.dp))
                LoginField()
                Spacer(modifier = Modifier.height(5.dp))
                val nunitoSans = FontFamily(
                    Font(R.font.nunito_sans_extrabold)
                )
                Text(
                    text = "Cool Vibe , Hot Tunes 🎵",
                    fontSize = 14.sp,
                    color = Color.LightGray,
                    fontFamily = nunitoSans
                )
            }
        }
    }
}