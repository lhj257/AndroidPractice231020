package com.example.myapp_test6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp_test6.databinding.ActivityJoinBinding

class JoinActivity : AppCompatActivity() {

    private lateinit var binding: ActivityJoinBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityJoinBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}