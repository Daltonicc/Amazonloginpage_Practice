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

        val userName = "ethan"
        val userPassword = "1234"
        val adminUser = "Ethan"

        signinBtn.setOnClickListener {
            val inputContent = emailEdt.text.toString()
            val inputContent2 = passwordEdt.text.toString()

            if (inputContent == userName && inputContent2 == userPassword ) {
                Toast.makeText(this, "${adminUser} 관리자입니다", Toast.LENGTH_SHORT).show()
                val signInIdIntent = Intent(this, AdminPageActivity::class.java)
                startActivity(signInIdIntent)
            }
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