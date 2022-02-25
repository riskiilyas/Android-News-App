package com.keecoding.newsapp.domain.usecase

import com.keecoding.newsapp.data.model.Article
import com.keecoding.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}