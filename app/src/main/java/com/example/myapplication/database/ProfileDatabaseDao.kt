package com.example.myapplication.database

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProfileDatabaseDao {

    @Insert
    fun insert(profile : ProfileSave)

    @Update
    fun update(profile: ProfileSave)

    @Query("DELETE FROM profile_data")
    fun clear()

    @Query("SELECT * FROM Profile_Data ORDER BY ProfileID")
    fun getAllProfile():LiveData<List<ProfileSave>>

    @Query("SELECT * FROM Profile_Data ORDER BY ProfileID DESC LIMIT 1")
    fun getFirst():ProfileSave?


}