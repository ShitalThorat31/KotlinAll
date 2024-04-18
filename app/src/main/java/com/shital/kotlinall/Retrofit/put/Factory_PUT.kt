package com.shital.kotlinall.Retrofit.put


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shital.kotlinall.MVVMRetrofit.Repository.EntryRepo

class Factory_PUT(private val repostory: Repository_Put): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModel_PUT(repostory)as T
    }

}