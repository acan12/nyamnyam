package com.beelabs.nyamnyam.ui.activity.home.fragment

import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import androidx.recyclerview.widget.LinearLayoutManager
import app.coconut2.coconut2_mvvm.base.BaseFragment
import com.beelabs.nyamnyam.R
import com.beelabs.nyamnyam.core.util.ViewUtil
import com.beelabs.nyamnyam.databinding.FragmentSearchBinding
import com.beelabs.nyamnyam.ui.adapter.SearchResultAdapter
import com.beelabs.nyamnyam.ui.model.SearchFoodItem

class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentSearchBinding
        get() = FragmentSearchBinding::inflate

    private val adapter = SearchResultAdapter(onItemClick = {})
    private val allItems by lazy { buildDummyItems() }

    override fun setup() {
        ViewUtil.enableEdgeToEdgeApp(binding.root)
        setupRecyclerView()
        setupSearch()
        showItems(allItems)
    }

    private fun setupRecyclerView() {
        binding.rvResultSearch.layoutManager = LinearLayoutManager(requireContext())
        binding.rvResultSearch.adapter = adapter
    }

    private fun setupSearch() {
        binding.etInputSearch.apply {
            setOnFocusChangeListener { _, hasFocus ->
                if (hasFocus) {
                    binding.shimmerSearchResult.stopShimmer()
                    binding.shimmerSearchResult.isVisible = false
                    setBackgroundResource(R.drawable.rounded_white_transparent_stroke)
                }
            }
            doOnTextChanged { text, _, _, _ ->
                val query = text?.toString().orEmpty().trim()
                val filtered = if (query.isEmpty()) {
                    allItems
                } else {
                    allItems.filter {
                        it.name.contains(query, ignoreCase = true) ||
                                it.restaurantName.contains(query, ignoreCase = true)
                    }
                }
                binding.tvSectionTitle.text = if (query.isEmpty()) "Popular Food" else "Search Results"
                showItems(filtered)
            }
        }
    }

    private fun showItems(items: List<SearchFoodItem>) {
        binding.shimmerSearchResult.isVisible = false
        binding.rvResultSearch.isVisible = true
        adapter.addList(items)
    }

    private fun buildDummyItems(): List<SearchFoodItem> {
        val image = BitmapFactory.decodeResource(resources, R.drawable.img_demo_food)
        val image2 = BitmapFactory.decodeResource(resources, R.drawable.img_breakfast)
        return listOf(
            SearchFoodItem(
                image = image,
                discountPercent = 75,
                price = "$10",
                originalPrice = "$18",
                rating = 4.5f,
                name = "Marinated Grilled Salmon",
                restaurantName = "Brown Bakery",
                deliveryMinutes = 30
            ),
            SearchFoodItem(
                image = image2,
                discountPercent = 75,
                price = "$10",
                originalPrice = "$18",
                rating = 4.5f,
                name = "Coco Strawberry Pancake",
                restaurantName = "Brown Bakery",
                deliveryMinutes = 30
            ),
            SearchFoodItem(
                image = image,
                discountPercent = null,
                price = "$10",
                originalPrice = null,
                rating = 4.5f,
                name = "Full Vegie Salad",
                restaurantName = "Brown Bakery",
                deliveryMinutes = 30
            ),
            SearchFoodItem(
                image = image2,
                discountPercent = 75,
                price = "$10",
                originalPrice = "$18",
                rating = 4.5f,
                name = "Pizza Mozzarella with Mushroom",
                restaurantName = "Brown Bakery",
                deliveryMinutes = 30
            ),
            SearchFoodItem(
                image = image,
                discountPercent = null,
                price = "$10",
                originalPrice = null,
                rating = 4.5f,
                name = "Authentic Ramen",
                restaurantName = "Brown Bakery",
                deliveryMinutes = 30
            )
        )
    }
}