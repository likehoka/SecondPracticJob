package com.example.secondpracticjob

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ResultScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_screen)
        val mResultTe = findViewById<EditText>(R.id.returnResultEt)
        val mButtonReturnMain = findViewById<Button>(R.id.returnResultBn)

        mButtonReturnMain.setOnClickListener{
            val intentResult = Intent(this, MainActivity::class.java)
            intentResult.putExtra("intentResult", mResultTe.text.toString())
            setResult(Activity.RESULT_OK, intentResult)
            finish()
        }
    }
}
