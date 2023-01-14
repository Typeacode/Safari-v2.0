package com.cafe.safariv20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            val username = findViewById<EditText>(R.id.username_edittext).text.toString()
            val password = findViewById<EditText>(R.id.password_edittext).text.toString()
            // you can add your logic here like check if user exist or not in database and redirect to other activity
        }
    }
}