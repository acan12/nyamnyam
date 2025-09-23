package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentSearchBinding

class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSearchBinding
        get() = FragmentSearchBinding::inflate

    override fun setup() {
        TODO("Not yet implemented")
    }

}