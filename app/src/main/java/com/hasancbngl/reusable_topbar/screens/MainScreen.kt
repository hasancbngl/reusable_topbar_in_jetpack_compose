package com.hasancbngl.reusable_topbar.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.hasancbngl.reusable_topbar.screens.components.ScreenWrapper

@Composable
fun MainScreen(navController: NavHostController) {
    ScreenWrapper(title = "Main Screen", navController = navController) { text ->
        Box(
            modifier = Modifier
                .size(250.dp)
                .align(Alignment.CenterHorizontally)
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
            Text(text = text)
        }
    }
}