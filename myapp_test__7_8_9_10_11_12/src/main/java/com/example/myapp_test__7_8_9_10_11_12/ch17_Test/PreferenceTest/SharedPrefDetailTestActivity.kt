package com.example.myapp_test__7_8_9_10_11_12.ch17_Test.PreferenceTest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test__7_8_9_10_11_12.R

class SharedPrefDetailTestActivity : AppCompatActivity() {
    // 2번 화면
    // 공유프리퍼런스 파일에 데이터 가져오기
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_pref_detail_test)
    }
}