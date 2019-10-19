package com.example.seiseki_judgement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sub1.setOnClickListener{
            val intent = Intent(this, sub1_main::class.java)
            startActivity(intent)
        }
    }
}
