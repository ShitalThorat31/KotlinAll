package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository.MemesRepository
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository.MemesRepository_

class FactoryModel(private val memesRepository: MemesRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       // return super.create(modelClass)

        return MemesViewModel(memesRepository)as T
    }
}