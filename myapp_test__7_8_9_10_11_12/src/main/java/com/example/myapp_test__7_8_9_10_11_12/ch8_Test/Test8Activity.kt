package com.example.myapp_test__7_8_9_10_11_12.ch8_Test

import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test__7_8_9_10_11_12.databinding.ActivityTest8Binding

class Test8Activity : AppCompatActivity() {
    lateinit var activityTest8Binding: ActivityTest8Binding
    lateinit var TAG:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TAG="lhj"
//        setContentView(R.layout.activity_test8)
        //모든 뷰들의 인스턴스들을 하나의 인스턴스에 모두 담기.
        //하나의 인스턴스에서 뷰를 꺼내에서 사용하기.
        activityTest8Binding=ActivityTest8Binding.inflate(layoutInflater)
        //모두 담은 인스턴스의 부모 레이아웃을 출력을 함.
        setContentView(activityTest8Binding.root)


    }
    override fun onTouchEvent(event: MotionEvent): Boolean{
        when(event?.action){
            MotionEvent.ACTION_DOWN ->{
                Log.d(TAG, "Touch down event x:${event.x}, event rawX:${event.rawX}, event y:${event.y}, event rawY:${event.rawY}")
                Toast.makeText(this@Test8Activity,"touch down event",Toast.LENGTH_SHORT).show()
            }
            MotionEvent.ACTION_UP ->{
                Log.d(TAG, "Touch up event x:${event.x}, event rawX:${event.rawX}, event y:${event.y}, event rawY:${event.rawY}")
                Toast.makeText(this@Test8Activity,"touch up event",Toast.LENGTH_SHORT).show()
            }
            MotionEvent.ACTION_MOVE ->{
                Log.d(TAG, "Touch move event x:${event.x}, event rawX:${event.rawX}, event y:${event.y}, event rawY:${event.rawY}")
            }
        }
        return super.onTouchEvent(event)
    }

}