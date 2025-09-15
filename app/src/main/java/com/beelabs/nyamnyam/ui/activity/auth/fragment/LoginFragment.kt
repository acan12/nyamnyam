package com.beelabs.nyamnyam.ui.activity.auth.fragment

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentLoginBinding
import com.beelabs.nyamnyam.ui.activity.auth.dialog.BottomSheetInputOtp
import com.beelabs.nyamnyam.ui.activity.home.HomeActivity

class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentLoginBinding
        get() = FragmentLoginBinding::inflate

    override fun setup() {
        binding.btnDemo.setOnClickListener {
            BottomSheetInputOtp(onContinueClicked = {
                startActivity(Intent(context, HomeActivity::class.java))
                requireActivity().finish()
            }).show(parentFragmentManager, "")
        }
        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}
