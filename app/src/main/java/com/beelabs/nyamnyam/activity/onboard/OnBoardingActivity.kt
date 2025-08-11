package com.beelabs.nyamnyam.activity.onboard

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import app.coconut2.coconut2_mvvm.base.BaseActivity
import com.beelabs.nyamnyam.adapter.BoardingAdapter
import com.beelabs.nyamnyam.databinding.ActivityOnboardingBinding
import com.google.android.gms.auth.api.phone.SmsRetriever
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