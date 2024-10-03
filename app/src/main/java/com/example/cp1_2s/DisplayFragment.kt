package com.example.cp1_2s

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class DisplayFragment : Fragment() {

    private lateinit var tvName: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvPassword: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_display, container, false)

        tvName = view.findViewById(R.id.tvName)
        tvEmail = view.findViewById(R.id.tvEmail)
        tvPassword = view.findViewById(R.id.tvPassword)

        // Recebe os argumentos
        val name = arguments?.getString("name")
        val email = arguments?.getString("email")
        val password = arguments?.getString("password")

        // Exibe os dados
        tvName.text = name
        tvEmail.text = email
        tvPassword.text = password

        return view
    }

    companion object {
        fun newInstance(name: String?, email: String?, password: String?): DisplayFragment {
            val fragment = DisplayFragment()
            val args = Bundle()
            args.putString("name", name)
            args.putString("email", email)
            args.putString("password", password)
            fragment.arguments = args
            return fragment
        }
    }
}

