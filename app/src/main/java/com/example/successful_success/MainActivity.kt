package com.example.successful_success

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.successful_success.City_Map_Activity as City_Map_Activity1


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1: ImageView = findViewById(R.id.city)
        button1.setOnClickListener{
            val intent = Intent(this, com.example.successful_success.City_Map_Activity::class.java)
            startActivity(intent)
        }

        }
    fun toastMe(view: View) {

        val settings = Intent(this, settingsActivity::class.java)
        startActivity(settings)
    }

}

/*private fun ImageView.setOnClickListener(button1: ImageView) {
    @Override
    fun  onClick(view: View) {
    button1 = Intent(this, City_Map_Activity::class.java)
    startActivity(com.example.successful_success.City_Map_Activity)}

} */
