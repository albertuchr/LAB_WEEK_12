package com.example.test_lab_week_12.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PopularMoviesResponse(

    @Json(name = "page")
    val page: Int = 1,

    @Json(name = "results")
    val results: List<Movie> = emptyList()
)
