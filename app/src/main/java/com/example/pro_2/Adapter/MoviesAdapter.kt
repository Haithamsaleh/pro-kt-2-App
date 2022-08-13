package com.example.pro_2.Adapter

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.pro_2.Model.Movie
import com.example.pro_2.R


class MoviesAdapter (

    private val dataset: List<Movie>,
    private val context: Context
    )
    : RecyclerView.Adapter<MoviesAdapter.MovieViewHolder>() {

        // Adapter helper class to arrange data in layout file
        class MovieViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(R.id.item_title)
            val imageView: ImageView = view.findViewById(R.id.item_image)
            val textView1: TextView = view.findViewById(R.id.item_des)
            val textView2: TextView = view.findViewById(R.id.item_ret)

        }

        // 3 functions
        // تعرف ملف ال layout الخاص بالعنصر
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            // create a new view
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_movies, parent, false)



            return MovieViewHolder(adapterLayout)

        }

        // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            // save the position of them (which item i'm dealing with)
            val item = dataset[position]
            holder.textView.text = context.resources.getString(item.MovieStringId)
            holder.textView1.text = context.resources.getString(item.MovieDescriptionId)
            holder.textView2.text = context.resources.getString(item.MovieretId)
            holder.imageView.setImageResource(item.MovieImageId)
        }

        override fun getItemCount() = dataset.size




}

