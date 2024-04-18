package com.shital.kotlinall.Retrofit.get


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api_Get {

   // @GET("/posts/1")
    @GET("/quotes")
    //suspend fun getUser():Response<Model_Get>
    suspend fun getUser(@Query("page")page:Int):Response<Model_Get>


}