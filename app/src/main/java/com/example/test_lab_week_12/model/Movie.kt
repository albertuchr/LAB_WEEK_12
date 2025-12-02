package com.example.test_lab_week_12.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Movie(

    @Json(name = "id")
    val id: Int = 0,

    @Json(name = "title")
    val title: String? = null,

    @Json(name = "overview")
    val overview: String? = null,

    @Json(name = "poster_path")
    val posterPath: String? = null,

    @Json(name = "release_date")
    val releaseDate: String? = null,

    @Json(name = "popularity")
    val popularity: Double = 0.0,

    @Json(name = "vote_average")
    val voteAverage: Double = 0.0
)
