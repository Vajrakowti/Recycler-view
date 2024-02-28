package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList:Array<Int>
    lateinit var titleList:Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.google,
            R.drawable.apple,
            R.drawable.amazon,
            R.drawable.whatsapp,
            R.drawable.insta,
            R.drawable.lamo,
            R.drawable.bcc,
            R.drawable.bugatti,
            R.drawable.csk,
            R.drawable.tata,
            R.drawable.colgate,
            R.drawable.netflix,
            R.drawable.britannia,
            R.drawable.tesla,
            R.drawable.mrf,
            R.drawable.sbi,
            R.drawable.indigo)

        titleList = arrayOf(
            "GOOGLE",
            "APPLE",
            "AMAZON",
            "WHATSAPP",
            "INSTAGRAM",
            "LAMO",
            "BCC",
            "BUGATTI",
            "CSK",
            "TATA",
            "COLGATE",
            "NETFLIX",
            "BRITANNIA",
            "TESLA",
            "MRF",
            "SBI",
            "INDIGO")

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for (i in imageList.indices){
            val dataClass = DataClass(imageList[i], titleList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}