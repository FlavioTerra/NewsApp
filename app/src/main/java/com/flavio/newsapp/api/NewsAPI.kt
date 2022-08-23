package com.flavio.newsapp.api

import com.flavio.newsapp.util.Constants.Companion.API_KEY
import com.flavio.newsapp.models.NewsResponse
import retrofit2.http.Query
import retrofit2.http.GET
import retrofit2.Response

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country") countryCode: String = "br",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ): Response<NewsResponse>
}