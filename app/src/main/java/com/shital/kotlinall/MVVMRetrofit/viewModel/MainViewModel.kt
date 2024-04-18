package com.shital.kotlinall.MVVMRetrofit.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shital.kotlinall.MVVMRetrofit.Repository.EntryRepo
import com.shital.kotlinall.MVVMRetrofit.model.PublicModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(val repostory: EntryRepo):ViewModel() {

    init {

        viewModelScope.launch (Dispatchers.IO )
            {
                repostory.getEntry()
            }
        }
        val etry:LiveData<PublicModel>
        get()=repostory.entry

}