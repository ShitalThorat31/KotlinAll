package com.shital.kotlinall.RoomDB

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import androidx.room.RoomDatabase
import com.shital.kotlinall.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RoomDB_SingloneActivity : AppCompatActivity() {

    lateinit var roomDatabase: Address_SingletoneDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_dbactivity)

       roomDatabase=Address_SingletoneDatabase.getDatabase(this)



        GlobalScope.launch {
        roomDatabase.getAddressDao().insertAddress(Address(0,"PUNE","PUNE",1200))
            }


        roomDatabase.getAddressDao().getAll().observe(this,{

            Log.d("ROOMDB","onCreate: $it")
        })
        }

}