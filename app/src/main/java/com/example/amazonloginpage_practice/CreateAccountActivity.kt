package com.example.amazonloginpage_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccountActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        nicknameChangeBtn.setOnClickListener {
            val intentNickname = Intent(this, NicknameChangeActivity::class.java)
            startActivityForResult(intentNickname, REQUEST_FOR_NICKNAME)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_FOR_NICKNAME) {

            if (resultCode == RESULT_OK) {

                val newNickname = data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname
            }
        }
    }
}

