package com.cafe.safariv20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

            val registerButton = findViewById<Button>(R.id.registerButton)
            registerButton.setOnClickListener {
                val username = findViewById<EditText>(R.id.username_edittext).text.toString()
                val email = findViewById<EditText>(R.id.email_edittext).text.toString()
                val password = findViewById<EditText>(R.id.password_edittext).text.toString()
                val confirmPassword = findViewById<EditText>(R.id.confirm_password_edittext).text.toString()
                // you can add your logic here like check if the passwords match and email is valid and register the user
            }

    }
}