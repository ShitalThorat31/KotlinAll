package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.api

import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Pojo_Jokes_
import retrofit2.Response
import retrofit2.http.GET

interface InterfaceJokes {

    @GET("get_memes")
    suspend fun getJokes():Response<Pojo_Jokes>
}