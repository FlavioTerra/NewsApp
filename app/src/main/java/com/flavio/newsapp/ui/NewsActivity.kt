package com.flavio.newsapp.ui

import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_news.*
import androidx.navigation.ui.setupWithNavController
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.flavio.newsapp.databinding.ActivityNewsBinding
import com.flavio.newsapp.db.ArticleDatabase
import com.flavio.newsapp.repository.NewsRepository

class NewsActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityNewsBinding.inflate(layoutInflater)
    }

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application, newsRepository)
        viewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)

        binding.bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
        setContentView(binding.root)
    }
}