package com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewpageandrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp_test__7_8_9_10_11_12.ch11_Test.recycler.MyAdapter
import com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewpageandrecyclerview.adapter.RecyclerViewTest
import com.example.myapp_test__7_8_9_10_11_12.ch11_Test.viewpageandrecyclerview.adapter.ViewPageAdapterTest
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTestPageRecyclerBinding

class TestPageRecyclerActivity : AppCompatActivity() {
    lateinit var binding:ActivityTestPageRecyclerBinding
    var newDataNumber = 16
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestPageRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //1)툴바 2)드로워  3) 드로워-네비게이션  4) 플로팅 액션 버튼
        //5) 앱바  6)탭 레이아웃

        //1) 툴바 붙이기, Test11_ToolVarActivity 재사용
        setSupportActionBar(binding.toolbar)




        // 뷰페이저2 프래그먼트 어댑터 이용해서 출력해보기.
        //현재 액티비티 도화지, 캔버스, 기본화면.
        // 여기에 뷰페이저와 리사이클러뷰 두개를 붙일 예정.

        //뷰페이저2 준비물 1)프래그먼트 어댑터 2)목록요소, 프래그먼트 3개 필요. 3)더미 데이터(=자기자신)
        binding.viewPager1.adapter=ViewPageAdapterTest(this)

        //리사이클러 뷰 붙이기
        //준비물) 1)리사이클러뷰 어댑터 2)목록요소의 아이템 뷰  3) 더미 데이터
        val datas = mutableListOf<String>()
        for (i in 1..15){
            datas.add("더미 데이터 추가 번호 $i")
        }
        //출력 방향, 리니어 나란히 수직으로
        val layoutManager =LinearLayoutManager(this)
        // 리사이클러뷰 속성에 옵션에 출력 옵션 붙이기.
        binding.recyclerViewTest.layoutManager =layoutManager
        // 리사이클러뷰 속성 옵션에 데이터를 붙이기, 어댑터를 연결한다.
        binding.recyclerViewTest.adapter=RecyclerViewTest(datas)

        val customAdapter = MyAdapter(datas)
        binding.recyclerViewTest.adapter = customAdapter

        binding.addBtn.setOnClickListener {
            datas.add("NEW DATA " + newDataNumber++)
            customAdapter.notifyItemInserted(datas.size)
        }

        binding.delBtn.setOnClickListener {
            datas.removeAt(datas.size - 1)
            customAdapter.notifyDataSetChanged() // 만능, 되도록 사용x
        }

    }
}