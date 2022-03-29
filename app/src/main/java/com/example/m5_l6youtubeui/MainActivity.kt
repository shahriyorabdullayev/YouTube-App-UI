package com.example.m5_l6youtubeui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m5_l6youtubeui.adapter.FeedAdapter
import com.example.m5_l6youtubeui.adapter.FilterAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var rvFeed: RecyclerView
    private lateinit var rvFilter: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initVies()
    }

    private fun initVies() {
        rvFeed = findViewById(R.id.rv_feed)
        rvFilter = findViewById(R.id.rv_filter)

        rvFeed.layoutManager = GridLayoutManager(this, 1)
        rvFilter.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        refreshFeedAdapter(getFeeds())
        refreshFilterAdapter(getFilter())

    }

    private fun refreshFeedAdapter(items: ArrayList<Feed>) {
        val adapter = FeedAdapter(this, items)
        rvFeed.adapter = adapter
    }

    private fun refreshFilterAdapter(filter: ArrayList<Filter>) {
        val adapter = FilterAdapter(this, filter)
        rvFilter.adapter = adapter
    }

    private fun getFilter() :ArrayList<Filter>{
        val list = ArrayList<Filter>()

        list.add(Filter("Computer programming"))
        list.add(Filter("Android Native"))
        list.add(Filter("Computer programming"))

        return list

    }

    private fun getFeeds():ArrayList<Feed> {
        val list = ArrayList<Feed>()
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))
        list.add(Feed(R.drawable.img_video, R.drawable.img_video))


        return list

    }
}