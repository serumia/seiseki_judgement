package com.example.seiseki_judgement

import androidx.appcompat.app.AppCompatActivity
import android.intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.view.View.OnClickListener



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, activity_sub_1::class.java)
            startActivity(intent)
        }
        }
        }

    fun onSub1BottunTapped(view: View?){
        val intent = this; ::class.java
        startActivity(intent)
    }
}
