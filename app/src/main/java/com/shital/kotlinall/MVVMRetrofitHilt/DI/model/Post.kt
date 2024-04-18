package com.shital.kotlinall.MVVMRetrofitHilt.DI.model

data class Post(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)