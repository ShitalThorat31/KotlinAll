package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.api.InterfaceJokes_
import javax.inject.Inject

class MemesRepository_ @Inject constructor(private val interfaceJokes: InterfaceJokes_) {

    private val memesLiveData=MutableLiveData<Pojo_Jokes_>()

    val memes:LiveData<Pojo_Jokes_>
    get() = memesLiveData

    suspend fun getMemes(){
        val result=interfaceJokes.getJokes()

        if(result.body()!=null)
        {
            memesLiveData.postValue(result.body())

        }
    }
}