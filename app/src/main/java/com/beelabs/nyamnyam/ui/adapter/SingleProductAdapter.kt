package com.beelabs.nyamnyam.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beelabs.nyamnyam.databinding.ItemSingleProductBinding
import com.beelabs.nyamnyam.ui.model.ProductBanner

class SingleProductAdapter(private val onItemProductOnClick: (product: ProductBanner) -> Unit) :
    RecyclerView.Adapter<SingleProductAdapter.SingleProductViewHolder>() {
    private lateinit var items: List<ProductBanner>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleProductViewHolder {
        val itemBinding =
            ItemSingleProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SingleProductViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SingleProductViewHolder, position: Int) {
        holder.bind(items[position], onItemProductOnClick)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addList(items: List<ProductBanner>) {
        this.items = items
        notifyDataSetChanged()
    }

    class SingleProductViewHolder(private val itemBinding: ItemSingleProductBinding) :
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