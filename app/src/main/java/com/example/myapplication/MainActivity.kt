package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       intent = Intent(this,MainActivity2::class.java)
        findViewById<ImageView>(R.id.nexticon).setOnClickListener {
            startActivity(intent)
        }
    }
}