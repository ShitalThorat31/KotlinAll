package com.shital.kotlinall.Retrofit.put

import android.opengl.Visibility
import android.os.Bundle

import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.shital.kotlinall.databinding.ActivityRetrofitMethodsBinding

class Activity_PUT:AppCompatActivity() {

    lateinit var binding: ActivityRetrofitMethodsBinding
    private lateinit var viewmodelGet: ViewModel_PUT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRetrofitMethodsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getAPI=Utils_Put.getInstance().create(Api_PUT::class.java)
        val repostory= Repository_Put(getAPI)


        binding.apply {
            progressBar.visibility = View.VISIBLE
            tvId.visibility = View.GONE
            tvUserId.visibility = View.GONE
            tvBody.visibility = View.GONE
            tvTitle.visibility = View.GONE
        }

        viewmodelGet=ViewModelProvider(this,Factory_PUT(repostory)).get(ViewModel_PUT::class.java)

        viewmodelGet.getData.observe(this, Observer {

            //Log.d("GET_METHOD",it.userId.toString())
            //Log.d("GET_METHOD",it.title.toString())

            Log.d("PUT_METHOD",it.title.toString())

            binding.progressBar.visibility = View.GONE
            binding.tvId.visibility = View.VISIBLE
            binding.tvUserId.visibility = View.VISIBLE
            binding.tvBody.visibility = View.VISIBLE
            binding.tvTitle.visibility = View.VISIBLE

            binding.tvId.text = "id: ${it.id}"
            binding.tvUserId.text = "user id: ${it.userId}"
            binding.tvTitle.text = it.title
            binding.tvBody.text = it.body


        })


    }


}