package com.example.menunavegaciontaller

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.menunavegaciontaller.model.BottomBarScreen
import com.example.menunavegaciontaller.screens.HomeScreen
import com.example.menunavegaciontaller.screens.ProfileScreen
import com.example.menunavegaciontaller.screens.SettingsScreen

/****
 * Project: MenuNavegacionTaller
 * From: com.example.menunavegaciontaller
 * Created by: Victor Sanjines Lopez on 23/12/2022 at 17:56
 * More info: www.relativity.com.bo
 * All rights reserved 2022
 ****/
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) { HomeScreen() }
        composable(route = BottomBarScreen.Profile.route) { ProfileScreen() }
        composable(route = BottomBarScreen.Settings.route) { SettingsScreen() }
    }
}






























