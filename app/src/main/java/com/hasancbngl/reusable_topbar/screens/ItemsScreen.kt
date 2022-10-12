package com.hasancbngl.reusable_topbar.screens

import androidx.compose.foundation.background
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
fun ItemsScreen(navController: NavHostController) {
    ScreenWrapper(title = "Items Screen", navController = navController) { text ->
        Box(
            modifier = Modifier
                .size(250.dp)
                .align(Alignment.CenterHorizontally)
                .background(Color.Yellow)
        ) {
            Text(
                text = "Items Screen text", modifier = Modifier.align(
                    Alignment.Center
                )
            )
            Text(text = text)
        }
    }
}