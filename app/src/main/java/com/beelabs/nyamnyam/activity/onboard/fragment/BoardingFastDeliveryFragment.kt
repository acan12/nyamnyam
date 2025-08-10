package com.beelabs.nyamnyam.activity.onboard.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentBoardingFastDeliveryBinding

class BoardingFastDeliveryFragment :
    BaseFragment<FragmentBoardingFastDeliveryBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBoardingFastDeliveryBinding
        get() = FragmentBoardingFastDeliveryBinding::inflate

    override fun setup() {
        binding.logo
        Toast.makeText(requireContext(), "Masuk Setup #2", Toast.LENGTH_LONG).show()
    }
}