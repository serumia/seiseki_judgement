package com.example.seiseki_judgement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sub1tapped(sub1Activity: View){
    val intent = Intent(this, sub1Activity::class.java)
    startActivity(intent)
    }
}