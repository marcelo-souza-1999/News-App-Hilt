package com.marcelo.newsapi.directory

import com.haroldadmin.cnradapter.NetworkResponseAdapterFactory
import com.marcelo.newsapi.BuildConfig
import com.marcelo.newsapi.data.services.NewsApiClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RetrofitModule {

    @Singleton
    @Provides
    fun provideNewsApiClient(): NewsApiClient {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.URL_BASE)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(NetworkResponseAdapterFactory())
            .build()
            .create(NewsApiClient::class.java)
    }
}