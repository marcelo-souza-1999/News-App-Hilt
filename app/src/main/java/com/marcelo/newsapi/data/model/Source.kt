package com.marcelo.newsapi.data.model

import com.squareup.moshi.Json

data class Source(
    @field:Json(name = "id") val id: Any,
    @field:Json(name = "name") val name: String
)