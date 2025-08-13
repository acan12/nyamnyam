package com.beelabs.nyamnyam.ui.activity.onboard

import android.os.Bundle
import android.widget.Toast
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

        setup()
    }

    private fun setup() {
        with(binding) {
            btnGetStarted.setOnClickListener {
                Toast.makeText(this@OnBoardingActivity, "Get Started", Toast.LENGTH_LONG).show()
            }
            btnLogin.setOnClickListener {
                Toast.makeText(this@OnBoardingActivity, "Login", Toast.LENGTH_LONG).show()
            }
        }
    }
}