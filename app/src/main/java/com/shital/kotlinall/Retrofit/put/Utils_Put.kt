package com.shital.kotlinall.Retrofit.put


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Utils_Put {


    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"


    fun getInstance(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}