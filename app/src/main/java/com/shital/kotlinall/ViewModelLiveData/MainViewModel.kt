package com.shital.kotlinall.ViewModelLiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    var text=MutableLiveData<String>()
    var btnText=MutableLiveData<String>()

    init {
        text.value = "Hey, Subscribe our channel \n App Coders"
        btnText.value = "Subscribe"
    }

    fun updateText() {
        text.value = "Welcome, to our Community \n App Coders"
        btnText.value = "Subscribed"
    }
}