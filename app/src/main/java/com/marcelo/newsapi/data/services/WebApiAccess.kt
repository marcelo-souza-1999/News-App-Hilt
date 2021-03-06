package com.marcelo.newsapi.data.services

import com.haroldadmin.cnradapter.NetworkResponseAdapterFactory
import com.marcelo.newsapi.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object WebApiAccess {
    val newsApi : NewsApiClient by lazy {

        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.URL_BASE)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(NetworkResponseAdapterFactory())
            .build()

        return@lazy retrofit.create(NewsApiClient::class.java)
    }
}