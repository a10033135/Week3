package com.example.myapplication.database

import android.content.Context
import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ProfileSave::class],version = 1,exportSchema = false)
abstract class ProfileDatabase : RoomDatabase(){

    abstract val ProfileDatabaseDao : ProfileDatabaseDao

    companion object{

        @Volatile
        private var INSTANCE : ProfileDatabase? =null

        fun getInstance(context:Context):ProfileDatabase{
            synchronized(this){
                var instance = INSTANCE

                if (instance == null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ProfileDatabase::class.java,
                        "sleep_history_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                        INSTANCE = instance
                    }
                return instance
            }
        }
    }


}