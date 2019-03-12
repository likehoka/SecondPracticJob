package com.example.secondpracticjob

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class NextScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next_screen)

        val intent = intent
        val result = intent.getStringExtra("Result")
        val mNextScreenEt = findViewById<TextView>(R.id.textResultScreen)
        mNextScreenEt.text = "" + result

        val mButton = findViewById<Button>(R.id.returnMainActivityBn)
        mButton.setOnClickListener{
            finish()
        }

    }
}
