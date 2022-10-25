package com.barstool.kamilkzadaniezalegle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "Kamil Kozłowski"
        val textView = findViewById<TextView>(R.id.etykieta)
        val editText = findViewById<TextInputEditText>(R.id.TextInputEditText)
        findViewById<Button>(R.id.btn1).setOnClickListener {
            textView.text = textView.text.toString() + editText.text.toString()
        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            textView.text = name
        }
    }
}