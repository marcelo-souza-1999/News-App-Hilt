package com.marcelo.newsapi.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.marcelo.newsapi.R
import com.marcelo.newsapi.ui.adapter.NewsAdapter
import com.marcelo.newsapi.ui.viewmodel.NewsViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.main_fragment.*

@AndroidEntryPoint
class NewsFragment : Fragment(R.layout.main_fragment) {

    private val viewModel: NewsViewModel by viewModels()

    /*private val viewModel by viewModels<NewsViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                val newsDbDataSource = NewsDbDataSource()
                //val newsApiDataSource = NewsRetrofitApiDataSource(WebApiAccess.newsApi)
                val newsApiDataSource = NewsFANApiDataSource()
                val newsRepository = NewsRepository(requireContext(), newsDbDataSource, newsApiDataSource)

                return NewsViewModel(newsRepository) as T
            }
        }
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.articlesEvent.observe(viewLifecycleOwner, Observer {
            with(recyclerArticles) {
                setHasFixedSize(true)
                adapter = NewsAdapter(it)
            }
        })

        viewModel.getNews()
    }

}
