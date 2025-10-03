package com.beelabs.nyamnyam.core.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.beelabs.nyamnyam.R

object FragmentUtil {
    fun showFragment(fragment: Fragment, fragmentManager: FragmentManager) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container_dashboard, fragment).commit()
    }
}