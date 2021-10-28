package com.marcelo.newsapi.data.services

import com.marcelo.newsapi.BuildConfig
import com.marcelo.newsapi.data.model.ErrorResponse
import com.marcelo.newsapi.data.model.NewsResponse
import com.haroldadmin.cnradapter.NetworkResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiClient {

    @GET("top-headlines?country=br")
    suspend fun getNews(
        @Query("category") category: String = "technology",
        @Query("apiKey") apiKey: String = BuildConfig.KEY_NEWS_API
    ): NetworkResponse<NewsResponse, ErrorResponse>
}