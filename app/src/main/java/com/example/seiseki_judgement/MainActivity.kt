package com.example.seiseki_judgement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.
import android.view.View
import android.intent



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onSub1BottunTapped(view: View?){
        val intent = this; sub1_main::class.java
        startActivity(intent)
    }
}
