package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.databinding.FragmentUpdatesBinding

class UpdatesFragment : BaseFragment<FragmentUpdatesBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentUpdatesBinding
        get() = FragmentUpdatesBinding::inflate

    override fun setup() {

    }
}