package com.example.amazonloginpage_practice.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.amazonloginpage_practice.R
import com.example.amazonloginpage_practice.datas.CobraMember

class CobraAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<CobraMember>) : ArrayAdapter<CobraMember>(mContext, resId, mList) {

        val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.member_list_item, null)
        }

        val row = tempRow!!

        val cobraMemberData = mList[position]

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val rankTxt = row.findViewById<TextView>(R.id.rankTxt)
        val positionTxt = row.findViewById<TextView>(R.id.positionTxt)
        val contactTxt = row.findViewById<TextView>(R.id.contactTxt)

        nameTxt.text = cobraMemberData.name
        ageTxt.text = cobraMemberData.name
        rankTxt.text = cobraMemberData.name
        positionTxt.text = cobraMemberData.name
        contactTxt.text = cobraMemberData.name


        return row

    }

}