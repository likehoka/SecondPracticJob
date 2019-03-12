package com.example.secondpracticjob

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mResultScreenEt = findViewById<EditText>(R.id.editTextNextScreen)


        val mButtonResultScreen = findViewById<Button>(R.id.buttonResultScreen)
        mButtonResultScreen.setOnClickListener {
            val intentResultScreenActivity = Intent(this, ResultScreen::class.java)
            startActivityForResult(intentResultScreenActivity, 1)
        }

        val mButtonNextScreen = findViewById<Button>(R.id.buttonNextScreen)
        mButtonNextScreen.setOnClickListener {
            val resultEt = mResultScreenEt.text.toString()
            val intentNextScreen = Intent(this, NextScreen::class.java)
            intentNextScreen.putExtra("Result", resultEt)
            Log.d("mLog", "Result = " + resultEt)
            startActivity(intentNextScreen)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val mResultTv = findViewById<TextView>(R.id.resultTv)
        Log.v("mLog", "" + data?.getStringExtra("intentResult"))
        val ResultText = data?.getStringExtra("intentResult")
        mResultTv.setText(ResultText)


    }
}
