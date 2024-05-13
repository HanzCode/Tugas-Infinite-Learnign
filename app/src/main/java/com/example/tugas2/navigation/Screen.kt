package com.example.tugas2.navigation

sealed class Screen (val route: String){
    data object HomeScreen : Screen("home")
    data object LazyGridPage: Screen("new")
    data object AboutScreen : Screen("about")
    data object DetailScreen : Screen("detail")

}