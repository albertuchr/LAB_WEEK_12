package com.example.test_lab_week_12

import com.example.test_lab_week_12.api.MovieService
import com.example.test_lab_week_12.model.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class MovieRepository(private val movieService: MovieService) {

    private val apiKey = "bbe564cca8a5bd09181189b7e8379db7"

    // Flow that emits list of movies
    fun fetchMovies(): Flow<List<Movie>> = flow {
        val response = movieService.getPopularMovies(apiKey)
        emit(response.results)
    }.flowOn(Dispatchers.IO)
}
