package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.adapter.MyAdapter_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.adapter.MyAdapter
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.api.ApiUtilities
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.api.InterfaceJokes
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel.MemesViewModel_
import com.shital.kotlinall.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Main_Activity_Memes_Hilt: AppCompatActivity() {

    lateinit var memesViewModel_: MemesViewModel_
    lateinit var rvMain : RecyclerView
    lateinit var myAdapter: MyAdapter_
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_memes)
        rvMain = findViewById(R.id.recycler_view)
        rvMain.layoutManager = LinearLayoutManager(this)


        memesViewModel_= ViewModelProvider(this).get(MemesViewModel_::class.java)

        memesViewModel_.memes.observe(this, Observer {

            myAdapter = MyAdapter_(baseContext,it.data.memes)

            rvMain.adapter = myAdapter
        })
    }
}