package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Meme
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Meme_
import com.shital.kotlinall.R

class MyAdapter_(var con : Context, var list : List<Meme_>) : RecyclerView.Adapter<MyAdapter_.ViewHolder>() {

    inner class ViewHolder(v : View) : RecyclerView.ViewHolder(v)
    {
        var img = v.findViewById<ImageView>(R.id.RV_Image)
        var tvName = v.findViewById<TextView>(R.id.RV_tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(con).inflate(R.layout.list_item_memes,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Glide.with(con).load(list[position].url).into(holder.img)

        holder.tvName.text = list[position].name

    }

    override fun getItemCount(): Int {
        return list.count()
    }

}