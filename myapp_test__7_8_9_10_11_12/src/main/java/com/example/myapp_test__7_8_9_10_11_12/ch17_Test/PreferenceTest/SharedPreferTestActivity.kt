package com.example.myapp_test__7_8_9_10_11_12.ch17_Test.PreferenceTest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivitySharedPreferTestBinding


class SharedPreferTestActivity : AppCompatActivity() {
    // 1번화면
    // val test = 공유프리퍼런스 파일에 데이터 담기
    // 공유프리퍼런스 파일 -> 모든 액티비티 화면에서 접근이 가능함.
    // EditText 뷰에서,
    // 라디오 뷰에서,
    // 각 뷰에서, 데이터를 가져와서, (마치 회원 가입 하듯이)
    // test에 저장.
    lateinit var binding : ActivitySharedPreferTestBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySharedPreferTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //이벤트 처리할 예정
        // 회원가입에서 사용했던 뷰 재사용
        binding.buttonInsertSP.setOnClickListener {
            val email = binding.userEmail.text.toString()
            val password = binding.userPassword.text.toString()
            val pickRadio = getValue(binding.testRadioGroup)
            //라디오 잠시 대기

            //공유프리퍼런스 값 넣기. 저장
            val pref = getSharedPreferences("userInfo", MODE_PRIVATE)
            val editor = pref.edit()
            editor.putString("email", email)
            editor.putString("password", password)
            editor.putString("pickRadio",pickRadio)
            editor.commit()

            //2번 화면으로 이동.
            val intent = Intent(this,SharedPrefDetailTestActivity::class.java)
            startActivity(intent)
        }



    }
    // 함수의 매개변수에 : 라디오 그룹을 넣었음. 참고) 1) 라디오 그룹 2) 라디오 요소 구성
    fun getValue(v: View?): String? {
        val male = binding.radio1
        val female = binding.radio2
        var pickValue: String? = null

        if (male.isChecked) {
            pickValue = male.text.toString()
        } else if (female.isChecked) {
            pickValue = female.text.toString()
        }
        return pickValue
    }
}