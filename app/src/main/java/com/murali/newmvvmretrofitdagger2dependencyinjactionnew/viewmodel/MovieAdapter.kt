package com.murali.newmvvmretrofitdagger2dependencyinjactionnew.viewmodel

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.murali.newmvvmretrofitdagger2dependencyinjactionnew.databinding.MovieLayoutBinding
import com.murali.newmvvmretrofitdagger2dependencyinjactionnew.module.Movies
import com.murali.newmvvmretrofitdagger2dependencyinjactionnew.module.Results

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {
    private var movieList = ArrayList<Results>()
    @SuppressLint("NotifyDataSetChanged")
    fun setMovieList(movieList: List<Results>) {
        this.movieList = movieList as ArrayList<Results>
        notifyDataSetChanged()
    }
    class ViewHolder(val binding : MovieLayoutBinding):RecyclerView.ViewHolder(binding.root){}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         return ViewHolder(
             MovieLayoutBinding.inflate(
                 LayoutInflater.from(
                     parent.context
                 )
             )
         )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       Glide.with(holder.itemView)
           .load("https://image.tmdb.org/t/p/w500"+movieList[position].poster_path)
           .into(holder.binding.movieImage)
           holder.binding.movieName.text = movieList[position].title

    }
    override fun getItemCount(): Int {
        return movieList.size
    }
}
















                                    // APIApp  Adapter
//class RecyclerViewAdapter  : RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){
//
//    private var listData : List<RecyclerData>? = null
//
//    fun setUpdatedData(listDate : List<RecyclerData>){
//          this.listData
//    }
//
//
//     class MyViewHolder(val binding : RecyclerviewListRowBinding) : RecyclerView.ViewHolder(binding.root){
//         val imageview = binding.imageView
//         val textviewName = binding.textviewName
//         val textviewDescription = binding.textviewDescription
//
//               fun bind(data : RecyclerData){
//                   textviewName.text = data.name
//                   textviewDescription.text = data.description
//
//                   Glide.with(imageview)
//                       .load(data.owner.avatar_url)
//                       .apply(RequestOptions.centerCropTransform())
//                       .into(imageview)
//
//               }
//     }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//             val view =  LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_list_row,parent,false)
//              return MyViewHolder(
//                  RecyclerviewListRowBinding.inflate(
//                      LayoutInflater.from(
//                          parent.context
//                      )
//                  )
//              )
//    }
//    override fun getItemCount(): Int {
//         if(listData == null)return  0
//             else return listData?.size!!
//    }
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//         holder.bind(listData?.get(position)!!)
//
//    }
//}