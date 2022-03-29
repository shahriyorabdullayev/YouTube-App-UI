package com.example.m5_l6youtubeui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l6youtubeui.Feed
import com.example.m5_l6youtubeui.R
import com.google.android.material.imageview.ShapeableImageView

class FeedAdapter(val context: Context, val items: ArrayList<Feed>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_video, parent, false)
        return FeedViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is FeedViewHolder) {
            holder.apply {
                ivProfile.setImageResource(item.profile)
                ivVideo.setImageResource(item.photo)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class FeedViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val ivProfile = view.findViewById<ShapeableImageView>(R.id.iv_profile)
        val ivVideo = view.findViewById<ImageView>(R.id.iv_video)
    }
}