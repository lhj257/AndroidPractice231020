package com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewpageandrecyclerview.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp_test__7_8_9_10_11_12.databinding.FragmentTest1Binding


class Test1Fragment : Fragment() {
    lateinit var binding : FragmentTest1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentTest1Binding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTest1Binding.inflate(layoutInflater,container,false)
        return binding.root
    }


}