package com.example.myapplication.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Profile_Data")
data class ProfileSave(
    @PrimaryKey(autoGenerate = true)
    var ProfileID : Long =0L,

    @ColumnInfo(name = "Name_Save")
    var Name : String? ,

    @ColumnInfo(name = "NickName_Save")
    var NickName : String?,

    @ColumnInfo(name = "AboutMe_Save")
    var AboutMe : String?


)

