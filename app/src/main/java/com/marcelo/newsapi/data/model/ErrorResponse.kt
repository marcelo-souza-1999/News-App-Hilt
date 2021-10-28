package com.marcelo.newsapi.data.model

import com.squareup.moshi.Json

data class ErrorResponse(
    @field:Json(name = "message") val message: String
)