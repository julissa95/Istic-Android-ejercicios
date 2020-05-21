package com.example.primerparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quien_soy.*

class QuienSoy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quien_soy)

        BtnIr3.setOnClickListener {
            val intent: Intent = Intent(this, Contador::class.java)
            startActivity(intent)
            finish()
        }


        }
}
