package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.core.util.ViewUtil
import com.beelabs.nyamnyam.databinding.FragmentOrderBinding
import com.beelabs.nyamnyam.ui.adapter.OrderCompleteAdapter
import com.beelabs.nyamnyam.ui.adapter.OrderInProgressAdapter
import com.beelabs.nyamnyam.ui.model.OrderItem

class OrderFragment : BaseFragment<FragmentOrderBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentOrderBinding
        get() = FragmentOrderBinding::inflate

    private val inProgressAdapter = OrderInProgressAdapter(onItemClick = {})
    private val completeAdapter = OrderCompleteAdapter(
        onOrderAgainClick = {},
        onRateClick = {}
    )

    override fun setup() {
        ViewUtil.enableEdgeToEdgeApp(binding.root)
        setupRecyclerViews()
        setupTabs()
        loadDummyData()
    }

    private fun setupRecyclerViews() {
        binding.rvInProgress.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = inProgressAdapter
        }
        binding.rvComplete.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = completeAdapter
        }
    }

    private fun setupTabs() {
        binding.tabDelivery.setOnClickListener { selectDeliveryTab() }
        binding.tabPickup.setOnClickListener { selectPickupTab() }
    }

    private fun selectDeliveryTab() {
        binding.tabDelivery.apply {
            setBackgroundResource(R.drawable.tab_active_bg)
            setTextColor(requireContext().getColor(R.color.orange_F26333))
        }
        binding.tabPickup.apply {
            background = null
            setTextColor(requireContext().getColor(R.color.gray))
        }
    }

    private fun selectPickupTab() {
        binding.tabPickup.apply {
            setBackgroundResource(R.drawable.tab_active_bg)
            setTextColor(requireContext().getColor(R.color.orange_F26333))
        }
        binding.tabDelivery.apply {
            background = null
            setTextColor(requireContext().getColor(R.color.gray))
        }
    }

    private fun loadDummyData() {
        val restaurantImage = BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
        val driverImage = BitmapFactory.decodeResource(resources, R.drawable.img_demo_small_product)

        inProgressAdapter.addList(
            listOf(
                OrderItem(
                    restaurantImage = restaurantImage,
                    restaurantName = "Express Ramen Shop",
                    menuDescription = "Authentic Japanese Ramen, Chicken Noodle",
                    date = "12 Feb 2021",
                    totalPrice = "$17",
                    itemCount = 2,
                    driverImage = driverImage,
                    driverName = "Ronald Richards",
                    driverStatus = "Driving to Restaurant"
                )
            )
        )

        completeAdapter.addList(
            listOf(
                OrderItem(
                    restaurantImage = restaurantImage,
                    restaurantName = "Express Ramen Shop",
                    menuDescription = "Authentic Japanese Ramen, Chicken Noodle",
                    date = "12 Feb 2021",
                    totalPrice = "$17",
                    itemCount = 2,
                    canRate = true
                ),
                OrderItem(
                    restaurantImage = restaurantImage,
                    restaurantName = "Express Ramen Shop",
                    menuDescription = "Authentic Japanese Ramen, Chicken Noodle",
                    date = "12 Feb 2021",
                    totalPrice = "$17",
                    itemCount = 2,
                    canRate = false
                )
            )
        )
    }
}