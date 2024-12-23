package com.beelabs.nyamnyam.ui.activity.onboard

import android.os.Bundle
import app.beelabs.coconut.mvvm.base.BaseActivity
import com.beelabs.nyamnyam.databinding.ActivityOnboardingBinding
import com.beelabs.nyamnyam.ui.adapter.BoardingAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnBoardingActivity : BaseActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = BoardingAdapter(this)
        binding.onboardingViewPager2.adapter = adapter

        binding.wormDotsIndicator.attachTo(binding.onboardingViewPager2)
    }
}