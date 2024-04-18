package com.shital.kotlinall.RoomDB

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import androidx.room.RoomDatabase
import com.shital.kotlinall.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RoomDBActivity : AppCompatActivity() {

    lateinit var roomDatabase: AddressDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_dbactivity)

       // roomDatabase=AddressDatabase.getDatabase(this)

        roomDatabase= Room.databaseBuilder(
                            applicationContext,
                            AddressDatabase::class.java,
                      "AddressDB").build()

        GlobalScope.launch {
        roomDatabase.getAddressDao().insertAddress(Address(0,"PUNE","PUNE",1000))
            }


        roomDatabase.getAddressDao().getAll().observe(this,{

            Log.d("ROOMDB","onCreate: $it")
        })
        }

}