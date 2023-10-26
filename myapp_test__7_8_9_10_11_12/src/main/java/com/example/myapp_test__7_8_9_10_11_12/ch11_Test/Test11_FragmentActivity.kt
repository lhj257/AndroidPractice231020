package com.example.myapp_test__7_8_9_10_11_12.ch11_Test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.myapp_test__7_8_9_10_11_12.R
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTest11FragmentBinding

class Test11_FragmentActivity : AppCompatActivity() {
    //프래그먼트를 출력하기 위한 베이스 사용.
    lateinit var binding: ActivityTest11FragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTest11FragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //프래그먼트 출력하기. 연결(바인딩)
        val fragmentManager : FragmentManager = supportFragmentManager
        val transaction : FragmentTransaction = fragmentManager.beginTransaction()
        //첫번째 프래그먼트
        val oneFragment= OneFragment()
        //두번째 프래그먼트
        val twoFragment= TwoFragment()
        //세번째 프래그먼트
        val threeFragment=ThreeFragment()

        // 첫번째 프래그먼트 붙이기
        transaction.add(R.id.fragment1,oneFragment)
        // 두번째 프래그먼트 붙이기
        transaction.add(R.id.fragment2,twoFragment)
        // 세번째 프래그먼트 붙이기
        transaction.add(R.id.fragment3,threeFragment)
        //화면에 출력하기
        transaction.commit()

    }
}