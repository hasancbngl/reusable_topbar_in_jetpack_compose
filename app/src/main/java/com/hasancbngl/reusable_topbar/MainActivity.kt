package com.hasancbngl.reusable_topbar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hasancbngl.reusable_topbar.mainscreen.ItemsScreen
import com.hasancbngl.reusable_topbar.mainscreen.MainScreen
import com.hasancbngl.reusable_topbar.ui.theme.ReusableTopbarDemoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ReusableTopbarDemoAppTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                SetupNavGraph(navController)
            }
        }
    }

    @Composable
    fun SetupNavGraph(
        navController: NavHostController
    ) {
        NavHost(navController = navController, startDestination = "main_screen") {
            composable(route = "main_screen") {
                MainScreen(navController = navController)
            }
            composable(route = "items_screen") {
                ItemsScreen(navController = navController)
            }
        }
    }
}
