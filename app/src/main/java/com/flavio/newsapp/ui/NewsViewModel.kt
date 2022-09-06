package com.flavio.newsapp.ui

import androidx.lifecycle.ViewModel
import com.flavio.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {

}