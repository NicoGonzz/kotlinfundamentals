package com.example.peliculas.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.peliculas.Movie

@Composable
fun ViewMoviesScreen(movies: List<Movie>, onBackClick: () -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Películas ingresadas:", style = MaterialTheme.typography.titleMedium)

        if (movies.isEmpty()) {
            Text(text = "No hay películas agregadas.", style = MaterialTheme.typography.bodyMedium)
        } else {
            movies.forEach { movie ->
                MovieItem(movie)
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onBackClick) {
            Text("Volver")
        }
    }
}

@Composable
fun MovieItem(movie: Movie) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
        Text(text = "Nombre: ${movie.name}", style = MaterialTheme.typography.bodyLarge)
        Text(text = "Descripción: ${movie.description}", style = MaterialTheme.typography.bodyMedium)
        Text(text = "Duración: ${movie.duration} minutos", style = MaterialTheme.typography.bodyMedium)
    }
}

@Preview(showBackground = true)
@Composable
fun ViewMoviesPreview() {
    ViewMoviesScreen(movies = listOf(
        Movie("Inception", "A mind-bending thriller", "148"),
        Movie("Titanic", "A tragic love story", "195")
    ), onBackClick = {})
}