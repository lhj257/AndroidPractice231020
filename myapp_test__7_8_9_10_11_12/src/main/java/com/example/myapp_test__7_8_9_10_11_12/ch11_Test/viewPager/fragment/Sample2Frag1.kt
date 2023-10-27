package com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewPager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp_test__7_8_9_10_11_12.databinding.FragmentSample2Frag1Binding


class Sample2Frag1 : Fragment() {
   lateinit var binding: FragmentSample2Frag1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= FragmentSample2Frag1Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSample2Frag1Binding.inflate(layoutInflater)
        return binding.root
    }


}