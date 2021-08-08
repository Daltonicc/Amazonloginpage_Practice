package com.example.amazonloginpage_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_admin_page.*

class AdminPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_page)

        memberCheckBtn.setOnClickListener {
            val cobraMemberIntent = Intent(this, KobraMemberActivity::class.java)
            startActivity(cobraMemberIntent)
        }

        teamDoneBtn.setOnClickListener {
            finish()
        }

    }
}