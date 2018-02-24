package com.example.logonrm.imc2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val peso = intent?.getStringExtra("PESO")?.toDouble()
        val altura = intent?.getStringExtra("ALTURA")?.toDouble()

        val imc = peso?.div(altura!!.times(altura))

        tvIMC.setText("%.2f".format(imc).toString())
    }
}
