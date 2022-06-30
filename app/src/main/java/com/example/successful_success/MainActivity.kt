package com.example.successful_success

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 0) {
            supportFragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }
}

 /*   override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
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

private fun ImageView.setOnClickListener(button1: ImageView) {
    @Override
    fun  onClick(view: View) {
    button1 = Intent(this, City_Map_Activity1::class.java)
    startActivity(com.example.successful_success.City_Map_Activity)}

} */
