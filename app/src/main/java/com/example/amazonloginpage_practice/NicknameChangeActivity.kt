package com.example.amazonloginpage_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_account.*
import kotlinx.android.synthetic.main.activity_nickname_change.*

class NicknameChangeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nickname_change)

//  ??  intent와 Intent의 차이는 뭘까.
//      put한 값인 originalName을 get해서 변수 originalNicknameIntent에 저장한다.

        val originalNicknameIntent = intent.getStringExtra("originalName")
//
//      newNicknameEdt에 미리 변수 originalNicknameIntent를 setText해둔다.
        newNicknameEdt.setText(originalNicknameIntent)


        nicknameDoneBtn.setOnClickListener {
            val inputNickname = newNicknameEdt.text.toString()

            val nicknameIntent = Intent()
            nicknameIntent.putExtra("nickname", inputNickname)
            setResult(RESULT_OK, nicknameIntent)
            finish()

        }

    }
}