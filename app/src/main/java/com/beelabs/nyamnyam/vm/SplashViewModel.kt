package com.beelabs.nyamnyam.vm

import androidx.lifecycle.ViewModel
import com.beelabs.nyamnyam.ui.navigation.Navigator
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val navigator: Navigator
) : ViewModel() {
    fun navigateToSettings() {

    }

    fun navigateBack() {
        navigator.navigateBack()
    }
}