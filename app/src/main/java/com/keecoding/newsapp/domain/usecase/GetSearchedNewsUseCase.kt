package com.keecoding.newsapp.domain.usecase

import com.keecoding.newsapp.data.model.APIResponse
import com.keecoding.newsapp.data.util.Resource
import com.keecoding.newsapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
     suspend fun execute(country:String,searchQuery:String,page:Int): Resource<APIResponse>{
         return newsRepository.getSearchedNews(country,searchQuery,page)
     }
}