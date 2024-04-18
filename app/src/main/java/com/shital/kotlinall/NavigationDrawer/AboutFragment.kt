package com.shital.kotlinall.NavigationDrawer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.shital.kotlinall.R
import com.shital.kotlinall.databinding.FragmentHomeBinding
import com.shital.kotlinall.databinding.FragmentHomeDrawerBinding

class AboutFragment : Fragment() {
    private var _binding: FragmentHomeDrawerBinding? = null
    private val binding get() = _binding!!

    // private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding = FragmentHomeDrawerBinding.inflate(inflater, container, false)
        //val view= inflater.inflate(R.layout.fragment_home, container, false)


        // return view
        return binding.root
    }
}
