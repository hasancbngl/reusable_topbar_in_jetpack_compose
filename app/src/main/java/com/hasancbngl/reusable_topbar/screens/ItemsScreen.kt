package com.hasancbngl.reusable_topbar.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.hasancbngl.reusable_topbar.screens.components.TopBar

@Composable
fun ItemsScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar("Items Screen",
            onBackButtonClick = {
                navController.navigateUp()
            },
            onHomeButtonClick = {
                navController.navigate("main_screen") {
                    popUpTo("main_screen")
                }
            }
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow)
        ) {
            Text(
                text = "Items Screen text", modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
    }
}