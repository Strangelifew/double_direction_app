package com.example.doubledirectionapp.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.doubledirectionapp.R
import com.example.doubledirectionapp.model.Category
import com.example.doubledirectionapp.model.Element

class ElementListAdapter(category: Category) :
    RecyclerView.Adapter<ElementListAdapter.ItemViewHolder>() {
    private val elements = category.elements

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.element_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(elements[position])
    }

    override fun getItemCount(): Int {
        return elements.size
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(element: Element) {
            itemView.findViewById<ImageView>(R.id.element_image).setImageResource(
                when (element) {
                    Element.FILM -> R.drawable.ic_baseline_ondemand_video_24
                    Element.IMAGE -> R.drawable.ic_baseline_image_24
                    Element.MUSIC -> R.drawable.ic_baseline_audiotrack_24
                    Element.FILE -> R.drawable.ic_baseline_insert_drive_file_24
                }
            )
        }
    }
}
