package com.shital.kotlinall.MVVMRetrofit.api

import com.shital.kotlinall.MVVMRetrofit.model.PublicModel
import retrofit2.Response
import retrofit2.http.GET

interface EntryService {

    @GET("/entries")
    suspend fun getEntry():Response<PublicModel>
}
