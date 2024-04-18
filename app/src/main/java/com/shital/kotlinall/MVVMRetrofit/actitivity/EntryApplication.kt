package com.shital.kotlinall.MVVMRetrofit.actitivity

import android.app.Application
import com.shital.kotlinall.MVVMRetrofit.DB.EntryDatabase
import com.shital.kotlinall.MVVMRetrofit.Repository.EntryRepo
import com.shital.kotlinall.MVVMRetrofit.api.EntryService
import com.shital.kotlinall.MVVMRetrofit.api.RetrofitHelper

class EntryApplication:Application() {

    lateinit var entryRepostory: EntryRepo

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val entryList_PublicModel=RetrofitHelper.getInstance().create(EntryService::class.java)
        val database=EntryDatabase.getDatabase(applicationContext)
         entryRepostory=EntryRepo(entryList_PublicModel,database)
    }

}