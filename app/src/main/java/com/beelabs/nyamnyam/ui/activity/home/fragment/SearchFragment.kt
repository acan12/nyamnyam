package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSearchBinding
        get() = FragmentSearchBinding::inflate

    override fun setup() {
        binding.shimmerSearchResult.startShimmer()
        binding.etInputSearch.apply {
            setOnFocusChangeListener { view, b ->
                if (b) {
                    binding.shimmerSearchResult.stopShimmer()
                    view.setBackgroundResource(R.drawable.rounded_white_transparent_stroke)
                }
            }
            doOnTextChanged { text, start, before, count ->  }
        }

        binding.rvResultSearch
    }

}