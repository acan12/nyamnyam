package com.beelabs.nyamnyam.ui.activity.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment
import app.coconut2.coconut2_mvvm.base.BaseActivity
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.core.util.FragmentUtil
import com.beelabs.nyamnyam.core.util.FragmentUtil.showFragment
import com.beelabs.nyamnyam.databinding.ActivityHomeBinding
import com.beelabs.nyamnyam.ui.activity.home.fragment.HomeFragment
import com.beelabs.nyamnyam.ui.activity.home.fragment.OrderFragment
import com.beelabs.nyamnyam.ui.activity.home.fragment.ProfileFragment
import com.beelabs.nyamnyam.ui.activity.home.fragment.SearchFragment
import com.beelabs.nyamnyam.ui.activity.home.fragment.UpdatesFragment
import com.beelabs.nyamnyam.ui.activity.home.vm.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    private val viewModel by viewModels<HomeViewModel>()

    override fun inflateBinding() =
        ActivityHomeBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        WindowCompat.requ(window)
        setupMenuButtons()

        showFragment(HomeFragment(), supportFragmentManager)
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun setupMenuButtons() {
        binding.apply {
            menuHome.setOnClickListener {
                showFragment(HomeFragment(), supportFragmentManager)
                menuHome.setImageResource(R.drawable.img_menu_home_selected)
                clearOtherMenuInActive(it)
            }
            menuSearch.setOnClickListener {
                showFragment(SearchFragment(), supportFragmentManager)
                menuSearch.setImageResource(R.drawable.img_menu_search_selected)
                clearOtherMenuInActive(it)
            }
            menuOrder.setOnClickListener {
                showFragment(OrderFragment(), supportFragmentManager)
                menuOrder.setImageResource(R.drawable.img_menu_order_selected)
                clearOtherMenuInActive(it)
            }
            menuUpdates.setOnClickListener {
                showFragment(UpdatesFragment(), supportFragmentManager)
                menuUpdates.setImageResource(R.drawable.img_menu_update_selected)
                clearOtherMenuInActive(it)
            }
            menuProfile.setOnClickListener {
                showFragment(ProfileFragment(), supportFragmentManager)
                menuProfile.setImageResource(R.drawable.img_menu_profile_selected)
                clearOtherMenuInActive(it)
            }
        }
    }

    private fun clearOtherMenuInActive(menu: View?) {
        binding.apply {
            when (menu) {
                menuHome -> {
                    menuSearch.setImageResource(R.drawable.img_menu_search)
                    menuOrder.setImageResource(R.drawable.img_menu_order)
                    menuUpdates.setImageResource(R.drawable.img_menu_update)
                    menuProfile.setImageResource(R.drawable.img_menu_profile)
                }
                menuSearch -> {
                    menuHome.setImageResource(R.drawable.img_menu_home)
                    menuOrder.setImageResource(R.drawable.img_menu_order)
                    menuUpdates.setImageResource(R.drawable.img_menu_update)
                    menuProfile.setImageResource(R.drawable.img_menu_profile)
                }
                menuOrder -> {
                    menuHome.setImageResource(R.drawable.img_menu_home)
                    menuSearch.setImageResource(R.drawable.img_menu_search)
                    menuUpdates.setImageResource(R.drawable.img_menu_update)
                    menuProfile.setImageResource(R.drawable.img_menu_profile)
                }
                menuUpdates -> {
                    menuHome.setImageResource(R.drawable.img_menu_home)
                    menuSearch.setImageResource(R.drawable.img_menu_search)
                    menuOrder.setImageResource(R.drawable.img_menu_order)
                    menuProfile.setImageResource(R.drawable.img_menu_profile)
                }
                menuProfile -> {
                    menuHome.setImageResource(R.drawable.img_menu_home)
                    menuSearch.setImageResource(R.drawable.img_menu_search)
                    menuOrder.setImageResource(R.drawable.img_menu_order)
                    menuUpdates.setImageResource(R.drawable.img_menu_update)
                }
            }
        }
    }
}