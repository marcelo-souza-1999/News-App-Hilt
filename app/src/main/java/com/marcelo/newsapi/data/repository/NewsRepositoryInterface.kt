package com.marcelo.newsapi.data.repository

import com.marcelo.newsapi.data.model.NewsResult

interface NewsRepositoryInterface {

    suspend fun getNews(): NewsResult
}