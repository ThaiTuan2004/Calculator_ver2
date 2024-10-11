package com.example.calculator_ver2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var textReuslt: TextView

    var state: Int = 1
    var op: Int = 0
    var op1: Int = 0
    var op2: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textReuslt = findViewById(R.id.text_result)

        findViewById<Button>(R.id.button7).setOnClickListener(this)
        findViewById<Button>(R.id.button8).setOnClickListener(this)
        findViewById<Button>(R.id.button9).setOnClickListener(this)
        findViewById<Button>(R.id.button10).setOnClickListener(this)
        findViewById<Button>(R.id.button11).setOnClickListener(this)
        findViewById<Button>(R.id.button12).setOnClickListener(this)
        findViewById<Button>(R.id.button13).setOnClickListener(this)
        findViewById<Button>(R.id.button14).setOnClickListener(this)
        findViewById<Button>(R.id.button15).setOnClickListener(this)
        findViewById<Button>(R.id.button16).setOnClickListener(this)
        findViewById<Button>(R.id.button17).setOnClickListener(this)
        findViewById<Button>(R.id.button18).setOnClickListener(this)
        findViewById<Button>(R.id.button19).setOnClickListener(this)
        findViewById<Button>(R.id.button20).setOnClickListener(this)
        findViewById<Button>(R.id.button21).setOnClickListener(this)
        findViewById<Button>(R.id.button22).setOnClickListener(this)
        findViewById<Button>(R.id.button23).setOnClickListener(this)
        findViewById<Button>(R.id.button24).setOnClickListener(this)
        findViewById<Button>(R.id.button25).setOnClickListener(this)
        findViewById<Button>(R.id.button26).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val id = p0?.id
        if (id == R.id.button7) {
            addDigit(0)
        } else if (id == R.id.button11) {
            addDigit(1)
        } else if (id == R.id.button12) {
            addDigit(2)
        } else if (id == R.id.button13) {
            addDigit(3)
        } else if (id == R.id.button15) {
            addDigit(4)
        } else if (id == R.id.button16) {
            addDigit(5)
        } else if (id == R.id.button17) {
            addDigit(6)
        } else if (id == R.id.button19) {
            addDigit(7)
        } else if (id == R.id.button20) {
            addDigit(8)
        } else if (id == R.id.button21) {
            addDigit(9)
        } else if (id == R.id.button24) {
            C_Digit()
        } else if (id == R.id.button14) {
            op = 1
            state = 2
        } else if (id == R.id.button18) {
            op = 2
            state = 2
        } else if (id == R.id.button22) {
            op = 3
            state = 2
        } else if (id == R.id.button26) {
            op = 4
            state = 2
        } else if (id == R.id.button23) {

            textReuslt.text = "0"
            state = 1
            op1 = 0
            op2 = 0
            op = 0
        } else if (id == R.id.button10) {
            var result = 0
            if (op == 1) {
                result = op1 + op2
            } else if (op == 2) {
                result = op1 - op2
            } else if (op == 3) {
                result = op1 * op2
            } else if (op == 4) {
                result = op1 / op2
            }
            textReuslt.text = "$result"
            state = 1
            op1 = 0
            op2 = 0
            op = 0
        }

    }

    fun addDigit(c: Int) {
        if (state == 1) {
            op1 = op1 * 10 + c
            textReuslt.text = "$op1"
        } else {
            op2 = op2 * 10 + c
            textReuslt.text = "$op2"
        }
    }

    fun C_Digit() {
        if (state == 1) {
            op1 = op1 / 10
            textReuslt.text = "$op1"
        } else {
            op2 = op2 / 10
            textReuslt.text = "$op2"
        }
    }
}
