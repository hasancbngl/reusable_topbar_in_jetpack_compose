package com.hasancbngl.reusable_topbar.mainscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.hasancbngl.reusable_topbar.TopBar

@Composable
fun MainScreen(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar("Main Screen",
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
                .background(Color.Green)
                .clickable {
                    navController.navigate("items_screen")
                }
        ) {
            Text(
                text = "Main Screen text", modifier = Modifier.align(
                    Alignment.Center
                )
            )
        }
    }
}