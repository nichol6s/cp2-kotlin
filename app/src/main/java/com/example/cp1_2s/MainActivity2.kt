package com.example.cp1_2s

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Obtém os dados do Intent
        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        // Passa os dados para o DisplayFragment
        val displayFragment = DisplayFragment.newInstance(name, email, password)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, displayFragment)
            .commit()
    }
}
