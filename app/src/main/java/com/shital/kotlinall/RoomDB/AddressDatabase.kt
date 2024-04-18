package com.shital.kotlinall.RoomDB

import android.content.Context
import android.os.Build
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Address::class], version = 1)
abstract class AddressDatabase : RoomDatabase() {

    abstract fun getAddressDao():AddressDAO



}