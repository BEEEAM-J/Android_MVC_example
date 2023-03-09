package com.example.myapplication.model

data class Data(
    var num1: Int = 0,
    var num2: Int = 0
) {
    fun calculation(): Int {
        return num1 + num2
    }
}