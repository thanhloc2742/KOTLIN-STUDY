package com.example.week2_group2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val imageback = findViewById<ImageView>(R.id.imageback)
        val email_login = findViewById<EditText>(R.id.email_login)
        val pass_login = findViewById<EditText>(R.id.pass_login)
        val imageLogin = findViewById<ImageView>(R.id.imageLogin)

        imageLogin.setOnClickListener(){
            val intent = Intent( this, Profile::class.java)
            val bundle = Bundle()
            bundle.putString("email", email_login.text.toString().trim())
            bundle.putString("pass", pass_login.text.toString().trim())
            intent.putExtras(bundle)

            if (email_login.text.toString().trim() == "ronaldo@gmail.com" && pass_login.text.toString().trim() == "123456") {
                startActivity(intent)
            }
        }
        imageback.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent)
        }
    }
}