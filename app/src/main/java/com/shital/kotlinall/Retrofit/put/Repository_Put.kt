package com.shital.kotlinall.Retrofit.put

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Repository_Put (private var repo: Api_PUT)  //add entryDatabse parameter for DB
{

    private val getLiveData= MutableLiveData<Model_Put>()
    val  postRecord: LiveData<Model_Put>
        get() = getLiveData

    suspend fun PutData(postid:Int,user: Model_Put){

        val result=repo.putPost(postid, user)

        if (result?.body()!=null){

            getLiveData.postValue(result.body())

        }
    }
}