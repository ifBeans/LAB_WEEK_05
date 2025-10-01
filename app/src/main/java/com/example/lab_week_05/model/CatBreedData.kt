package com.example.lab_week_05.model

import com.squareup.moshi.Json

data class CatBreedData(
    val id: String,
    val name: String,
    val origin: String,
    val temperament: String?,
    @Json(name = "life_span") val lifeSpan: String?,
    @Json(name = "wikipedia_url") val wikipediaUrl: String?
)