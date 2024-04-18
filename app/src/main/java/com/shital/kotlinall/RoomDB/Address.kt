package com.shital.kotlinall.RoomDB

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AddressDB")
data class Address(
    @PrimaryKey(autoGenerate = true)
    val ID:Int,
    val cityName:String,
    val distName:String,
    val count:Int)

