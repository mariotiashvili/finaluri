package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val emailbutton = findViewById<EditText>(R.id.emailbutton)
        val passwordbutton = findViewById<EditText>(R.id.passwordbutton)
        val createaccount = findViewById<TextView>(R.id.createaccount)
        val forgotpassword = findViewById<TextView>(R.id.forgotpassword)
        val loginbutton = findViewById<TextView>(R.id.loginbutton)


        intent = Intent(this, MainActivity3::class.java)
        findViewById<TextView>(R.id.loginbutton).setOnClickListener {
            var mail = emailbutton.text.toString()
            var pass = passwordbutton.text.toString()
            if (mail == "") {
                Toast.makeText(this, "please enter your email", Toast.LENGTH_LONG).show()
            }
            else if (pass == ""){
                Toast.makeText(this,"please enter your password",Toast.LENGTH_LONG).show()
            }
            else{
                startActivity(intent)
            }

        }

        intent = Intent(this,MainActivity4::class.java)
        findViewById<TextView>(R.id.createaccount).setOnClickListener {
            startActivity(intent)
            intent = Intent(this,MainActivity5::class.java)
            findViewById<TextView>(R.id.forgotpassword).setOnClickListener {
                startActivity(intent)
            }
        }
    }
}