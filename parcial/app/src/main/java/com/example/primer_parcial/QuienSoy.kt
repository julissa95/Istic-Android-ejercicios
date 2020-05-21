package com.example.primer_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_quien_soy.*

class QuienSoy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quien_soy)

        btnContador.setOnClickListener({
            val intentUno: Intent = Intent(this, Contador::class.java)
            startActivity(intentUno)
            finish()
        })
    }
}
