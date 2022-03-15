package com.example.week2_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val name1 = findViewById<EditText>(R.id.name1)
        val email1 = findViewById<EditText>(R.id.email1)
        val pass1 = findViewById<EditText>(R.id.pass1)
        val buttonloginagain = findViewById<ImageView>(R.id.imageView59)
        val buttonsignup = findViewById<ImageView>(R.id.imageView60)
        buttonsignup.setOnClickListener(){
            val nameSignup = findViewById<TextView>(R.id.textView9)
            val emailSignup = findViewById<TextView>(R.id.textView10)
            val passSignup = findViewById<TextView>(R.id.textView11)

            val myname = name1.text.toString().trim()
            val myemail = email1.text.toString().trim()
            val mypass = pass1.text.toString().trim()
            nameSignup.text = "$myname"
            emailSignup.text = "$myemail"
            passSignup.text = "$mypass"
        }
        buttonloginagain.setOnClickListener(){
            val intent = Intent( this, Login::class.java)
            startActivity(intent)
        }
    }
}