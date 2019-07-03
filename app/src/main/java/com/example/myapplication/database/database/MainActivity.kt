package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.*
import androidx.room.*

import com.example.myapplication.database.database.database.ProfileDatabaseDao
import com.example.myapplication.database.database.database.ProfileSave
import com.example.myapplication.databinding.ActivityMainBinding


@Database(entities = [(ProfileSave::class)],version = 1)

class MainActivity : AppCompatActivity() {
    private lateinit var database: ProfileDatabaseDao
    private var ProfileSaveData = MutableLiveData<ProfileSave?>()
    private lateinit var binding: ActivityMainBinding
    var SaveName: String? = null
    var SaveNickName: String? = null
    var SaveAbout: String? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.SaveButton.setOnClickListener {



        }


    }


}



