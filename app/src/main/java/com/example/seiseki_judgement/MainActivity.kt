package com.example.seiseki_judgement

import androidx.appcompat.app.AppCompatActivity
import android.intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.view.View.OnSub1BottunTapped



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sub_1tapped(vier: View?){
    val intent = Intent(this, avtivity_sub_1::class.java)
    startActivity(intent)
    }
}