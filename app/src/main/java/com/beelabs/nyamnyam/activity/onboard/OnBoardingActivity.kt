package com.beelabs.nyamnyam.activity.onboard

//import app.beelabs.coconut.mvvm.base.BaseActivity

import android.annotation.SuppressLint
import android.content.IntentFilter
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
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
        startSmsRetriever()


        val adapter = BoardingAdapter(this)
        binding.onboardingViewPager2.adapter = adapter
        binding.wormDotsIndicator.attachTo(binding.onboardingViewPager2)
    }


    private fun startSmsRetriever() {
        val client = SmsRetriever.getClient(this)
        val task = client.startSmsRetriever()
        task.apply {
            addOnSuccessListener {
                Log.d("SMS", "start launch sms receiver")
            }
            addOnFailureListener {
                Log.d("SMS", "Stop failure")
            }
        }
    }
}