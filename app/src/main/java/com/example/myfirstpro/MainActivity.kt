package com.example.myfirstpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et1 = findViewById<EditText>(R.id.et1)
        var et2 = findViewById<EditText>(R.id.et2)
        var btn = findViewById(R.id.button)as Button

        btn.setOnClickListener(){
            val text1 = et1.text.toString().toInt()
            val text2 = et2.text.toString().toInt()
            var addi = text1+text2
            val i = Intent(this,Main2Activity::class.java)
            i.putExtra("res",addi.toString())
            startActivity(i)
        }


    }


}
