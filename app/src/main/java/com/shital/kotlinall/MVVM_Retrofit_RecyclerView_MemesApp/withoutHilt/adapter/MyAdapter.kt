package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.adapter

import android.content.Context
import android.content.Intent
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Meme
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.model.Meme_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.ui.Memes_Activity_Details
import com.shital.kotlinall.R

class MyAdapter(var con : Context , var list : List<Meme>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(v : View) : RecyclerView.ViewHolder(v)
    {
        var img = v.findViewById<ImageView>(R.id.RV_Image)
        var tvName = v.findViewById<TextView>(R.id.RV_tv)
        var  layout_memecard=v.findViewById<LinearLayout>(R.id.layout_memecard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(con).inflate(R.layout.list_item_memes,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        Glide.with(con).load(list[position].url).into(holder.img)

        holder.tvName.text = list[position].name
        holder.layout_memecard.setOnClickListener {

            val intent=Intent(it.context,Memes_Activity_Details::class.java)
            intent.putExtra("name",list[position].name)
            intent.putExtra("url",list[position].url)
            it.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return list.count()
    }

}