package com.example.myapplication

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.database.ProfileDatabaseDao

class   ProfileViewModelFactory(
        private val dataSource: ProfileDatabaseDao,
        private val application: Application):ViewModelProvider.Factory{

    @Suppress("unchecked_cast")
    override fun <T :ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ProfileViewModel::class.java)){

            return ProfileViewModel(dataSource,application) as T
        }

        throw IllegalAccessException("Unknown ViewModel class")
    }



}

