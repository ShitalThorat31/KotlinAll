package com.shital.kotlinall.MVVMRetrofit.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.shital.kotlinall.MVVMRetrofit.model.Entry

@Database(entities = [Entry::class], version = 1)
abstract class EntryDatabase:RoomDatabase() {

    abstract fun entryDao(): EntryDao

    companion object{
        @Volatile
        private var INSTANCE: EntryDatabase? = null

        fun getDatabase(context: Context): EntryDatabase {
            if (INSTANCE == null) {
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context,
                        EntryDatabase::class.java,
                        "entryDB")
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}