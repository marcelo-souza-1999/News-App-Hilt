package com.marcelo.newsapi.data.repository

import com.marcelo.newsapi.data.model.NewsResult

interface NewsApiDataSource {

    suspend fun fetchNews(): NewsResult
}