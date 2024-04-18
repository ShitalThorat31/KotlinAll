//package com.shital.kotlinall.MVVMHilt_Main
//
//import android.content.Context
//import androidx.room.Database
//import androidx.room.Room
//import androidx.room.RoomDatabase
//
//@Database(entities = [Entry::class], version = 1)
//abstract class EntryDatabase1:RoomDatabase() {
//
//    abstract fun entryDao(): EntryDao1
//
//    companion object{
//        @Volatile
//        private var INSTANCE: EntryDatabase1? = null
//
//        fun getDatabase(context: Context): EntryDatabase1 {
//            if (INSTANCE == null) {
//                synchronized(this){
//                    INSTANCE = Room.databaseBuilder(context,
//                        EntryDatabase1::class.java,
//                        "entryDB")
//                        .build()
//                }
//            }
//            return INSTANCE!!
//        }
//    }
//}