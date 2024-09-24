package com.example.peliculas.screen

import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import com.example.peliculas.Movie

class MovieViewModel : ViewModel() {

    var movies = mutableStateListOf<Movie>()

    fun addMovie(movie: Movie) {
        movies.add(movie)
    }
}