package com.shital.kotlinall.Retrofit.put

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel_PUT(val repostory: Repository_Put):ViewModel() {

    init {

        viewModelScope.launch (Dispatchers.IO )
            {
                val putPost=Model_Put("shital",1000,"myPOST",1100)
                repostory.PutData(5,putPost)
            }
        }
        val getData:LiveData<Model_Put>
        get()=repostory.postRecord

}