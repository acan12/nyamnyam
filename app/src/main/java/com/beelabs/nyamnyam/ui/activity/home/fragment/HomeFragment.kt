package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
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

    companion object {
        private const val AUTO_SCROLL_DELAY = 3000L
    }

    private val autoScrollHandler = Handler(Looper.getMainLooper())
    private var currentPromoPosition = 0
    private var promoItemCount = 0
    private val autoScrollRunnable = object : Runnable {
        override fun run() {
            currentPromoPosition = (currentPromoPosition + 1) % promoItemCount
            binding.rvPromoBanner.smoothScrollToPosition(currentPromoPosition)
            autoScrollHandler.postDelayed(this, AUTO_SCROLL_DELAY)
        }
    }

    override fun setup() {
        ViewUtil.enableEdgeToEdgeApp(binding.root)
        setupPromoBanner()
        setupProductBanner()
        setupPopularBanner()
        setupNearbyBanner()
    }

    override fun onResume() {
        super.onResume()
        if (promoItemCount > 1) scheduleAutoScroll()
    }

    override fun onPause() {
        super.onPause()
        stopAutoScroll()
    }

    override fun onDestroyView() {
        stopAutoScroll()
        super.onDestroyView()
    }

    private fun scheduleAutoScroll() {
        autoScrollHandler.removeCallbacks(autoScrollRunnable)
        autoScrollHandler.postDelayed(autoScrollRunnable, AUTO_SCROLL_DELAY)
    }

    private fun stopAutoScroll() {
        autoScrollHandler.removeCallbacks(autoScrollRunnable)
    }

    private fun setupPromoBanner() {
        val layout = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)

        val promoItems = listOf(
            PromoBanner(image = BitmapFactory.decodeResource(resources, R.drawable.img_banner_pasta)),
            PromoBanner(image = BitmapFactory.decodeResource(resources, R.drawable.img_banner_pasta)),
            PromoBanner(image = BitmapFactory.decodeResource(resources, R.drawable.img_banner_pasta))
        )
        promoItemCount = promoItems.size

        val adapter = PromoAdapter(onItemPromoOnClick = {})
        adapter.addList(promoItems)

        binding.rvPromoBanner.layoutManager = layout
        binding.rvPromoBanner.adapter = adapter

        PagerSnapHelper().attachToRecyclerView(binding.rvPromoBanner)

        binding.rvPromoBanner.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                when (newState) {
                    RecyclerView.SCROLL_STATE_DRAGGING -> stopAutoScroll()
                    RecyclerView.SCROLL_STATE_IDLE -> {
                        val pos = layout.findFirstCompletelyVisibleItemPosition()
                        if (pos != RecyclerView.NO_POSITION) currentPromoPosition = pos
                        scheduleAutoScroll()
                    }
                }
            }
        })

        binding.indicatorOfPromo.attachToRecyclerView(binding.rvPromoBanner)
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
//                ProductBanner(
//                    image =
//                    BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
//                ),
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