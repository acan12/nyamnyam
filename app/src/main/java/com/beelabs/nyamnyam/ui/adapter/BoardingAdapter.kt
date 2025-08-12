package com.beelabs.nyamnyam.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.beelabs.nyamnyam.ui.activity.onboard.fragment.BoardingFastDeliveryFragment
import com.beelabs.nyamnyam.ui.activity.onboard.fragment.BoardingOrderFoodFragment
import com.beelabs.nyamnyam.ui.activity.onboard.fragment.BoardingSafeDeliveryFragment

class BoardingAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BoardingOrderFoodFragment()
            1 -> BoardingFastDeliveryFragment()
            else -> BoardingSafeDeliveryFragment()
        }
    }
}