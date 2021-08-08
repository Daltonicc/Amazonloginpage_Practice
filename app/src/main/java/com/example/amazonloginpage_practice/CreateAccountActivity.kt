package com.example.amazonloginpage_practice

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_create_account.*

class CreateAccountActivity : AppCompatActivity() {

    val REQUEST_FOR_NICKNAME = 1000
    val REQUEST_FOR_CONTACT = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        nicknameChangeBtn.setOnClickListener {
            val intentNickname = Intent(this, NicknameChangeActivity::class.java)

            val originalNickname = nicknameTxt.text.toString()
            intentNickname.putExtra("originalName", originalNickname)

            startActivityForResult(intentNickname, REQUEST_FOR_NICKNAME)
        }

        changeContactBtn.setOnClickListener {
            val intentContact = Intent(this, ContactChangeActivity::class.java)

            val originalContact = contactTxt.text.toString()
            intentContact.putExtra("originalContact", originalContact)

            startActivityForResult(intentContact, REQUEST_FOR_CONTACT)

        }

        dialBtn.setOnClickListener {
            val inputPhoneNumber = contactTxt.text.toString()

            val dialUri = Uri.parse("tel:${inputPhoneNumber}")

            val dialIntent = Intent(Intent.ACTION_DIAL, dialUri)

            startActivity(dialIntent)

        }

        createDoneBtn.setOnClickListener {
            finish()
        }
    }

//    onActivityResult는 2개 이상 못쓰는가?

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_FOR_NICKNAME) {

            if (resultCode == RESULT_OK) {

                val newNickname = data?.getStringExtra("nickname")
                nicknameTxt.text = newNickname
            }
        }

        if (requestCode == REQUEST_FOR_CONTACT) {

            if (resultCode == RESULT_OK) {

                val newContact = data?.getStringExtra("contact")
                contactTxt.text = newContact
            }
        }
    }


}

