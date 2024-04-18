package com.shital.kotlinall.MVVMRetrofit.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "EntryTable")
data class Entry(
    @PrimaryKey(autoGenerate = true)
    val ID:Int,
    val API: String,
    val Auth: String,
    val Category: String,
    val Cors: String,
    val Description: String,
    val HTTPS: Boolean,
    val Link: String
)