package com.beelabs.nyamnyam.ui.activity.auth.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentLoginBinding
import com.beelabs.nyamnyam.ui.activity.auth.dialog.BottomSheetInputOtp

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLoginBinding
        get() = FragmentLoginBinding::inflate

    override fun setup() {
        binding.btnDemo.setOnClickListener {
            BottomSheetInputOtp().show(parentFragmentManager, "")
        }
    }
}
