package com.example.myapp_test__7_8_9_10_11_12.ch13_Test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTestBundleBinding

class TestBundleActivity : AppCompatActivity() {
    lateinit var binding : ActivityTestBundleBinding
    var count=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityTestBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //화면이 회전시 데이터 손실이 되는데
        // 임시 저장소 번들에 저장하고, 값으 ㄹ가져오기.
        //앱을 사용중에는 기본 값들을 세터 및 게터가 용이하고,
        // 앱이 종료하면, 휘발성 담점.
        // 비휘발성, 실제 내부 저장소를 사용할 예정 1) 파일 2) 데이터베이스(SQLite) 3) 외부 디비를 사용할 예정.


        binding.countBtn.setOnClickListener {
            count++
            binding.resultText.text = "$count"
        }

        //onCreate 마지막 블럭 부분
    }

    //onCreate 밖에서,
    //번들 객체 이용함.
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //데이터 세터, onDestory() 전에 저장하고
        outState.putString("data1","Hello~~~~")
        outState.putInt("data2",20)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        //데이터 게터, onResume()전에 불러오기
        val data1= savedInstanceState.getString("data1")
        val data2=savedInstanceState.getInt("data2")
        binding.resultText.text="$data1 - $data2"
    }
}