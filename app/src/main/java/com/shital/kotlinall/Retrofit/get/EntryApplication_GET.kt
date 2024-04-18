package com.shital.kotlinall.Retrofit.get

import android.app.Application


class EntryApplication_GET: Application() {

    lateinit var get: Repository_GET

    override fun onCreate() {
        super.onCreate()
        initialize()
    }

    private fun initialize() {
        val userGet=Utils_Get.getInstance().create(Api_Get::class.java)

        get= Repository_GET(userGet)
    }

}