package com.keecoding.newsapp.presentation.di

import com.keecoding.newsapp.data.repository.NewsRepositoryImpl
import com.keecoding.newsapp.data.repository.dataSource.NewsLocalDataSource
import com.keecoding.newsapp.data.repository.dataSource.NewsRemoteDataSource
import com.keecoding.newsapp.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

}














