package com.beelabs.nyamnyam.ui.activity.onboard

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import app.beelabs.coconut.mvvm.base.BaseActivity
import com.beelabs.nyamnyam.databinding.ActivityOnboardingBinding
import com.beelabs.nyamnyam.ui.navigation.Navigator
import com.beelabs.nyamnyam.ui.navigation.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class OnBoardingActivity : BaseActivity() {

    @Inject
    lateinit var navigator: Navigator

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navController = binding.navHostFragment.getFragment<NavHostFragment>().navController
        navigator.setupWithNavController(this, navController)
    }
}