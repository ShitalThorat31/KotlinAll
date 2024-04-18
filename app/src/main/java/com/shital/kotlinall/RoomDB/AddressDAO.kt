package com.shital.kotlinall.RoomDB

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface AddressDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAddress(address: Address)

    @Delete
    suspend fun deleteAddress(address: Address)

    @Query("SELECT * FROM AddressDB")
    fun getAll():LiveData<List<Address>>
}