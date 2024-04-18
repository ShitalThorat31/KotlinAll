package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.api

import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes_
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceJokes_ {

    @GET("get_memes")
    suspend fun getJokes():Response<Pojo_Jokes_>
}