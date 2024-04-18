//package com.shital.kotlinall.MVVMHilt_Main
//
//import android.os.Bundle
//import android.util.Log
//import androidx.appcompat.app.AppCompatActivity
//import androidx.lifecycle.Observer
//import androidx.lifecycle.ViewModelProvider
//
//import com.shital.kotlinall.R
//import com.shital.kotlinall.ViewModelLiveData.MainViewModel
//import dagger.hilt.android.AndroidEntryPoint
//
//@AndroidEntryPoint
//class MainRetroActivity1:AppCompatActivity() {
//
//     lateinit var mainViewModel:MainViewModel1
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_retrofit)
//
//       // val entryList=RetrofitHelper.getInstance().create(EntryService::class.java)
//        //val repostory=EntryRepostory(entryList)   ---- for Restrofit
//
//
//      mainViewModel=ViewModelProvider(this).get(MainViewModel1::class.java)
//
//        mainViewModel.etry.observe(this, Observer {
//
//            Log.d("List",it.entries.toString())
//        })
//    }
//}