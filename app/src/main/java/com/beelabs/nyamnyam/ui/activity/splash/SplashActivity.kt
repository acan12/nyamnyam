package com.beelabs.nyamnyam.ui.activity.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beelabs.nyamnyam.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}