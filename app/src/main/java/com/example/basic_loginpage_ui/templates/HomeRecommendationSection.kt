package com.example.basic_loginpage_ui.templates

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basic_loginpage_ui.R

@Composable
fun HomeRecommendationSection() {
    Column (
        modifier = Modifier
    ){
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(400.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            val nunitonSans = FontFamily(
                Font(R.font.nunito_sans_extrabold, FontWeight.Bold)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 15.dp)
            ){
                Text(
                    text = "You may also like..",
                    color = Color.LightGray,
                    fontSize = 24.sp,
                    fontFamily = nunitonSans,
                    textAlign = TextAlign.Left
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
            Card (
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .height(73.dp),
                shape = RoundedCornerShape(20.dp),
            ){
                val nightBlue = colorResource(id = R.color.my_nightblue)
                val nunitonSans = FontFamily(
                    Font(R.font.nunito_sans_extrabold, FontWeight.Bold)
                )
                val ptSans = FontFamily(
                    Font(R.font.pt_sans_regular , FontWeight.Normal)
                )
                Row (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = nightBlue)
                        .padding(start = 8.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        modifier = Modifier.size(55.dp),
                        painter = painterResource(id = R.drawable.myapp_doubletake),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Double Take",
                        color = Color.LightGray,
                        fontSize = 18.sp,
                        fontFamily = ptSans
                    )
                    Spacer(modifier = Modifier.width(153.dp))
                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.myapp_music_icon),
                        contentDescription = null
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Card (
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .height(73.dp),
                shape = RoundedCornerShape(20.dp),
            ){
                val nightBlue = colorResource(id = R.color.my_nightblue)
                val nunitonSans = FontFamily(
                    Font(R.font.nunito_sans_extrabold, FontWeight.Bold)
                )
                val ptSans = FontFamily(
                    Font(R.font.pt_sans_regular , FontWeight.Normal)
                )
                Row (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = nightBlue)
                        .padding(start = 8.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        modifier = Modifier.size(55.dp),
                        painter = painterResource(id = R.drawable.myapp_sunflower),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Sunflower",
                        color = Color.LightGray,
                        fontSize = 18.sp,
                        fontFamily = ptSans
                    )
                    Spacer(modifier = Modifier.width(170.dp))
                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.myapp_music_icon),
                        contentDescription = null
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))

            Spacer(modifier = Modifier.height(8.dp))
            Card (
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .height(73.dp),
                shape = RoundedCornerShape(20.dp),
            ){
                val nightBlue = colorResource(id = R.color.my_nightblue)
                val nunitonSans = FontFamily(
                    Font(R.font.nunito_sans_extrabold, FontWeight.Bold)
                )
                val ptSans = FontFamily(
                    Font(R.font.pt_sans_regular , FontWeight.Normal)
                )
                Row (
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = nightBlue)
                        .padding(start = 8.dp),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        modifier = Modifier.size(55.dp),
                        painter = painterResource(id = R.drawable.myapp_eyesclosed),
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Text(
                        text = "Eyes Closed",
                        color = Color.LightGray,
                        fontSize = 18.sp,
                        fontFamily = ptSans
                    )
                    Spacer(modifier = Modifier.width(155.dp))
                    Image(
                        modifier = Modifier
                            .size(25.dp),
                        painter = painterResource(id = R.drawable.myapp_music_icon),
                        contentDescription = null
                    )
                }
            }
        }
    }
}