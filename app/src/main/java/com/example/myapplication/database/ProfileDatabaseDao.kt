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


}