package com.beelabs.nyamnyam.ui.navigation.home

import android.os.Bundle
import android.view.View

interface IHomeNavigation {
    fun navigateToSearch(view: View, bundleOf: Bundle? = null)
    fun navigateToOrder(view: View, bundleOf: Bundle? = null)
    fun navigateToUpdates(view: View, bundleOf: Bundle? = null)
    fun navigateToProfile(view: View, bundleOf: Bundle? = null)
}