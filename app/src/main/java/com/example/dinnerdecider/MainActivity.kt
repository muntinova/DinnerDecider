package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Task A
    private var list = arrayListOf("Hamburger","Pizza","Mexican","American","Chinese")

    // Task B
    private var food : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Task B
        button.setOnClickListener {
            if (editText.text.toString().isNotEmpty()) {
                food = editText.text.toString()
                list.add(food)
                editText.text.clear()
            }
        }

        button2.setOnClickListener {
            tv.text = list.random()
        }
    }


}