package com.example.successful_success


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }
    fun toastMe(view: View) {
        val cityChoice = Intent(this, City_Map_Activity::class.java)
        startActivity(cityChoice)
        val settings = Intent(this, settingsActivity::class.java)
        startActivity(settings)
    }

    }
