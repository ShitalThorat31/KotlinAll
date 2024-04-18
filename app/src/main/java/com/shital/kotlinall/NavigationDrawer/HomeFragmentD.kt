package com.shital.kotlinall.NavigationDrawer

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withHilt.adapter.MyAdapter_
import com.shital.kotlinall.MVVM_Retrofit_RecyclerView_MemesApp.withoutHilt.viewmodel.MemesViewModel_
import com.shital.kotlinall.R
import com.shital.kotlinall.databinding.FragmentHomeDrawerBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragmentD : Fragment() {
    private var _binding: FragmentHomeDrawerBinding? = null
    private val binding get() = _binding!!
    lateinit var memesViewModel_: MemesViewModel_
    lateinit var rvMain : RecyclerView
    lateinit  var myAdapter: MyAdapter_1

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentHomeDrawerBinding.inflate(inflater, container, false)

        return binding.root
    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

      memesViewModel_= ViewModelProvider(this).get(MemesViewModel_::class.java)
        memesViewModel_.memes.observe(viewLifecycleOwner, Observer {


            val layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
           // val layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

            rvMain=itemView.findViewById(R.id.recycler_view)
            rvMain.layoutManager=layoutManager
            rvMain.setHasFixedSize(true)
            myAdapter = MyAdapter_1(it.data.memes)

            rvMain?.adapter = myAdapter
        })

    }
}