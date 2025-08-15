package com.beelabs.nyamnyam.ui.activity.auth

import android.os.Bundle
import app.coconut2.coconut2_mvvm.base.BaseActivity
import com.beelabs.nyamnyam.databinding.ActivityLoginBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override fun inflateBinding(): ActivityLoginBinding =
        ActivityLoginBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}