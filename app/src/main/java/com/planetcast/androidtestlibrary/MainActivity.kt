package com.planetcast.androidtestlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.piyush.testlibrary.Maths

class MainActivity : AppCompatActivity() {

    private lateinit var add: Button
    private lateinit var numberOne: EditText
    private lateinit var numberTwo: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        add = findViewById(R.id.add)
        numberOne = findViewById(R.id.number_one)
        numberTwo = findViewById(R.id.number_two)

        add.setOnClickListener {
            val addedNumbers = Maths.addTwoNumbers(
                numberOne.text.toString().toInt(),
                numberTwo.text.toString().toInt()
            )
            Toast.makeText(this, "$addedNumbers", Toast.LENGTH_SHORT).show()
        }
    }
}