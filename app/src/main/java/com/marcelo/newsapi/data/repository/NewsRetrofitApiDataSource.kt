package com.marcelo.newsapi.data.repository

import com.marcelo.newsapi.data.services.NewsApiClient
import com.marcelo.newsapi.data.model.NewsResult
import com.haroldadmin.cnradapter.NetworkResponse

class NewsRetrofitApiDataSource(private val newsApiClient: NewsApiClient) : NewsApiDataSource {

    override suspend fun fetchNews(): NewsResult {
        return when (val newsResponse = newsApiClient.getNews()) {
            is NetworkResponse.Success -> {
                val articles = newsResponse.body.articles
                NewsResult.Success(articles)
            }
            is NetworkResponse.ServerError -> {
                NewsResult.ApiError(newsResponse.code, newsResponse.body?.message)
            }
            else -> NewsResult.UnknownError("Unknown error")
        }
    }
}