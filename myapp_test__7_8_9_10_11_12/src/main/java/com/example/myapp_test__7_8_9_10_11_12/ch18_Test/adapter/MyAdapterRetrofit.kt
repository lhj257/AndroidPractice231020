package com.example.myapp_test__7_8_9_10_11_12.ch18_Test.adapter

import android.content.Context
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapp_test__7_8_9_10_11_12.ch16_Test.adapter.MyViewHolder
import com.example.myapp_test__7_8_9_10_11_12.ch18_Test.model.UserListModel
import com.example.myapp_test__7_8_9_10_11_12.ch18_Test.model.UserModel
import com.example.myapp_test__7_8_9_10_11_12.ch18_Test.retrofit.MyApplication
import com.example.myapp_test__7_8_9_10_11_12.databinding.ItemRetrofitBinding
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


// 매개변수에는 목록 요소의 뷰가,
// 이름 : item_retrofit.xml
// 왼쪽 : 이미지 하나, 오른쪽 : 세로 방향으로 텍스트 뷰 3개 정도.
class MyViewHolderRetrofit(val binding: ItemRetrofitBinding) :RecyclerView.ViewHolder(binding.root)

// 리사이클러뷰 준비물) 1) 어댑터 2) 뷰홀더 3) 목록 요소의 뷰 4) 데이터
// 매개변수 구성 1) context, 2) 데이터
// datas -> [모델1, 모델2, 모델3, ....]
// 클래스의 주생성자, 클래스명 뒤에 오는 소괄호 안에 내용. constructor 생략하고 많이 씀.
//val context : Context, val datas : List<UserModel>?,
// 변수에 타입을 val, var 지정하면 클래스 내에 전역으로 사용 가능.
// 그래서, 밑에 특정 함수 내부에서, datas를 쉽게 접근 및 사용이 가능.
class MyAdapterRetrofit (val context : Context, val datas : List<UserModel>?)
    : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    //틀 요소 할때,
    // 변경 되는 부분은 목록 요소 뷰홀더 부분
    // 1) MyViewHolderRetrofit
    // 2) ItemRetrofitBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
    : RecyclerView.ViewHolder {
        // 목록 요소를 해당 어댑터에 적용한다.
        return MyViewHolderRetrofit(ItemRetrofitBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    // 이코드 그대로 통으로 재사용.
    override fun getItemCount(): Int {
        // ? : 널 허용 연산자, ?: 엘비스 연산자,
        // 해당 값이 있으면, 그 값을 사용하고 : datas.size 사용하고,
        // 이게 만약 널이라고 한다면, 엘비스 연산자 ?: 다음의 기본값을 사용하세요.
        return datas?.size?: 0
    }

    //실제로 해당 뷰에, 데이터를 연결하는 부분.
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // 내부에서 뷰 작업 쉽게 할려고, 뷰 홀더로 형변환 후, 바인딩 재할당.
        val binding = (holder as MyViewHolderRetrofit).binding

        //datas에 담겨진 모델을 하나씩 꺼내서, 뷰에 데이터를 붙이는 작업.
        // 리스트의 각 요소마다 하나씩 꺼내어, 임의의 user 변수에 담기.
        val user = datas?.get(position)
        //뷰에 데이터 내용 붙이기. 1)일반 텍스트 먼저 붙이기.
        binding.retrofitEmailView.text=user?.email
        binding.retrofitFirstNameView.text=user?.firstName
        binding.retrofitLastNameView.text=user?.lastName

        //프로필 이미지를 가져오기, 레트로핏2 통신으로 이미지 따로 가져오기
//        val avatarImagCall = (context.applicationContext as MyApplication).networkService.getAvatarImage(user.avatar)
        // 이미지 가져오는 함수.
        //네트워크 함수 통해서 처리하는 부분, 방법1)
//        val avatarImagCall = user?.let {
//            (context.applicationContext as MyApplication).networkService.getAvatarImage(it.avatar)
//        }
//        // 실제로 이미지 가져오는 통신의 시작.
//        avatarImagCall?.enqueue(object :Callback<ResponseBody>{
//            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
//                // 이미지를 가져오기 성공시
//                //response, 사진 데이터가 들어있음
//                if(response.isSuccessful){
//                    if(response.body()!=null){
//                        val bitmap = BitmapFactory.decodeStream(response.body()!!.byteStream())
//                        //방법1
//                        binding.retrofitProfileImg.setImageBitmap(bitmap)
//
//                        //방법2, glide 사용.
//                        Glide.with(context)
//                            .load(bitmap)
//                            .override(100,100)
//                            .into(binding.retrofitProfileImg)
//
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                // 이미지를 가져오기 실패시
//                call.cancel()
//            }
//        })
        //네트워크 함수 통해서 처리하는 부분, 방법1)

        //glide 통해서, 이미지를 직접 가져와서 처리하는 부분.
        //방법2)
        Glide.with(context)
            //load 실제 URL 주소 직접 넣기.
            .load(user?.avatar)
            .override(100,100)
            .into(binding.retrofitProfileImg)
    }

}