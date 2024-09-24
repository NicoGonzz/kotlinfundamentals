package com.example.peliculas.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.peliculas.Movie
import com.example.peliculas.screen.MovieFormScreen
import com.example.peliculas.screen.ViewMoviesScreen

@Composable
fun AppNavigation(movies: List<Movie>, onMovieAdded: (Movie) -> Unit) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "movie_form") {
        composable("movie_form") {
            MovieFormScreen(navController, onMovieAdded)
        }
        composable("view_movies") {
            ViewMoviesScreen(movies) {
                navController.popBackStack()
            }
        }
    }
}