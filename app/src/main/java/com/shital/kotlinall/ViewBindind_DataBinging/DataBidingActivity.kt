package com.shital.kotlinall.ViewBindind_DataBinging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.shital.kotlinall.R
import com.shital.kotlinall.databinding.ActivityDataBidingBinding

class DataBidingActivity : AppCompatActivity() {
    lateinit var binding: ActivityDataBidingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_data_biding)

        binding.message="my name is NINAD"

        binding.btnClickMe.setOnClickListener {
            binding.txtmyName.text="my name is NINAD DABHADE"
        }
    }
}