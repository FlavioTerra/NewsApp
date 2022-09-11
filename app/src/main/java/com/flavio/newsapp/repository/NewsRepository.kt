package com.flavio.newsapp.repository

import com.flavio.newsapp.api.RetrofitInstance
import com.flavio.newsapp.db.ArticleDatabase
import com.flavio.newsapp.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, page: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, page)

    suspend fun searchNews(searchQuery: String, page: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, page)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}