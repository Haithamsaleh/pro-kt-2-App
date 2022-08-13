package com.example.pro_2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Window
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.pro_2.Adapter.MoviesAdapter
import com.example.pro_2.Data.Datasource


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        setContentView(R.layout.activity_main)

        val moviesList = Datasource().loadMovie()

        val adapter = MoviesAdapter(moviesList, this)

        val recyclerView : RecyclerView = findViewById(R.id.rv_movies)



        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}