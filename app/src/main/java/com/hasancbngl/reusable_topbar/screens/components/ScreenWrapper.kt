package com.hasancbngl.reusable_topbar.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun ScreenWrapper(
    title: String,
    navController: NavHostController,
    content: @Composable ColumnScope.(
        text: String,
    ) -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(title,
            onBackButtonClick = {
                navController.navigateUp()
            },
            onHomeButtonClick = {
                navController.navigate("main_screen") {
                    popUpTo("main_screen")
                }
            }
        )
        content(this,"This Text From ScreenWrapper")
    }
}