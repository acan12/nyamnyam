package com.beelabs.nyamnyam.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beelabs.nyamnyam.databinding.ItemSingleProductBinding
import com.beelabs.nyamnyam.databinding.ItemSingleSmallProductBinding
import com.beelabs.nyamnyam.ui.model.ProductBanner

class SingleSmallProductAdapter(private val onItemProductOnClick: (product: ProductBanner) -> Unit) :
    RecyclerView.Adapter<SingleSmallProductAdapter.SingleSmallProductViewHolder>() {
    private lateinit var items: List<ProductBanner>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SingleSmallProductViewHolder {
        val itemBinding =
            ItemSingleSmallProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SingleSmallProductViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: SingleSmallProductViewHolder, position: Int) {
        holder.bind(items[position], onItemProductOnClick)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addList(items: List<ProductBanner>) {
        this.items = items
        notifyDataSetChanged()
    }

    class SingleSmallProductViewHolder(private val itemBinding: ItemSingleSmallProductBinding) :
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