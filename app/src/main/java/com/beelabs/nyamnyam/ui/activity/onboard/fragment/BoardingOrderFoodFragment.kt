package com.beelabs.nyamnyam.ui.activity.onboard.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.coconut.mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentBoardingOrderFoodBinding

class BoardingOrderFoodFragment : BaseFragment() {
    private lateinit var binding: FragmentBoardingOrderFoodBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBoardingOrderFoodBinding.inflate(inflater, container, false)
        return binding.root
    }
}