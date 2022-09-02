package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.greeting_button)
        button.setOnClickListener {
            Log.v("Hello world","BUTTON CLICKED")
            Toast.makeText(this, "HERE'S A TOAST MESSAGE", Toast.LENGTH_SHORT).show()
        }
    }
}