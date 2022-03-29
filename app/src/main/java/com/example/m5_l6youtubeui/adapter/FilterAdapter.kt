package com.example.m5_l6youtubeui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l6youtubeui.Filter
import com.example.m5_l6youtubeui.R

class FilterAdapter(val context: Context, val items:ArrayList<Filter>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_filter, parent, false)
        return FilterViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is FilterViewHolder) {
            holder.apply {
               tvTitle.text = item.title
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class FilterViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val tvTitle = view.findViewById<TextView>(R.id.tv_title)
    }
}