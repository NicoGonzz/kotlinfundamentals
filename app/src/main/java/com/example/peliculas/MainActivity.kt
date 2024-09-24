package com.example.peliculas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.peliculas.Navigation.AppNavigation
import com.example.peliculas.screen.MovieViewModel
import com.example.peliculas.ui.theme.PeliculasTheme

// Definición de la clase Movie
data class Movie(val name: String, val description: String, val duration: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PeliculasTheme {
                // Crear una instancia del ViewModel para manejar las películas
                val movieViewModel: MovieViewModel = viewModel()

                // Configurar la navegación con el estado de las películas desde el ViewModel
                AppNavigation(movieViewModel.movies) { newMovie ->
                    movieViewModel.addMovie(newMovie) // Agregar nueva película al ViewModel
                }
            }
        }
    }
}