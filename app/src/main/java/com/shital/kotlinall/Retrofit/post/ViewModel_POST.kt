package com.shital.kotlinall.Retrofit.post

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ViewModel_POST(val repostory: Repository_POST):ViewModel() {

    init {

        viewModelScope.launch (Dispatchers.IO )
            {
                repostory.PostData("shital",1000,"myPOST",1100)
            }
        }
        val getData:LiveData<Model_Post>
        get()=repostory.postRecord

}