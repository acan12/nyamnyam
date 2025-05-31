package com.beelabs.nyamnyam.ui.activity.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.beelabs.nyamnyam.databinding.ActivitySplashBinding
import com.beelabs.nyamnyam.ui.activity.onboard.OnBoardingActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, OnBoardingActivity::class.java )
            startActivity(intent)
            finish()

        }, 5000)
    }
}