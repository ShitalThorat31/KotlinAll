package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtilities {

    val BASE_URL="https://api.imgflip.com/"

    fun getInstance():Retrofit{

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}