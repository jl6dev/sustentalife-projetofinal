
package com.example.sustentaapp.ui
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*

@Composable
fun AppNavHost() {
    val nav = rememberNavController()
    NavHost(navController = nav, startDestination = "home") {
        composable("home") { HomeScreen() }
    }
}
