package com.beelabs.nyamnyam.ui.activity.home

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import app.coconut2.coconut2_mvvm.base.BaseActivity
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.databinding.ActivityHomeBinding
import com.beelabs.nyamnyam.ui.adapter.ProductAdapter
import com.beelabs.nyamnyam.ui.adapter.PromoAdapter
import com.beelabs.nyamnyam.ui.adapter.SingleProductAdapter
import com.beelabs.nyamnyam.ui.adapter.SingleSmallProductAdapter
import com.beelabs.nyamnyam.ui.model.ProductBanner
import com.beelabs.nyamnyam.ui.model.PromoBanner

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override fun inflateBinding() =
        ActivityHomeBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupPromoBanner()
        setupProductBanner()
        setupPopularBanner()
        setupNearbyBanner()

        setupMenuButtons()
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private fun setupMenuButtons() {
        binding.apply {
            menuHome.setOnClickListener {
                menuHome.setImageResource(R.drawable.img_menu_home_selected)
                clearOtherMenuInActive(it)
            }
            menuSearch.setOnClickListener {
                menuSearch.setImageResource(R.drawable.img_menu_search_selected)
                clearOtherMenuInActive(it)
            }
            menuOrder.setOnClickListener {
                menuOrder.setImageResource(R.drawable.img_menu_order_selected)
                clearOtherMenuInActive(it)
            }
            menuUpdates.setOnClickListener {
                menuUpdates.setImageResource(R.drawable.img_menu_update_selected)
                clearOtherMenuInActive(it)
            }
            menuProfile.setOnClickListener {
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

    private fun setupPromoBanner() {
        val layout = LinearLayoutManager(this)
        layout.orientation = LinearLayoutManager.HORIZONTAL

        val adapter = PromoAdapter(onItemPromoOnClick = { promo ->

        })
        adapter.addList(
            listOf(
                PromoBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_banner_pasta)
                ),
                PromoBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_banner_pasta)
                ),
                PromoBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_banner_pasta)
                )
            )
        )

        binding.rvPromoBanner.layoutManager = layout
        binding.rvPromoBanner.adapter = adapter

        val indicator = binding.indicatorOfPromo
        indicator.attachToRecyclerView(binding.rvPromoBanner)
    }

    private fun setupProductBanner() {
        val layout = LinearLayoutManager(this)
        layout.orientation = LinearLayoutManager.HORIZONTAL

        val adapter = ProductAdapter(onItemProductOnClick = {

        })
        adapter.addList(
            listOf(
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
            )
        )

        binding.rvProductBanner.layoutManager = layout
        binding.rvProductBanner.adapter = adapter
    }

    private fun setupPopularBanner() {
        val layout = LinearLayoutManager(this)
        layout.orientation = LinearLayoutManager.HORIZONTAL
        val adapter = SingleSmallProductAdapter(onItemProductOnClick = {

        })
        adapter.addList(
            listOf(
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_demo_food)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
            )
        )

        binding.rvPopularBanner.layoutManager = layout
        binding.rvPopularBanner.adapter = adapter
    }

    private fun setupNearbyBanner() {
        val layout = LinearLayoutManager(this)

        val adapter = SingleProductAdapter(onItemProductOnClick = {

        })
        adapter.addList(
            listOf(
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
                ProductBanner(
                    image =
                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
                ),
            )
        )

        binding.rvNearbyBanner.layoutManager = layout
        binding.rvNearbyBanner.adapter = adapter
    }
}