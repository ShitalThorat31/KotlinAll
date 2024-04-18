package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository.MemesRepository_
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MemesViewModel_ @Inject constructor(private val memesRepository: MemesRepository_):ViewModel() {

    init {

        viewModelScope.launch(Dispatchers.IO) {

            memesRepository.getMemes()
        }
    }

    val memes:LiveData<Pojo_Jokes_>
    get() = memesRepository.memes
}