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

//      무언가 변환된 결과값을 가져오고 싶을 때 활용
//      버튼이 눌리면 페이지 넘어가는 Intent를 변수 intentNickname에 저장
//      이후 nicknameTxt에 있는 값을 String으로 변환해준다. 변수 intentNickname은 "originalName"이라는 이름으로 변수 originalNickname으로 put해준다.
//      우리는 무언가 결과값을 얻기 위해 이 동작을 수행하는 것이므로 startActivityForResult를 활용. 변수 intentNickname을 실행한다. 이 때, 임의의 숫자가 필요한데 그 숫자를 직관적으로 알 수 있는 변수로 저장해주자.

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
//      특정 어플이나 기능으로 이동하기 위해 수행하는 기능. 굳이 외울 필요는 없다.
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

//  ??  onActivityResult는 2개 이상 못쓰는가?
//      특정 결과값을 도출하기위한 override function 인 것 같다.. 아직은 잘 이해 안됨.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_FOR_NICKNAME) {

            if (resultCode == RESULT_OK) {

//            위의 과정을 거쳐서 모두 옳다면 data를 nickname으로 put한 내용을 get해서 변수 newNickname에 저장
//            id nicknameTxt에 text로 변수 newNickname값을 넣는다.

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

