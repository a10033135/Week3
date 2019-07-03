package com.example.myapplication.database.database.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

@Entity(tableName = "Profile_Table")
data class ProfileSave(
    @PrimaryKey(autoGenerate = true)
    var ProfileID : Long =0L,

    @ColumnInfo(name = "Name_Save")
    var Name :String? = binding.NameEdit.text.toString(),

    @ColumnInfo(name = "NickName_Save")
    var NickName : String? = binding.NickNameEdit.text.toString(),

    @ColumnInfo(name = "AboutMe_Save")
    var AboutMe : String? = binding.AboutMeEdit.text.toString()


)

