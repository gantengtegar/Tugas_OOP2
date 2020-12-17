package com.android.oop2

import android.R
import android.os.Bundle
import android.view.View
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider.getApplicationContext


class HomeActivity : AppCompatActivity() {
    public override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Companion.fragmentManager = supportFragmentManager
        CustomerRoomDatbase = Room.databaseBuilder(
            applicationContext,
            CustomerRoomDatbase::class.java, "userdb"
        ).allowMainThreadQueries().build()


        // Null checking of container
        if (findViewById<View?>(R.id.fragment_container) != null) {
            if (savedInstanceState != null) {
                return
            }
            Companion.fragmentManager.beginTransaction()
                .add(R.id.fragment_container, HomeFragment()).commit()
        }
    }

    companion object {
        var fragmentManager: FragmentManager? = null
        var CustomerRoomDatbase: CustomerRoomDatbase? = null
    }
}