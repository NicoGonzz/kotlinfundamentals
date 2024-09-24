package com.example.peliculas.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.peliculas.Movie

@Composable
fun MovieFormScreen(navController: NavController, onMovieAdded: (Movie) -> Unit) {
    var movieName by remember { mutableStateOf("") }
    var movieDescription by remember { mutableStateOf("") }
    var movieDuration by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        OutlinedTextField(
            value = movieName,
            onValueChange = { movieName = it },
            label = { Text("Nombre de la película") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = movieDescription,
            onValueChange = { movieDescription = it },
            label = { Text("Descripción") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = movieDuration,
            onValueChange = { movieDuration = it },
            label = { Text("Duración (minutos)") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                if (movieName.isNotBlank() && movieDescription.isNotBlank() && movieDuration.isNotBlank()) {
                    val newMovie = Movie(movieName, movieDescription, movieDuration)
                    onMovieAdded(newMovie)

                    // Limpiar campos después de agregar y navegar a ver películas
                    movieName = ""
                    movieDescription = ""
                    movieDuration = ""
                    navController.navigate("view_movies")
                }
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text("Enviar")
        }
    }
}