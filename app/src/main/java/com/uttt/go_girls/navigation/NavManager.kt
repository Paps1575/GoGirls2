package com.uttt.go_girls.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.uttt.go_girls.viewModel.MainViewModel
import com.uttt.go_girls.views.MainScreen
import com.uttt.go_girls.views.MapScreen

@Composable
fun NavManager(mainViewModel: MainViewModel) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            MapScreen(navController)
        }
        composable("Api"){
            MainScreen(mainViewModel)
        }
    }
}