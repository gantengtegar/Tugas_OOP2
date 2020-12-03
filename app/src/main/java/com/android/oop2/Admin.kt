package com.android.oop2

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "admin")
data class Admin(
    @PrimaryKey val nim: Int,
    @ColumnInfo(name = "nama") val nama: String?,
    @ColumnInfo(name = "username") val prodi: String?
)