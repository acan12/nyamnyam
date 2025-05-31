package com.beelabs.nyamnyam.ui.activity.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import app.coconut2.coconut2_mvvm.base.BaseActivity
import com.beelabs.nyamnyam.databinding.ActivitySplashBinding
import com.beelabs.nyamnyam.ui.activity.onboard.OnBoardingActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override fun inflateBinding(): ActivitySplashBinding =
        ActivitySplashBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}