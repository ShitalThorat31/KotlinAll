package com.shital.kotlinall.Retrofit.get

import android.opengl.Visibility
import android.os.Bundle

import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.shital.kotlinall.databinding.ActivityRetrofitMethodsBinding

class Activity_GET:AppCompatActivity() {
    lateinit var binding: ActivityRetrofitMethodsBinding
    private lateinit var viewmodelGet: ViewModel_GET

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRetrofitMethodsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getAPI=Utils_Get.getInstance().create(Api_Get::class.java)
        val repostory= Repository_GET(getAPI)


        binding.apply {
            progressBar.visibility = View.VISIBLE
            tvId.visibility = View.GONE
            tvUserId.visibility = View.GONE
            tvBody.visibility = View.GONE
            tvTitle.visibility = View.GONE
        }

        viewmodelGet=ViewModelProvider(this,Factory_GET(repostory)).get(ViewModel_GET::class.java)

        viewmodelGet.getData.observe(this, Observer {

            //Log.d("GET_METHOD",it.userId.toString())
            //Log.d("GET_METHOD",it.title.toString())

            Log.d("GET_METHOD",it.count.toString())

            binding.progressBar.visibility = View.GONE
            binding.tvId.visibility = View.VISIBLE
            binding.tvUserId.visibility = View.VISIBLE
            binding.tvBody.visibility = View.VISIBLE
            binding.tvTitle.visibility = View.VISIBLE

//            binding.tvId.text = "id: ${it.id}"
//            binding.tvUserId.text = "user id: ${it.userId}"
//            binding.tvTitle.text = it.title
//            binding.tvBody.text = it.body

            binding.tvId.text = "id: ${it.count}"
            binding.tvUserId.text = "user id: ${it.totalPages}"
            binding.tvTitle.text = "user id: ${it.lastItemIndex}"
            binding.tvBody.text = "user id: ${it.page}"
        })


    }


}