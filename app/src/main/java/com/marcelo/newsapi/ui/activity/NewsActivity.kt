package com.marcelo.newsapi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marcelo.newsapi.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}
