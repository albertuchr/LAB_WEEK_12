package com.example.test_lab_week_12

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.test_lab_week_12.api.MovieService
import com.example.test_lab_week_12.model.Movie

class MovieRepository(private val movieService: MovieService) {

    private val apiKey = "bbe564cca8a5bd09181189b7e8379db7"

    private val movieLiveData = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> get() = movieLiveData

    private val errorLiveData = MutableLiveData<String>()
    val error: LiveData<String> get() = errorLiveData

    suspend fun fetchMovies() {
        try {
            val response = movieService.getPopularMovies(apiKey)
            movieLiveData.postValue(response.results)
        } catch (e: Exception) {
            errorLiveData.postValue("Error: ${e.message}")
        }
    }
}
