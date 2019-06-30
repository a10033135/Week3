package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.database.ProfileDatabase


class ProfileFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val application = requireNotNull(this.activity).application
        val dataSource = ProfileDatabase.getInstance(application).ProfileDatabaseDao

        val viewModelFactory = ProfileViewModelFactory(dataSource,application)
        val profileViewModel=ViewModelProvider(this,viewModelFactory).get(ProfileViewModel::class.java)


        return super.onCreateView(inflater, container, savedInstanceState)
    }



}