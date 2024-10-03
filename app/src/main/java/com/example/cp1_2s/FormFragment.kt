package com.example.cp1_2s

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FormFragment : Fragment() {
    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword: EditText
    private lateinit var buttonSubmit: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        editTextName = view.findViewById(R.id.editTextName)
        editTextEmail = view.findViewById(R.id.editTextEmail)
        editTextPassword = view.findViewById(R.id.editTextPassword)
        buttonSubmit = view.findViewById(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val bundle = Bundle().apply {
                putString("name", editTextName.text.toString())
                putString("email", editTextEmail.text.toString())
                putString("password", editTextPassword.text.toString())
            }
            val displayFragment = DisplayFragment()
            displayFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_form, displayFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
