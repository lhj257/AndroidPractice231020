package com.example.myapp_test__7_8_9_10_11_12.ch11_Test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp_test__7_8_9_10_11_12.databinding.FragmentThreeBinding


class ThreeFragment : Fragment() {
    lateinit var binding: FragmentThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThreeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }


}