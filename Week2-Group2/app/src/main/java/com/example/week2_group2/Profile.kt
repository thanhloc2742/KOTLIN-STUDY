package com.example.week2_group2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val bundle = intent.extras
        bundle?.let{
            val email = it.getString( "email")
            val pass = it.getString( "pass")
            val textview8 = findViewById<TextView>(R.id.textView8)
            textview8.text = "$email -- $pass"
        }
    }
}