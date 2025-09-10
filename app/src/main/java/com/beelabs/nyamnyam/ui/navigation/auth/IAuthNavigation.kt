package com.beelabs.nyamnyam.ui.navigation.auth

import android.os.Bundle
import android.view.View

interface IAuthNavigation {
    fun navigateToLogin(view: View, bundleOf: Bundle? = null)
}