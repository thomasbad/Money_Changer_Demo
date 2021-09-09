package com.mkaa.moneychangerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val extras = intent.extras ?: return
        val resultTV = findViewById<TextView>(R.id.resultTV)
        val amount = extras.getDouble("amount")
        val exchangeamount = amount*0.8
        resultTV.text = "HKD$${amount} = CNY${exchangeamount}"
    }
}