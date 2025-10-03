package com.beelabs.nyamnyam.ui.navigation.home

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.ui.navigation.navigateSafely

class HomeNavigation : IHomeNavigation {
    override fun navigateToSearch(view: View, bundleOf: Bundle?) {
        Navigation.findNavController(view).apply {
            navigateSafely(R.id.action_homeFragment_to_searchFragment, bundleOf)
        }
        //        Navigation.findNavController(view).apply {
//            navigateSafely(R.id.action_main_home, bundleOf)
//        }
    }

    override fun navigateToOrder(view: View, bundleOf: Bundle?) {
        Navigation.findNavController(view).apply {
            navigateSafely(R.id.action_homeFragment_to_orderFragment, bundleOf)
        }
    }

    override fun navigateToUpdates(view: View, bundleOf: Bundle?) {
        Navigation.findNavController(view).apply {
            navigateSafely(R.id.action_homeFragment_to_updatesFragment, bundleOf)
        }
    }

    override fun navigateToProfile(view: View, bundleOf: Bundle?) {
        Navigation.findNavController(view).apply {
            navigateSafely(R.id.action_homeFragment_to_profileFragment, bundleOf)
        }
    }
}