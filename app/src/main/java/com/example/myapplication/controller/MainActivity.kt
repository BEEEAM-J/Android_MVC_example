package com.example.myapplication.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R
import com.example.myapplication.model.Data

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = Data()

        val edt1 = findViewById<EditText>(R.id.edt1)
        val edt2 = findViewById<EditText>(R.id.edt2)
        val text1 = findViewById<TextView>(R.id.text1)
        val btn1 = findViewById<Button>(R.id.btn1)

        // 사용자로부터 입력을 받으면 그에 맞는 처리를 진행
        btn1.setOnClickListener {
            val data = Data()
            edt1.text?.let {
                data.num1 = it.toString().toInt()
            }
            edt2.text?.let {
                data.num2 = it.toString().toInt()
            }
            text1.text = "${data.calculation()}"
        }

    }
}