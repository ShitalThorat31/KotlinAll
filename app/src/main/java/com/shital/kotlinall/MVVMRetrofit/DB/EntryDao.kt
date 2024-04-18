package com.shital.kotlinall.MVVMRetrofit.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.shital.kotlinall.MVVMRetrofit.model.Entry

@Dao
interface EntryDao {

        @Insert
        suspend fun addEntry(entry: List<Entry>)

        @Query("SELECT * from EntryTable")
        fun getALLEntry():List<Entry>
}

