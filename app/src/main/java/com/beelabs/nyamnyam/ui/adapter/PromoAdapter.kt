package com.beelabs.nyamnyam.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beelabs.nyamnyam.databinding.ItemPromoBinding
import com.beelabs.nyamnyam.ui.model.PromoBanner
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class PromoAdapter(private val onItemPromoOnClick: (promo: PromoBanner) -> Unit) :
    RecyclerView.Adapter<PromoAdapter.PromoViewHolder>() {
    private lateinit var items: List<PromoBanner>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PromoViewHolder {
        val itemBinding =
            ItemPromoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PromoViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: PromoViewHolder, position: Int) {
        holder.bind(items[position], onItemPromoOnClick)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addList(items: List<PromoBanner>) {
        this.items = items
        notifyDataSetChanged()
    }

    class PromoViewHolder(private val itemBinding: ItemPromoBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(
            promo: PromoBanner,
            onItemPromoOnClick: (promo: PromoBanner) -> Unit
        ) {
            itemBinding.apply {
                Glide.with(itemBinding.root)
                    .load(promo.image)
                    .diskCacheStrategy(DiskCacheStrategy.ALL)
                    .into(imgItemBanner)
            }
        }
    }
}