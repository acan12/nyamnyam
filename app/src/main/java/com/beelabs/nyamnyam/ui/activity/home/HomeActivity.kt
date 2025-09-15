package com.beelabs.nyamnyam.ui.activity.home

import android.os.Bundle
import app.coconut2.coconut2_mvvm.base.BaseActivity
import com.beelabs.nyamnyam.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun inflateBinding() =
        ActivityHomeBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}