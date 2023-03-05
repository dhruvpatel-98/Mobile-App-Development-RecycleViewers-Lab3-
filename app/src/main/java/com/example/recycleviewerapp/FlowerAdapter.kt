package com.example.recycleviewerapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class FlowerAdapter(val flowerArrayStrings: List<Flower>) : RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {

    class FlowerViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        val flowerView: TextView = itemView.findViewById(R.id.flower_text_view)
        val flowerImage: ImageView = itemView.findViewById(R.id.flower_image_view)
        fun bind(word: Flower) {
            flowerView.text = word.name
            word.image?.let { flowerImage.setImageResource(it) }
        }

        override fun onClick(v: View?) {
            Toast.makeText(v?.context, "Selected: " + flowerView.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.flower_item, parent, false)
        return FlowerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return flowerArrayStrings.size
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerArrayStrings[position])
    }
}