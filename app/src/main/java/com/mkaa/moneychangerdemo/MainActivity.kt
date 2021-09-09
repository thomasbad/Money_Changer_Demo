package com.mkaa.moneychangerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun change(v:View){
        val amountET = findViewById<EditText>(R.id.amountET)
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("amount", amountET.text.toString().toDouble())
        startActivity(intent)
    }
}