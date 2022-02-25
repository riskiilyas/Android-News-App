package com.keecoding.newsapp.presentation.di

import android.app.Application
import com.keecoding.newsapp.domain.usecase.*
import com.keecoding.newsapp.presentation.viewmodel.NewsViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FactoryModule {
    @Singleton
    @Provides
  fun provideNewsViewModelFactory(
     application: Application,
     getNewsHeadlinesUseCase: GetNewsHeadlinesUseCase,
     getSearchedNewsUseCase: GetSearchedNewsUseCase,
     saveNewsUseCase: SaveNewsUseCase,
     getSavedNewsUseCase: GetSavedNewsUseCase,
     deleteSavedNewsUseCase: DeleteSavedNewsUseCase
  ):NewsViewModelFactory{
      return NewsViewModelFactory(
          application,
          getNewsHeadlinesUseCase,
          getSearchedNewsUseCase,
          saveNewsUseCase,
          getSavedNewsUseCase,
          deleteSavedNewsUseCase
      )
  }

}








