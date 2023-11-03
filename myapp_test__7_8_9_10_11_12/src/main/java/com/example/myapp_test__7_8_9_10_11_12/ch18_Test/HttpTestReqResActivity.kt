package com.example.myapp_test__7_8_9_10_11_12.ch18_Test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp_test__7_8_9_10_11_12.R
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityHttpTestReqResBinding

class HttpTestReqResActivity : AppCompatActivity() {
    lateinit var binding : ActivityHttpTestReqResBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHttpTestReqResBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //reqres.in : 외국에서 무료 REST 테스트 서버 제공해주는 곳
        // 데이터를 받아서, 리사이클러 뷰에 출력 해보기.
        // 리사이클러뷰 준비물) 1) 어댑터 2) 뷰홀더 3) 목록 요소의 뷰 4) 데이터

        //http 통신
        //1) MyApplication 설정 파일 2) 인터페이스 3) 모델 또는 모델이 담겨진 리스트필요.

        // 준비작업 1) 모델 준비하기.
        // 2) 모델을 요소로 하는 리스트로 준비하기.
        // 주의사항.
        // https://reqres.in/api/users?page=2
        //{
        //    "page": 2,
        //    "per_page": 6,
        //    "total": 12,
        //    "total_pages": 2,
        //	// 이부분이 중요한 포인터, 나중에, 공공데이터, 특정api 받을때
        //	// 키 : data, 값 : 배열 [모델1, 모델2, 모델3, ....]
        //    "data": [
        //        {  // 모델 : DTO, VO
        //            "id": 7,
        //            "email": "michael.lawson@reqres.in",
        //            "first_name": "Michael",
        //            "last_name": "Lawson",
        //            "avatar": "https://reqres.in/img/faces/7-image.jpg"
        //        },
        //        {
        //            "id": 8,
        //            "email": "lindsay.ferguson@reqres.in",
        //            "first_name": "Lindsay",
        //            "last_name": "Ferguson",
        //            "avatar": "https://reqres.in/img/faces/8-image.jpg"
        //        },
        //        {
        //            "id": 9,
        //            "email": "tobias.funke@reqres.in",
        //            "first_name": "Tobias",
        //            "last_name": "Funke",
        //            "avatar": "https://reqres.in/img/faces/9-image.jpg"
        //        },
        //        {
        //            "id": 10,
        //            "email": "byron.fields@reqres.in",
        //            "first_name": "Byron",
        //            "last_name": "Fields",
        //            "avatar": "https://reqres.in/img/faces/10-image.jpg"
        //        },
        //        {
        //            "id": 11,
        //            "email": "george.edwards@reqres.in",
        //            "first_name": "George",
        //            "last_name": "Edwards",
        //            "avatar": "https://reqres.in/img/faces/11-image.jpg"
        //        },
        //        {
        //            "id": 12,
        //            "email": "rachel.howell@reqres.in",
        //            "first_name": "Rachel",
        //            "last_name": "Howell",
        //            "avatar": "https://reqres.in/img/faces/12-image.jpg"
        //        }
        //    ],
        //    "support": {
        //        "url": "https://reqres.in/#support-heading",
        //        "text": "To keep ReqRes free, contributions towards server costs are appreciated!"
        //    }
        //}

        //작업순서2 : 네트워크 인터페이스 정의하기.


    }
    //on Create
}