package com.example.successful_success


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class City_Map_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_city_map)

        val greeting = findViewById<TextView>(R.id.greeting)
        greeting.setText(R.string.city_map_activity)
    }
}