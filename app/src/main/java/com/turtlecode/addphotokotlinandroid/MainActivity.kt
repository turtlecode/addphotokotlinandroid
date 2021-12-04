package com.turtlecode.addphotokotlinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun button_onclick (view: View) {
        val name = name_person.text.toString()
        val surname = surname_person.text.toString()
        textView.text = "Hi ${name} ${surname} welcome to forest. Enjoy!"
    }
}