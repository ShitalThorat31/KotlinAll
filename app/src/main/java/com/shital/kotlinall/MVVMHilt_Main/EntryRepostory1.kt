//package com.shital.kotlinall.MVVMHilt_Main
//
//import androidx.lifecycle.LiveData
//import androidx.lifecycle.MutableLiveData
//
//import javax.inject.Inject
//
//class EntryRepostory1 @Inject constructor(private var entryService: EntryService1, val entryDatabase: EntryDatabase1)  //add entryDatabse parameter for DB
//{
//
//    private val entryLiveData=MutableLiveData<PublicModel1>()
//    val  entry:LiveData<PublicModel1>
//    get() = entryLiveData
//
//    suspend fun getEntry(){
//        val result=entryService.getEntry()
//
//        if (result?.body()!=null){
//
//            //insert entry in Room
//            entryDatabase.entryDao().addEntry(result.body()!!.entries)
//
//            entryLiveData.postValue(result.body())
//
//        }
//    }
//}