package com.example.simplecalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Instantiate the user interface elements
    lateinit var mAnswer:TextView
    lateinit var mFirstNum:EditText
    lateinit var mSecondNum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mDiv:Button
    lateinit var mMul:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        mAnswer = findViewById(R.id.mTvAnswer)
        mFirstNum = findViewById(R.id.mEdtFirstNum)
        mSecondNum = findViewById(R.id.mEdtSecondNum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mMul = findViewById(R.id.mBtnMul)
        mDiv = findViewById(R.id.mBtnDiv)
        // Set onClick listeners to buttons
        mAdd.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstNum.text.toString().trim()
            var secondNumber = mSecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var answer = firstNumber.toDouble() + secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = answer.toString()
            }
        }
        mSub.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstNum.text.toString().trim()
            var secondNumber = mSecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var answer = firstNumber.toDouble() - secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = answer.toString()
            }
        }
        mDiv.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstNum.text.toString().trim()
            var secondNumber = mSecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var answer = firstNumber.toDouble() / secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = answer.toString()
            }
        }
        mMul.setOnClickListener {
            // Receive the first and second number to compute
            var firstNumber = mFirstNum.text.toString().trim()
            var secondNumber = mSecondNum.text.toString().trim()
            if (firstNumber.isEmpty() || secondNumber.isEmpty()){
                mAnswer.text = "Please enter valid numbers!!!"
            }else{
                // Proceed to compute the numbers
                var answer = firstNumber.toDouble() * secondNumber.toDouble()
                // Display the answer on the textView answer
                mAnswer.text = answer.toString()
            }
        }
    }
}