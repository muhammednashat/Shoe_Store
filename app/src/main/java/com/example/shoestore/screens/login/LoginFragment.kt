package com.example.shoestore.screens.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.shoestore.R
import com.example.shoestore.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_login, container, false,
        )

        setListeners()

        return binding.root
    }


    private fun setListeners() {
        val clickableViews: List<View> = listOf(binding.btLogin, binding.btNewAccount)


        for (item in clickableViews) {
            item.setOnClickListener { onNavigatToWelcome() }
        }
    }

    private fun onNavigatToWelcome() {
        findNavController().navigate(LoginFragmentDirections.actionLoginToWelcomeFragment())
    }

}