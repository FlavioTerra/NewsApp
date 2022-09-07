package com.flavio.newsapp.repository

import com.flavio.newsapp.api.RetrofitInstance
import com.flavio.newsapp.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, page: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, page)

    suspend fun searchNews(searchQuery: String, page: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, page)
}