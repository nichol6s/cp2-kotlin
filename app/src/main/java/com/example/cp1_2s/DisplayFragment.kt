package com.example.cp1_2s

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DisplayFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_display, container, false)

        val textViewName: TextView = view.findViewById(R.id.textViewName)
        val textViewEmail: TextView = view.findViewById(R.id.textViewEmail)
        val textViewPassword: TextView = view.findViewById(R.id.textViewPassword)

        arguments?.let {
            textViewName.text = "Name: ${it.getString("name")}"
            textViewEmail.text = "Email: ${it.getString("email")}"
            textViewPassword.text = "Password: ${it.getString("password")}"
        }

        return view
    }
}
