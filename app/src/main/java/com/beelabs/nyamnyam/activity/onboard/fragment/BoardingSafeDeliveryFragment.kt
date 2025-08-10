package com.beelabs.nyamnyam.activity.onboard.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentBoardingSafeDeliveryBinding

class BoardingSafeDeliveryFragment : BaseFragment<FragmentBoardingSafeDeliveryBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentBoardingSafeDeliveryBinding
        get() = FragmentBoardingSafeDeliveryBinding::inflate

    override fun setup() {
        Toast.makeText(requireContext(), "Masuk Setup #3", Toast.LENGTH_LONG).show()
    }
}