package com.shital.kotlinall.Retrofit.get

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel_GET(val repostory: Repository_GET):ViewModel() {

    init {

        viewModelScope.launch (Dispatchers.IO )
            {
                repostory.getData(1)
            }
        }
        val getData:LiveData<Model_Get>
        get()=repostory.postRecord

}