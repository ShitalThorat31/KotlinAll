package com.shital.kotlinall.RoomDB

import android.content.Context
import android.os.Build
import androidx.room.*
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase


@Database(entities = [Address::class], version = 2)
@TypeConverters(Converter::class)
abstract class Address_SingletoneDatabase : RoomDatabase() {

    abstract fun getAddressDao():AddressDAO

    companion object {

        val migration_1_2=object:Migration(1,2){
            override fun migrate(database: SupportSQLiteDatabase) {


                //database.execSQL("ALTER TABLE AddressDB ADD COLUMN villageName String NOT NULL DEFAULT('PuneNew')")
                database.execSQL("ALTER TABLE AddressDB ADD COLUMN count INTEGER NOT NULL DEFAULT(0)")

            }

        }
        @Volatile
        private var INSTANCE: Address_SingletoneDatabase? = null
        fun getDatabase(context: Context): Address_SingletoneDatabase {
            if (INSTANCE == null) {
                synchronized(this)
                {
                    INSTANCE =
                        Room.databaseBuilder(context.applicationContext,
                            Address_SingletoneDatabase::class.java,
                            "address_database")
                            .addMigrations(migration_1_2)
                            .build()
                }
            }
            return INSTANCE!!
        }
    }

}