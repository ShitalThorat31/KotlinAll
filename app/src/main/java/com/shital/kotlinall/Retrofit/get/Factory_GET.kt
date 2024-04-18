package com.shital.kotlinall.Retrofit.get


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shital.kotlinall.MVVMRetrofit.Repository.EntryRepo

class Factory_GET(private val repostory: Repository_GET): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModel_GET(repostory)as T
    }

}