package com.example.myapp_test__7_8_9_10_11_12.ch9_Test

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test__7_8_9_10_11_12.R
import com.example.myapp_test__7_8_9_10_11_12.ch7_Test.TestActivity
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTest9Binding

class Test9Activity : AppCompatActivity() {
    // 바인딩의 이름 규칙은, 레이아웃 이름을 따라 갑니다.(자동생성)
    // 단, build.gradle 에서 설정을 반드시 하고, (모듈버전에서)
    // 예) activity_test9 -> ActivityTest9Binding
    lateinit var activityTest9Binding: ActivityTest9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_test9)
        activityTest9Binding=ActivityTest9Binding.inflate(layoutInflater)
        setContentView(activityTest9Binding.root)

        activityTest9Binding.testImgRectangle.setOnClickListener {
            Toast.makeText(this@Test9Activity,"이미지 클릭됨",Toast.LENGTH_SHORT).show()
            val intent = Intent(this@Test9Activity,TestActivity::class.java)
            startActivity(intent)
        }
        // 소스 코드로, 정적 자원 사용하기. 문자열.
        activityTest9Binding.textView2.text = getString(R.string.app_intro)
    }
}