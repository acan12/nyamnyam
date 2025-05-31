package com.beelabs.nyamnyam.ui.activity.onboard.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.beelabs.nyamnyam.databinding.FragmentBoardingSafeDeliveryBinding

class BoardingSafeDeliveryFragment : Fragment() {
    private lateinit var binding: FragmentBoardingSafeDeliveryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBoardingSafeDeliveryBinding.inflate(inflater, container, false)

        return binding.root
    }
}