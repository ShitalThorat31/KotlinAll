package com.shital.kotlinall.ViewModelLiveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.lifecycle.ViewModelProvider
import com.shital.kotlinall.databinding.ActivityMainViewmodelBinding

class MainActivity_ViewModel : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel
    lateinit var binding:ActivityMainViewmodelBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        binding= ActivityMainViewmodelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.text.observe(this,{
           binding.textView.text=it.toString()
        })



        binding.button.setOnClickListener {
            mainViewModel.updateText()
        }
    }
}