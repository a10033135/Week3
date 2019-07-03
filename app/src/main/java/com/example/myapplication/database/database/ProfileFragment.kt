package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

import com.example.myapplication.database.database.database.ProfileDatabase
import com.example.myapplication.databinding.ActivityMainBinding


class ProfileFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?
                              , savedInstanceState: Bundle?): View? {
        val binding : ActivityMainBinding = DataBindingUtil.inflate(
                inflater, R.layout.activity_main,container,false)
        val application = requireNotNull(this.activity).application

        val dataSource = ProfileDatabase.getInstance(application).ProfileDatabaseDao
        val viewModelFactory = ProfileViewModelFactory(dataSource,application)

        val profileViewModel=
            ViewModelProviders.of(this,viewModelFactory).get(ProfileViewModel::class.java)

        binding.profileViewModel = profileViewModel
        binding.setLifecycleOwner ( this )

        return binding.root
    }



}