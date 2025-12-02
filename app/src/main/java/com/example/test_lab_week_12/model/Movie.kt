package com.example.test_lab_week_12.model

import com.squareup.moshi.Json

data class Movie(
    @Json(name = "title") val title: String,
    @Json(name = "overview") val overview: String,
    @Json(name = "poster_path") val posterPath: String?,
    @Json(name = "release_date") val releaseDate: String?,
    @Json(name = "popularity") val popularity: Double
)
