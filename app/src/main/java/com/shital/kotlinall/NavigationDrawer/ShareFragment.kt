package com.shital.kotlinall.NavigationDrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.shital.kotlinall.databinding.FragmentHomeDrawerBinding
import com.shital.kotlinall.databinding.FragmentShareDrawerBinding

class ShareFragment : Fragment() {
    private var _binding: FragmentShareDrawerBinding? = null
    private val binding get() = _binding!!

    // private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentShareDrawerBinding.inflate(inflater, container, false)
        //val view= inflater.inflate(R.layout.fragment_home, container, false)


        // return view
        return binding.root
    }
}