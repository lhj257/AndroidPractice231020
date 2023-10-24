package com.example.myapp_test__7_8_9_10_11_12.ch7_Test

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    lateinit var activityTestBinding: ActivityTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_test)
        activityTestBinding= ActivityTestBinding.inflate(layoutInflater)
        setContentView(activityTestBinding.root)

        //프레임 레이아웃에서, 버튼과, 이미지를 클릭 이벤트를 이요해서 show/hide
        activityTestBinding.frameBtn.setOnClickListener {
            activityTestBinding.frameBtn.visibility= View.INVISIBLE
            activityTestBinding.img1.visibility=View.VISIBLE
        }
        activityTestBinding.img1.setOnClickListener {
            activityTestBinding.frameBtn.visibility= View.VISIBLE
            activityTestBinding.img1.visibility=View.INVISIBLE
        }
    }
}