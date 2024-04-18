package com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.adapter.MyAdapter
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.api.InterfaceJokes_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.api.ApiUtilities
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.api.InterfaceJokes
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository.MemesRepository
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.retpository.MemesRepository_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel.FactoryModel
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel.MemesViewModel
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel.MemesViewModel_
import com.shital.kotlinall.R

class Main_Activity_Memes:AppCompatActivity() {

    private lateinit var memesViewModel: MemesViewModel

    lateinit var rvMain : RecyclerView
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_memes)
        rvMain = findViewById(R.id.recycler_view)
        rvMain.layoutManager = LinearLayoutManager(this)
        val interfaceJokes= ApiUtilities.getInstance().create(InterfaceJokes::class.java)

        val memesRepository= MemesRepository(interfaceJokes)

        memesViewModel= ViewModelProvider(this, FactoryModel(memesRepository)).get(MemesViewModel::class.java)
        memesViewModel.memes.observe(this, Observer {

            myAdapter = MyAdapter(baseContext,it.data.memes)

            rvMain.adapter = myAdapter

//            it.data.memes.iterator().forEach {
//                Log.d("MEMES","name:${it.name}\nimage : ${it.url}")
//              //  var data = response.body()!!
//
//
//            }

        })
        }
}