package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.api.InterfaceJokes_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.api.InterfaceJokes
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes

class MemesRepository (private val interfaceJokes: InterfaceJokes) {

    private val memesLiveData=MutableLiveData<Pojo_Jokes>()

    val memes:LiveData<Pojo_Jokes>
    get() = memesLiveData

    suspend fun getMemes(){
        val result=interfaceJokes.getJokes()

        if(result.body()!=null)
        {
            memesLiveData.postValue(result.body())

        }
    }
}