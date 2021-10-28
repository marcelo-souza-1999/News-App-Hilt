package com.marcelo.newsapi.directory

import com.marcelo.newsapi.data.repository.NewsApiDataSource
import com.marcelo.newsapi.data.repository.NewsFANApiDataSource
import com.marcelo.newsapi.data.repository.NewsRepository
import com.marcelo.newsapi.data.repository.NewsRepositoryInterface
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
        apiDataSource: NewsFANApiDataSource
    ): NewsApiDataSource
}