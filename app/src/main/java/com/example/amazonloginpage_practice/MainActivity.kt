package com.example.amazonloginpage_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = "ethanpark604@gmail.com"
        val userPassword = "12346567890"
        val adminUser = "Ethan"

        signinBtn.setOnClickListener {
            val inputcontent = emailEdt.text.toString()
            val inputcontent2 = passwordEdt.text.toString()


            if (inputcontent == userName && inputcontent2 == userPassword ) {
                Toast.makeText(this, "${adminUser} 관리자입니다", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

        }
    }
}