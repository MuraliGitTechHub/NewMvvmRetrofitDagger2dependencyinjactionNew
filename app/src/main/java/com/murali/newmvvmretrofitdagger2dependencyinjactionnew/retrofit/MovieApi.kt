package com.murali.newmvvmretrofitdagger2dependencyinjactionnew.retrofit

import com.murali.newmvvmretrofitdagger2dependencyinjactionnew.module.Movies
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

  interface MovieApi {
        @GET("popular?")
        fun getPopularMovies(@Query("api_key") api_key : String) : Call<Movies>

}