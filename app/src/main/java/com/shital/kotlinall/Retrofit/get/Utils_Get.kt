package com.shital.kotlinall.Retrofit.get


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Utils_Get {

   // private const val BASE_URL = "https://jsonplaceholder.typicode.com/"


    //private const val BASE_URL = "https://quotable.io/quotes?page=1"
    private const val BASE_URL = "https://quotable.io/"


    fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}