package com.example.amazonloginpage_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.amazonloginpage_practice.adapters.CobraAdapter
import com.example.amazonloginpage_practice.datas.CobraMember
import kotlinx.android.synthetic.main.activity_cobra_member.*

class CobraMemberActivity : AppCompatActivity() {

    val mCobraMemberList = ArrayList<CobraMember>()

    lateinit var mAdapter : CobraAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cobra_member)

        mCobraMemberList.add(CobraMember("박근보", 28, "중위", "중대장", "01011111111"))
        mCobraMemberList.add(CobraMember("최다운", 28, "중사", "부중대장", "01022222222"))
        mCobraMemberList.add(CobraMember("최승훈", 24, "하사", "통신담당관", "01033333333"))
        mCobraMemberList.add(CobraMember("강민관", 28, "하사", "통신담당관2", "01044444444"))
        mCobraMemberList.add(CobraMember("김형섭", 25, "병장", "통신병", "01055555555"))
        mCobraMemberList.add(CobraMember("오현구", 24, "상병", "특공병", "01066666666"))
        mCobraMemberList.add(CobraMember("김동현", 25, "상병", "의무병", "01077777777"))
        mCobraMemberList.add(CobraMember("김정민", 25, "일병", "특공병2", "01088888888"))
        mCobraMemberList.add(CobraMember("이승호", 28, "일병", "정찰폭파병", "01099999999"))
        mCobraMemberList.add(CobraMember("김동규", 24, "이병", "정찰폭파병2", "01000000000"))

        mAdapter = CobraAdapter(this, R.layout.member_list_item, mCobraMemberList)

        cobraTeamListView.adapter = mAdapter
    }

}