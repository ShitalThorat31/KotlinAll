package com.shital.kotlinall.Retrofit.put


import retrofit2.Response
import retrofit2.http.*

interface Api_PUT
{
    @PUT("posts/{id}")
    suspend fun putPost(
        @Path("id") id : Int,
        @Body user: Model_Put
    ):Response<Model_Put>
}