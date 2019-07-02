package com.example.myapplication

import android.app.Application
import androidx.lifecycle.*
import com.example.myapplication.database.ProfileDatabaseDao
import com.example.myapplication.database.ProfileSave
import com.example.myapplication.databinding.ActivityMainBinding
import androidx.databinding.ObservableField


class ProfileViewModel(
    val database: ProfileDatabaseDao,
        application: Application) : AndroidViewModel(application) {

    private var viewModelJob = Job()
    private lateinit var binding: ActivityMainBinding
    private val _navigateToProfileTracker = MutableLiveData<Boolean?>()
    private var Profile = MutableLiveData<ProfileSave?>()


    private var _name = "123"
    val name = ObservableField<String>()
    init{
        name.set(_name)
    }

        val newProfile = ProfileSave()


    }







