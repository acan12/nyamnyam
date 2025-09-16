package com.beelabs.nyamnyam.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beelabs.nyamnyam.databinding.ItemProductBinding
import com.beelabs.nyamnyam.ui.model.ProductBanner
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class ProductAdapter(private val onItemProductOnClick: (product: ProductBanner) -> Unit) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    private lateinit var items: List<ProductBanner>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemBinding =
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(items[position], onItemProductOnClick)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addList(items: List<ProductBanner>) {
        this.items = items
        notifyDataSetChanged()
    }

    class ProductViewHolder(private val itemBinding: ItemProductBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(
            product: ProductBanner,
            onItemProductOnClick: (product: ProductBanner) -> Unit
        ) {
//            itemBinding.apply {
//                Glide.with(itemBinding.root)
//                    .load(product.image)
//                    .diskCacheStrategy(DiskCacheStrategy.ALL)
//                    .into(imgItemBanner)
//            }
        }
    }
}