package com.example.seiseki_judgement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_sub_1.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun sub1tapped(view: View?) {
        val intent = Intent(this, sub1Activity::class.java)
        startActivity(intent)
    }

    fun goukei(view: View) {
        val x: Array<EditText> = arrayOf(tenn1, tenn2, tenn3, tenn4)
        val sum = x[0] + x[1] + x[2] + x[3]
        TextView1.text = sum.toString()
    }

    private fun toString(sum: Unit) {}
    private operator fun Any.plus(EditText: EditText) {
    }
}

