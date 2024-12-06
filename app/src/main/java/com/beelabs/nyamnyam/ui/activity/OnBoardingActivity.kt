package com.beelabs.nyamnyam.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beelabs.nyamnyam.databinding.ActivityOnboardingBinding

class OnBoardingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}