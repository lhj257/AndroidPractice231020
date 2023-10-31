package com.example.mypractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.mypractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var imgCheck:String
    lateinit var TAG:String
    // 뷰 바인딩 설정 순서1,
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        imgCheck = "Y"
        TAG = "MainActivity"

        super.onCreate(savedInstanceState)

        // 뷰 바인딩 설정 순서2,
        // binding 인스턴스에, 모든 뷰를 담았다.
        binding = ActivityMainBinding.inflate(layoutInflater)

        // 뷰 바인딩 설정 순서3,
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
        //기본 뷰 선택 방법1
        // findViewById 를 이용해서, 로그인 버튼 클릭시, 해당 화면으로 이동하기.
        val loginBtn: Button = findViewById(R.id.loginBtn)

        // 뷰 바인딩 선택 방법2

        // 회원 가입 폼으로 이동 하는 화면.
        // val joinBtn: Button = findViewById(R.id.joinBtn)
        binding.joinBtn.setOnClickListener {
            // intent는 시스템에 메세지를 전달하는 용도로 사용도 하지만,
            // 일단, 액티비티 간 화면 이동으로 잠시 사용하기.
            val intent = Intent(this@MainActivitylhj, JoinActivity::class.java)
            // 이 함수 이용해서, 2번째 화면으로 이동하는함.
            startActivity(intent)
        }


        // 버튼으로 , 뷰 show/hide 해보기.
        val testBtn : Button = findViewById(R.id.testBtn)
        testBtn.setOnClickListener {
            Log.d(TAG,"버튼을 클릭시 확인.")
            if(imgCheck.equals("Y")) {
                val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.VISIBLE
                imgCheck = "N"
            } else {
                val imgView: ImageView = findViewById(R.id.imageView)
                imgView.visibility = View.INVISIBLE
                imgCheck = "Y"
            }
        }

        // 클릭시 이벤트 리스너 이용해서, 해당 화면으로 이동.
        loginBtn.setOnClickListener {
            val intent = Intent(this@MainActivitylhj, LoginFormActivity::class.java)
            startActivity(intent)
        }


        // viewBinding 기술을 이용해서, 좀더 쉽게 뷰를 선택하는 방법 이용해서, 해당 화면으로 이동하기.
    }
}