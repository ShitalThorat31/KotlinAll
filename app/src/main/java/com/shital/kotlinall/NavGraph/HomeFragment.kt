package com.shital.kotlinall.NavGraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.shital.kotlinall.R
import com.shital.kotlinall.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
     private var _binding: FragmentHomeBinding?=null
     private val binding get() = _binding!!

   // private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        //val view= inflater.inflate(R.layout.fragment_home, container, false)


        binding.btnHome.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_dataFragment)
        }
       // return view
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}

