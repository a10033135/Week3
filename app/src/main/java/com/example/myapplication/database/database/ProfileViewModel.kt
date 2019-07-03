package com.example.myapplication

import android.app.Application
import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import com.example.myapplication.database.database.database.ProfileDatabaseDao
import com.example.myapplication.database.database.database.ProfileSave
import com.example.myapplication.databinding.ActivityMainBinding


class ProfileViewModel(
    val database: ProfileDatabaseDao,
    application: Application) : AndroidViewModel(application) {



    private lateinit var binding: ActivityMainBinding
    private var _name = binding.NameEdit.text.toString()
    val name = ObservableField<String>()

    init {
        name.set(_name)
    }

    private suspend fun updateName(Save:ProfileSave){
        database.update(Save)
    }

    private suspend fun insertName(Save:ProfileSave){
        database.insert(Save)

    }



    suspend fun DOIT (){
        if (ProfileSave() == null){
            insertName(ProfileSave(1,binding.NameEdit.toString(),binding.NickNameEdit.toString(),binding.AboutMeEdit.toString()))
        }

        else{
            updateName(ProfileSave(1,binding.NameEdit.toString(),binding.NickNameEdit.toString(),binding.AboutMeEdit.toString()))
        }


    }



}






