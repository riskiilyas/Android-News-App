package com.keecoding.newsapp.domain.usecase

import com.keecoding.newsapp.data.model.Article
import com.keecoding.newsapp.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}