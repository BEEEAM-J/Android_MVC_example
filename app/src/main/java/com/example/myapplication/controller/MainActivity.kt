package com.example.myapplication.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.model.Data

class MainActivity : AppCompatActivity() {

    private lateinit var data: Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtId = findViewById<EditText>(R.id.edt_id)
        val edtPassword = findViewById<EditText>(R.id.edt_password)
        val btnLogin = findViewById<Button>(R.id.btn_login)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        data = Data()

        btnLogin.setOnClickListener {
            val loginStatus = data.login(
                edtId.text.toString(),
                edtPassword.text.toString()
            )

            if (loginStatus) {
                tvResult.text = "성공!"
            } else {
                tvResult.text = "실패.."
            }
        }
    }
}