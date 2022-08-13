package com.example.auction.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserDetails(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name="username")
    val username:String,
    @ColumnInfo(name="password")
    val password:String
)


