package com.shital.kotlinall.Retrofit.post

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Repository_POST (private var repo: Api_POST)  //add entryDatabse parameter for DB
{

    private val getLiveData= MutableLiveData<Model_Post>()
    val  postRecord: LiveData<Model_Post>
        get() = getLiveData

    suspend fun PostData(body:String,id: Int,title: String,userId: Int){


        val result=repo.createPost(body,id,title,userId)

        if (result?.body()!=null){

            getLiveData.postValue(result.body())

        }
    }
}