package com.shital.kotlinall.MVVMRetrofit.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.shital.kotlinall.MVVMRetrofit.DB.EntryDatabase
import com.shital.kotlinall.MVVMRetrofit.api.EntryService
import com.shital.kotlinall.MVVMRetrofit.model.Entry
import com.shital.kotlinall.MVVMRetrofit.model.PublicModel

class EntryRepo(private var entryService: EntryService, val entryDatabase: EntryDatabase)  //add entryDatabse parameter for DB
{

    private val entryLiveData=MutableLiveData<PublicModel>()
    val  entry:LiveData<PublicModel>
    get() = entryLiveData

    suspend fun getEntry(){
        val result=entryService.getEntry()

        if (result?.body()!=null){

            //insert entry in Room
            entryDatabase.entryDao().addEntry(result.body()!!.entries)

            entryLiveData.postValue(result.body())

        }
    }
}