package com.shital.kotlinall.Retrofit.post


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Utils_Post {


    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"


    fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}