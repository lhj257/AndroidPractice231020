package com.example.myapp_test__7_8_9_10_11_12.ch13_Test

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTestIntentBinding

class TestIntentActivity : AppCompatActivity() {
    //1번 화면
    lateinit var binding: ActivityTestIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTestIntentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //인텐트에 기본 데이터 추가 및 가져오기 테스트.
        binding.testBtn1.setOnClickListener {
            //데이터를 추가해서 + 화면 이동 : 내부 앱끼리 연동
            val intent = Intent(this@TestIntentActivity,TestIntent2DetailActivity::class.java)
            //데이터 추가 해보기.
            intent.putExtra("name","lhj")
            intent.putExtra("email","lhj@naver.com")
            intent.putExtra("age",20)
            startActivity(intent)
        }
    }
}