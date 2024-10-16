package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var numberOne:EditText
    lateinit var numberTwo: EditText
    lateinit var btnAdd:ImageButton
    lateinit var btnSub:ImageButton
    lateinit var btnMultiply:ImageButton
    lateinit var btnDivide:ImageButton
    lateinit var tvAnswer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberOne = findViewById(R.id.number1)
        numberTwo = findViewById(R.id.number2)
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtract)
        btnMultiply = findViewById(R.id.btn_multiply)
        btnDivide = findViewById(R.id.btn_divide)
        tvAnswer =findViewById(R.id.tvAnswer)


        btnAdd.setOnClickListener {
            add()
        }

        btnSub.setOnClickListener {
            subtract()
        }

        btnDivide.setOnClickListener {
            divide()
        }

        btnMultiply.setOnClickListener {
            multiply()
        }
    }

    private fun add()
    {
        val num1 = numberOne.text.toString().toIntOrNull()
        val num2 = numberTwo.text.toString().toIntOrNull()

        if (num1 != null || num2!= null) {
            val result = num1?.plus(num2!!)
            tvAnswer.text= result.toString()
            }
        else if (num1 == null) {
            Toast.makeText(this,"Please enter the first number", Toast.LENGTH_SHORT).show()
        }
        else if (num2 == null) {
            Toast.makeText(this,"Please enter the second number", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"Please enter a number", Toast.LENGTH_SHORT).show()
        }



    }

    private fun subtract()
    {
        val num1 = numberOne.text.toString().toIntOrNull()
        val num2 = numberTwo.text.toString().toIntOrNull()

        if (num1 != null || num2!= null) {
            val result = num1?.minus(num2!!)
            tvAnswer.text= result.toString()
        }
        else if (num1 == null) {
            Toast.makeText(this,"Please enter the first number", Toast.LENGTH_SHORT).show()
        }
        else if (num2 == null) {
            Toast.makeText(this,"Please enter the second number", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"Please enter a number", Toast.LENGTH_SHORT).show()
        }

    }

    private fun multiply()
    {
        val num1 = numberOne.text.toString().toIntOrNull()
        val num2 = numberTwo.text.toString().toIntOrNull()

        if (num1 != null || num2!= null) {
            val result = num1?.times(num2!!)
            tvAnswer.text = result.toString()
        }else if (num1 == null) {
            Toast.makeText(this,"Please enter the first number", Toast.LENGTH_SHORT).show()
        }
        else if (num2 == null) {
            Toast.makeText(this,"Please enter the second number", Toast.LENGTH_SHORT).show()
        }

        else{
            Toast.makeText(this,"Please enter a number", Toast.LENGTH_SHORT).show()
        }
    }

    private fun divide()
    {
        val num1 = numberOne.text.toString().toIntOrNull()
        val num2 = numberTwo.text.toString().toIntOrNull()

        if (num1 != null || num2!= null) {
            val result = num1?.div(num2!!)
            tvAnswer.text = result.toString()
        }
        else if (num1 == null) {
            Toast.makeText(this,"Please enter the first number", Toast.LENGTH_SHORT).show()
        }
        else if (num2 == null) {
            Toast.makeText(this,"Please enter the second number", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this,"Please enter a number", Toast.LENGTH_SHORT).show()
        }
    }


}

