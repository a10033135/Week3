package com.example.myapplication.database.database.database

import androidx.room.*

@Dao
interface ProfileDatabaseDao {

    @Insert
    fun insert(profile : ProfileSave)

    @Update
    fun update(profile: ProfileSave)


}