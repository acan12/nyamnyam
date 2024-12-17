package com.beelabs.nyamnyam.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import app.beelabs.coconut.mvvm.base.BaseActivity
import com.beelabs.nyamnyam.databinding.ActivityOnboardingBinding

class OnBoardingActivity : BaseActivity() {
    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}