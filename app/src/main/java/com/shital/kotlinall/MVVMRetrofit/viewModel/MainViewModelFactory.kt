package com.shital.kotlinall.MVVMRetrofit.viewModel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shital.kotlinall.MVVMRetrofit.Repository.EntryRepo

class MainViewModelFactory(private val repostory: EntryRepo ): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repostory)as T
    }

}