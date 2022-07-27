package com.example.blogsspot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        //Moving to Signup Activity
        signupButton.setOnClickListener {
            val signupIntent = Intent(this,SignupActivity::class.java)
            startActivity(signupIntent)
        }

        //Moving to Login Activity
        loginButton.setOnClickListener {
            val loginIntent = Intent(this,LoginActivity::class.java)
            startActivity(loginIntent)
        }
    }
}