package com.shital.kotlinall.Retrofit.get

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Repository_GET (private var repo: Api_Get)  //add entryDatabse parameter for DB
{

    private val getLiveData= MutableLiveData<Model_Get>()
    val  postRecord: LiveData<Model_Get>
        get() = getLiveData

    //suspend fun getData(){
    suspend fun getData(page:Int){
        //val result=repo.getUser()
        val result=repo.getUser(page)

        if (result?.body()!=null){

            getLiveData.postValue(result.body())

        }
    }
}