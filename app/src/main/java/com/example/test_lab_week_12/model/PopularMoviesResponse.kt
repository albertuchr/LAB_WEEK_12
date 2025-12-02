package com.example.test_lab_week_12.model

import com.squareup.moshi.Json

data class PopularMoviesResponse(
    @Json(name = "results")
    val results: List<Movie>
)
