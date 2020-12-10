package com.android.oop2

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CustomerDao {
    @Query("SELECT * FROM admin")
    fun getAll(): List<Admin>

    @Query("SELECT * FROM admin WHERE nim IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Admin>

    @Query("SELECT * FROM admin WHERE nama LIKE :nama AND " +
            "username LIKE :username LIMIT 1")
    fun findByName(nama: String, prodi: String): Admin

    @Insert
    fun insertAll(vararg Admin: Admin)

    @Delete
    fun delete(Admin: Admin)
}