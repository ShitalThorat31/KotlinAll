package com.shital.kotlinall.Retrofit.post


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shital.kotlinall.MVVMRetrofit.Repository.EntryRepo

class Factory_POST(private val repostory: Repository_POST): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModel_POST(repostory)as T
    }

}