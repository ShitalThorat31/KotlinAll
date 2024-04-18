package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.shital.kotlinall.R

class Memes_Activity_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memes_details)

        val memeName=findViewById<TextView>(R.id.txt_memesName)

        val memeImage=findViewById<ImageView>(R.id.img_memes)

        val intent=intent
        val name=intent?.getStringExtra("name")
        val url=intent?.getIntExtra("url",0)

        if (url!=null){
            memeImage.setImageResource(url)
        }
        memeName.text=name

    }
}