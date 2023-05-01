package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightText = findViewById<EditText>(R.id.weight)
        val heightText = findViewById<EditText>(R.id.height)
        val calcButton = findViewById<Button>(R.id.btnSubmit)

        calcButton.setOnClickListener {
            val weight = weightText.text.toString()
            val height = heightText.text.toString()

            val bmi = weight.toFloat()/((height.toFloat()/100)*(height.toFloat()/100))
            val bmi2Digits = String.format("%.2f",bmi).toFloat()
            displayResult(bmi2Digits)
        }
    }
    private fun displayResult(bmi:Float){
        val result = findViewById<TextView>(R.id.btnResults)
        result.text = bmi.toString()
    }
}