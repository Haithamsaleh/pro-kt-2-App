package com.example.pro_2.Data

import com.example.pro_2.Model.Movie
import com.example.pro_2.R

class Datasource {
    fun loadMovie() : List<Movie>{
        return listOf(
            Movie(R.string.movie3, R.drawable.image1,R.string.dec3,R.string.ret3),
            Movie(R.string.movie1, R.drawable.image14,R.string.dec1,R.string.ret1),
            Movie(R.string.movie2, R.drawable.image2,R.string.dec2,R.string.ret2),
            Movie(R.string.movie4, R.drawable.image4,R.string.dec4,R.string.ret4),
            Movie(R.string.movie5, R.drawable.image5,R.string.dec5,R.string.ret5),

            )
    }
}