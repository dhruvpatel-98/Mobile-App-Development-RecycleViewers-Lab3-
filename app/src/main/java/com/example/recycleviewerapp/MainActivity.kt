package com.example.recycleviewerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val flowerArray = DataSource(this).getStringArray()
        val flowers = flowerList(resources)
        val recyclerView: RecyclerView = findViewById(R.id.recycle_view)
        val llm = LinearLayoutManager(this)
        recyclerView.layoutManager = llm
        recyclerView.adapter = FlowerAdapter(flowers)
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                baseContext,
                llm.orientation
            )
        )
    }
}