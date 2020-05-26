package com.example.droidcamptaskthree

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ItemAdapter(private val context: Context, private val items: List<Item>,
                  private var itemClickListener: OnItemClickListener) :
                    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.setData(item, itemClickListener)
    }

    interface OnItemClickListener {
        fun onItemClick(item: Item)
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setData(item: Item, clickListener: OnItemClickListener) {
            itemView.list_item_name.text = item.name
            itemView.list_item_price.text = item.price
            itemView.list_item_image.setImageResource(item.image)
            itemView.setOnClickListener { clickListener.onItemClick(item) }
        }

    }
}
