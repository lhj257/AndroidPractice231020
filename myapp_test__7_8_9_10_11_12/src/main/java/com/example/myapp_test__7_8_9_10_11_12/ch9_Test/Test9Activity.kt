package com.example.myapp_test__7_8_9_10_11_12.ch9_Test

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.WindowMetrics
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
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

        //해당 라이브러리의 기능을 확인하는 부분 보다.
        // sdk 버전에 따라서, 라이브러리 패키지 명 등, 다른 부분에 집중.
        // 사용하는 라이브러리의 sdk 버전의 지원 여부 확인.
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R){
            val windowMetrics: WindowMetrics = windowManager.currentWindowMetrics
            Log.d("lhj","width : ${windowMetrics.bounds.width()}, height:${windowMetrics.bounds.height()}")
        }else{
            val display=windowManager.defaultDisplay
        }

        // 허가 확인 여부 테스트
        val status = ContextCompat.checkSelfPermission(this@Test9Activity,
            "android.permission.ACCESS_FINE_LOCATION")
        if(status == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this@Test9Activity,"위치 권한 승인됨",Toast.LENGTH_SHORT).show()
            Log.d("lhj","권한 승인됨:${status}")
        }else{
            Toast.makeText(this@Test9Activity,"위치 권한 승인안됨",Toast.LENGTH_SHORT).show()
            Log.d("lhj","권한 승인안됨:${status}")
        }

        //후처리, 인텐트 기본적인 사용법 단순 페이지 이동만 사용했음.
        // 인텐트 ? -> 시스템에 메세지를 전달자.
        // 예) 페이지 이동 같은 경우, 시스템에 요청해서, 이동했음.
        // 예2) 특정 앱에 접근을 해서, 데이터를 가져오는 작업(=후처리)
        // 설정1)
        val requestPermissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestPermission()){
            isGranted ->
            if(isGranted){
                Log.d("lhj","권한 승인됨, call back 후처리 요청.")
            }else{
                Log.d("lhj","권한 승인안됨, call back 후처리 요청.")
            }
        }
        //이용
        requestPermissionLauncher.launch("android.permission.ACCESS_FINE_LOCATION")

    }
}