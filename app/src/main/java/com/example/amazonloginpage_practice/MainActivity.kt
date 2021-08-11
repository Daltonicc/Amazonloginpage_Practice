package com.example.amazonloginpage_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        변수 username 이라는 곳에 "ethan"이라는 String값을 넣어준다.
        val userName = "ethan"
        val userPassword = "1234"
        val adminUser = "Ethan"

//        해당 버튼을 누르면 작동하는 과정
//        버튼을 누르면 inputContent 변수에 emailEdt값을 String값으로 변환시킨다.
//        inputContent2 변수도 똑같은 메커니즘

        signinBtn.setOnClickListener {
            val inputContent = emailEdt.text.toString()
            val inputContent2 = passwordEdt.text.toString()

//            변수 inputContent가 변수 userName과 동일하고 변수 inputContent2가 변수 userPassword와 동일할 때
//            아래의 코드 실행.
//            Toast라고 하는 텍스트를 잠깐 띄운다. context는 띄울 위치. text는 뭐라고 할 것인가? ${}안에 변수를 넣어줄 수 있다.
//        ??  LENGTH_SHORT는 무슨 뜻일까.
//
//            if문을 만족한다면 페이지를 다른 페이지로 넘기는 Intent값을 변수 signInIdIntnet에 저장한다.
//            이후 변수 signInIdIntent를 startActivity로 실행한다.
//        ??  뒷부분에 ::class.java가 의미하는 것은 무엇

            if (inputContent == userName && inputContent2 == userPassword ) {
                Toast.makeText(this, "${adminUser} 관리자입니다", Toast.LENGTH_SHORT).show()
                val signInIdIntent = Intent(this, AdminPageActivity::class.java)
                startActivity(signInIdIntent)
            }

//          if문을 만족하지 않았을 때 실행해줄 else문이다.
            else {
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }

        }

        createIdBtn.setOnClickListener {
            val createIdIntent = Intent(this, CreateAccountActivity::class.java)
            startActivity(createIdIntent)
        }

    }

}