package com.shital.kotlinall.NavGraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shital.kotlinall.R
import com.shital.kotlinall.databinding.FragmentDataBinding
import com.shital.kotlinall.databinding.FragmentHomeBinding


class DataFragment : Fragment() {

    private lateinit var binding: FragmentDataBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentDataBinding.inflate(inflater, container, false)
        //val view= inflater.inflate(R.layout.fragment_home, container, false)


        binding.btnData.setOnClickListener {

            findNavController().navigate(R.id.action_dataFragment_to_homeFragment)
        }
        // return view
        return binding.root
    }
}



