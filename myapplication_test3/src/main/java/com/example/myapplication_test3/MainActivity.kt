package com.example.myapplication_test3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// 액티비티, (시스템 클래스 = 컴포넌트 클래스),
// 일반 클래스와의 차이점은, 어느 클래스를 상속을 받는지 여부에 따라서, 결정,
// 예)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}