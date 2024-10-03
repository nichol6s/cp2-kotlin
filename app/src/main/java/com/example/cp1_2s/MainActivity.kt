package com.example.cp1_2s

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var buttonAbrir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonAbrir = findViewById<Button>(R.id.btnStart)
        buttonAbrir.setOnClickListener {
            var navegarSegundaTela = Intent(this, MainActivity2::class.java)
            startActivity(navegarSegundaTela)
        }
    }
}