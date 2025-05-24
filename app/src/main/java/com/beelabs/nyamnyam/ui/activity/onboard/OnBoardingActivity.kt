package com.beelabs.nyamnyam.ui.activity.onboard

import android.os.Bundle
import app.coconut2.coconut2_mvvm.base.BaseActivity

import com.beelabs.nyamnyam.databinding.ActivityOnboardingBinding
import com.beelabs.nyamnyam.ui.adapter.BoardingAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnBoardingActivity : BaseActivity<ActivityOnboardingBinding>() {

    override fun inflateBinding(): ActivityOnboardingBinding =
        ActivityOnboardingBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter = BoardingAdapter(this)
        binding.onboardingViewPager2.adapter = adapter
        binding.wormDotsIndicator.attachTo(binding.onboardingViewPager2)
    }
}