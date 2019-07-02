package com.example.myapplication

import android.app.Application
import android.content.Context
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.*
import androidx.room.*
import com.example.myapplication.database.ProfileDatabase
import com.example.myapplication.database.ProfileDatabaseDao
import com.example.myapplication.database.ProfileSave
import com.example.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.jar.Attributes
import javax.sql.CommonDataSource

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


    }


}



