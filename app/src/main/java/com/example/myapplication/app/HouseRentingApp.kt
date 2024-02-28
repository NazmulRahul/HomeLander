package com.example.myapplication.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapplication.navigation.AppRouter
import com.example.myapplication.navigation.Screen
import com.example.myapplication.screens.HomeScreen
import com.example.myapplication.screens.LogInScreen
import com.example.myapplication.screens.ShowHomeScreen
import com.example.myapplication.screens.SignUpScreen
import com.example.myapplication.screens.UploadScreen

@Composable
fun HouseRentingApp(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color= Color.White
    ){
        Crossfade(targetState = AppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.LogInScreen -> {
                    LogInScreen()
                }
                is Screen.HomeScreen->{
                    HomeScreen()
                }
                is Screen.ShowHomeScreen->{
                    ShowHomeScreen()
                }
                is Screen.UploadScreen->{
                    UploadScreen()
                }
            }
        }
    }
}