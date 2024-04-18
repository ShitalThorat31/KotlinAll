package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository.MemesRepository
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository.MemesRepository_
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MemesViewModel(private val memesRepository: MemesRepository):ViewModel() {

    init {

        viewModelScope.launch(Dispatchers.IO) {

            memesRepository.getMemes()
        }
    }

    val memes:LiveData<Pojo_Jokes>
    get() = memesRepository.memes
}