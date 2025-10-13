package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSearchBinding
        get() = FragmentSearchBinding::inflate

    override fun setup() {
        binding.etInputSearch.setOnFocusChangeListener { view, b ->
            if(b){
                view.setBackgroundResource(R.drawable.rounded_white_transparent_stroke)
                binding.lottieLoading.isVisible = false
            }
        }

        binding.rvResultSearch
    }

}