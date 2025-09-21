package com.beelabs.nyamnyam.ui.activity.home

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import app.coconut2.coconut2_mvvm.base.BaseActivity
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.databinding.ActivityHomeBinding
import com.beelabs.nyamnyam.ui.adapter.ProductAdapter
import com.beelabs.nyamnyam.ui.adapter.PromoAdapter
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

        binding.rvPopularBanner.layoutManager = layout
        binding.rvPopularBanner.adapter = adapter
    }

    private fun setupNearbyBanner() {
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

        binding.rvNearbyBanner.layoutManager = layout
        binding.rvNearbyBanner.adapter = adapter
    }
}