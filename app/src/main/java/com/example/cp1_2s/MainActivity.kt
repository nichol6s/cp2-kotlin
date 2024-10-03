package com.example.cp1_2s

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var buttonAbrir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//        buttonAbrir = findViewById<Button>(R.id.btnStart)
//        buttonAbrir.setOnClickListener {
//            var navegarSegundaTela = Intent(this, MainActivity2::class.java)
//            startActivity(navegarSegundaTela)
//        }

        val formFragment = FormFragment()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_form, formFragment)
            .commit()
    }
}