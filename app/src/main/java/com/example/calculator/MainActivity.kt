package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var lastInp = false
    var dot=false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View) {

        txtv.append((view as Button).text)
        lastInp=true

    }



    fun onOperator(view: View) {}



    fun onDecimalPoint(view: View) {

        if(lastInp && !dot){
            txtv.append(".")
            dot=true
            lastInp=false
        }
    }



    fun onClear(view: View) {
        txtv.text = ""
        dot=false
        lastInp=false
    }



    fun onEqual(view: View) {}




}

