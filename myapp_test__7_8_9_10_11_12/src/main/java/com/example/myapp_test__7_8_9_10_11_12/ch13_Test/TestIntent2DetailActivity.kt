package com.example.myapp_test__7_8_9_10_11_12.ch13_Test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTestIntent2DetailBinding

class TestIntent2DetailActivity : AppCompatActivity() {
    lateinit var binding:ActivityTestIntent2DetailBinding
    //2번 화면
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestIntent2DetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //1번 화면에서 넘어온 데이터 받아서, 결과 뷰에 붙이기 작업.
        // 임시 저장소에 담기.
        val name=intent.getStringExtra("name")
        val email=intent.getStringExtra("email")
        val age=intent.getIntExtra("age",28)

        binding.resultNameView.text="이름 : $name"
        binding.resultEmailView.text="이메일 : $email"
        binding.resultAgeView.text="나이 : $age"

    }
}