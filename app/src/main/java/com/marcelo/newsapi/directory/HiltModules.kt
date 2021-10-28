package com.marcelo.newsapi.directory

import com.marcelo.newsapi.data.repository.*
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
abstract class HiltModules {

    @Singleton
    @Binds
    abstract fun bindNewsRepository(
        newsRepository: NewsRepository
    ): NewsRepositoryInterface

    @Singleton
    @Binds
    abstract fun bindApiDataSource(
        apiDataSource: NewsRetrofitApiDataSource
    ): NewsApiDataSource
}