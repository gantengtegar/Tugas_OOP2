package com.android.oop2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "admin")
data class Customer(
    @PrimaryKey val nim: Int,
    @ColumnInfo(name = "id") val id: Int?,
    @ColumnInfo(name = "nama") val nama: String?,
    @ColumnInfo(name = "email") val email: String?
)