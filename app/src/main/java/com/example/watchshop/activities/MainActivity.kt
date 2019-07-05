package com.example.watchshop.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.watchshop.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        setUpToolbar()
    }

    private fun setUpToolbar() {
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.main_toolbar)

        if (toolbar != null)
            setSupportActionBar(toolbar)
    }

}

