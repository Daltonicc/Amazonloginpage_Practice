package com.example.amazonloginpage_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact_change.*

class ContactChangeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_change)

        val originalContact = intent.getStringExtra("originalContact")
        newContactEdt.setText(originalContact)

        newcontactDoneBtn.setOnClickListener {
            val inputContact = newContactEdt.text.toString()

            val contactIntent = Intent()
            contactIntent.putExtra("contact", inputContact)
            setResult(RESULT_OK, contactIntent)
            finish()

        }
    }
}