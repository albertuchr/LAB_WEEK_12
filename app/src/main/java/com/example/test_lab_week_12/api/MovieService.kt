package com.example.test_lab_week_12.api

import com.example.test_lab_week_12.model.PopularMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {
    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("bbe564cca8a5bd09181189b7e8379db7") apiKey: String
    ): PopularMoviesResponse
}
