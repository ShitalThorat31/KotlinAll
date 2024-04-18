package com.shital.kotlinall.ViewBindind_DataBinging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shital.kotlinall.R
import com.shital.kotlinall.databinding.ActivityViewBidingBinding

class ViewBidingActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewBidingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityViewBidingBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.txtName.text="Hi \n My name is SHITAL"
        binding.btnClickhere.setOnClickListener {

            binding.txtName.text="Hi \n My name is SHITAL THORAT"

        }
    }
}