package com.example.basic_loginpage_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.basic_loginpage_ui.templates.HomeScreen
import com.example.basic_loginpage_ui.templates.SignUpScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            This is my SignUp Page
//            SignUpScreen()
//            This is my Home Page
            HomeScreen()
        }
    }
}