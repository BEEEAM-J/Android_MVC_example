package com.example.myapplication.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.model.Data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Data()

        val text1 = findViewById<TextView>(R.id.text1)
        val btn1 = findViewById<Button>(R.id.btn1)

        // 사용자로부터 입력을 받으면 그에 맞는 처리를 진행
        btn1.setOnClickListener {
            text1.text = "${data.data}"
        }

    }
}