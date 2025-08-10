package com.beelabs.nyamnyam.activity.onboard.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentBoardingOrderFoodBinding

class BoardingOrderFoodFragment : BaseFragment<FragmentBoardingOrderFoodBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBoardingOrderFoodBinding
        get() = FragmentBoardingOrderFoodBinding::inflate

    override fun setup() {
        Toast.makeText(requireContext(), "Masuk Setup #1", Toast.LENGTH_LONG).show()
    }


}