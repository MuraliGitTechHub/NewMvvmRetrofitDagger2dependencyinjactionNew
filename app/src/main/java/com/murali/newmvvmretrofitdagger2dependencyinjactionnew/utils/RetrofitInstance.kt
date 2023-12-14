package com.murali.newmvvmretrofitdagger2dependencyinjactionnew.utils

import com.murali.newmvvmretrofitdagger2dependencyinjactionnew.retrofit.MovieApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api : MovieApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/movie/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApi::class.java)
    }
}
