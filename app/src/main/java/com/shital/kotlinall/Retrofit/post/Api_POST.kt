package com.shital.kotlinall.Retrofit.post


import retrofit2.Response
import retrofit2.http.*

interface Api_POST {

    @FormUrlEncoded
    @POST("/posts")
   // suspend fun createPost(@Body modelGet: Model_Post):Response<Model_Post>
    suspend fun createPost(
        @Field("body") body: String,
        @Field("id") id: Int,
        @Field("title") title: String,
        @Field("userId") userId: Int):Response<Model_Post>


}