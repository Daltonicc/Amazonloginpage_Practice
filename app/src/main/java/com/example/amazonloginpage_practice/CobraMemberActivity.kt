package com.example.amazonloginpage_practice

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.amazonloginpage_practice.adapters.CobraAdapter
import com.example.amazonloginpage_practice.datas.CobraMember
import kotlinx.android.synthetic.main.activity_cobra_member.*
import kotlinx.android.synthetic.main.member_list_item.*

class CobraMemberActivity : AppCompatActivity() {

    val mCobraMemberList = ArrayList<CobraMember>()

    lateinit var mAdapter : CobraAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cobra_member)

        mCobraMemberList.add(CobraMember("박근보", 28, "예)중위", "중대장", "010-1111-1111"))
        mCobraMemberList.add(CobraMember("최다운", 28, "중사", "부중대장", "010-2222-2222"))
        mCobraMemberList.add(CobraMember("최승훈", 24, "하사", "통신담당관", "010-3333-3333"))
        mCobraMemberList.add(CobraMember("강민관", 28, "예)하사", "통신담당관2", "010-4444-4444"))
        mCobraMemberList.add(CobraMember("김형섭", 25, "예)병장", "통신병", "010-5555-5555"))
        mCobraMemberList.add(CobraMember("오현구", 24, "예)병장", "특공병", "010-6666-6666"))
        mCobraMemberList.add(CobraMember("김동현", 25, "예)병장", "의무병", "010-7777-7777"))
        mCobraMemberList.add(CobraMember("김정민", 25, "예)병장", "특공병2", "010-8888-8888"))
        mCobraMemberList.add(CobraMember("이승호", 28, "예)병장", "정찰폭파병", "010-9999-9999"))
        mCobraMemberList.add(CobraMember("김동규", 24, "예)병장", "정찰폭파병2", "010-0000-0000"))

        for (std in mCobraMemberList) {
            Log.d("팀원이름", std.name)
        }

        mAdapter = CobraAdapter(this, R.layout.member_list_item, mCobraMemberList)

        cobraTeamListView.adapter = mAdapter

        cobraMemberDoneBtn.setOnClickListener {
            finish()
        }
//         텍스트에는 setonclickListener 기능 불가능?
//        cobraContactTxt.setOnClickListener {
//            val inputCobraMemberNumber = cobraContactTxt.text.toString()
//
//            val dialUriCobra = Uri.parse("tel:${inputCobraMemberNumber}")
//
//            val dialIntent = Intent(Intent.ACTION_DIAL, dialUriCobra)
//
//            startActivity(dialIntent)
//        }
//


    }

}