package com.android.oop2

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Admin::class), version = 1)
abstract class CustomerRoomDatbase : RoomDatabase() {
    abstract fun mahasiswaDao(): AdminDao

    abstract val applicationContext: Context
    val db = Room.databaseBuilder(
        applicationContext,
        AdminRoomDatabase::class.java, "APPDB"
    ).build()
}