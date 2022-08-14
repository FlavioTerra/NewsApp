package com.flavio.newsapp.ui

import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.activity_news.*
import androidx.navigation.ui.setupWithNavController
import androidx.appcompat.app.AppCompatActivity
import com.flavio.newsapp.R
import android.os.Bundle

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
    }
}