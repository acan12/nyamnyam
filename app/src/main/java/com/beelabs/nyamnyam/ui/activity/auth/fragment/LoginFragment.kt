package com.beelabs.nyamnyam.ui.activity.auth.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLoginBinding
        get() = FragmentLoginBinding::inflate

    override fun setup() {
        binding.btnDemo.setOnClickListener {
            Toast.makeText(requireActivity(), "Login Fragment", Toast.LENGTH_LONG).show()
        }
    }
}
