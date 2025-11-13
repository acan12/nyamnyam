package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.core.util.ViewUtil
import com.beelabs.nyamnyam.databinding.FragmentHomeBinding
import com.beelabs.nyamnyam.ui.adapter.ProductAdapter
import com.beelabs.nyamnyam.ui.adapter.PromoAdapter
import com.beelabs.nyamnyam.ui.adapter.SingleProductAdapter
import com.beelabs.nyamnyam.ui.adapter.SingleSmallProductAdapter
import com.beelabs.nyamnyam.ui.model.ProductBanner
import com.beelabs.nyamnyam.ui.model.PromoBanner
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    override fun setup() {
        ViewUtil.enableEdgeToEdgeApp(binding.root)
        setupPromoBanner()
        setupProductBanner()
        setupPopularBanner()
        setupNearbyBanner()
    }

    private fun setupPromoBanner() {
        val layout = LinearLayoutManager(requireActivity())
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
        val layout = LinearLayoutManager(requireActivity())
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
        val layout = LinearLayoutManager(requireActivity())
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
        val layout = LinearLayoutManager(requireActivity())

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