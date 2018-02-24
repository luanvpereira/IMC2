package com.example.logonrm.imc2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        btLimpar.setOnClickListener {
            inputAltura.editText?.setText("")
            inputPeso.editText?.setText("")
            inputPeso.editText?.requestFocus()
        }

        btCalcular.setOnClickListener {
            val viewResult = Intent(this, ResultActivity::class.java)

            viewResult.putExtra("PESO",
                    inputPeso.editText?.text.toString()
            )

            viewResult.putExtra("ALTURA",
                    inputAltura.editText?.text.toString()
            )

            startActivity(viewResult)
        }
    }
}
