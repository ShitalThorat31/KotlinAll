package com.shital.kotlinall.MVVMRetrofit.actitivity

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.shital.kotlinall.MVVMRetrofit.viewModel.MainViewModel
import com.shital.kotlinall.MVVMRetrofit.viewModel.MainViewModelFactory
import com.shital.kotlinall.R

class MainRetroActivity:AppCompatActivity() {

    private lateinit var mainViewModel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

       // val entryList=RetrofitHelper.getInstance().create(EntryService::class.java)
        //val repostory=EntryRepostory(entryList)   ---- for Restrofit

//        val repostory=(application as EntryApplication).entryRepostory
//        mainViewModel=ViewModelProvider(this,MainViewModelFactory(repostory)).get(MainViewModel::class.java)
//
//        mainViewModel.etry.observe(this, Observer {
//
//            Log.d("List",it.count.toString())
//        })
    }
}