package com.example.doubledirectionapp.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doubledirectionapp.R
import com.example.doubledirectionapp.model.Category

class MainAdapter(private val categories: List<Category>) :
    RecyclerView.Adapter<MainAdapter.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.category_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(categories[position])
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(category: Category) {

            itemView.apply {
                findViewById<TextView>(R.id.category_text).text = category.categoryName

                findViewById<RecyclerView>(R.id.element_list).also {
                    it.layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
                    it.addItemDecoration(
                        DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
                    )
                    it.adapter = ElementListAdapter(category)

                }

            }
        }
    }
}
