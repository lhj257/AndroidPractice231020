package com.example.myapp_test__7_8_9_10_11_12.ch18_Test.model

import com.google.gson.annotations.SerializedName

// 가져오는 데이터 타입 조사
// 샘플 데이터
    //{
    //            "id": 12,
    //            "email": "rachel.howell@reqres.in",
    //            "first_name": "Rachel",
    //            "last_name": "Howell",
    //            "avatar": "https://reqres.in/img/faces/12-image.jpg"
    //        }
data class UserModel(
    val id : String,
    val email : String,
    @SerializedName("first_name")
    val firstName : String,
    @SerializedName("last_name")
    val lastName : String,
    // 프로필 이미지가 저장된 위치의 URL 주소
    val avatar : String

    //추가로 속성 값 더 가져오기 테스트
)
