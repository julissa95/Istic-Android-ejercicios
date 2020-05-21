package com.example.primer_parcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contador.*

class Contador : AppCompatActivity() {

    var numUsuario: Double =0.0;
    var numRandom: Double = (Math.random()*100);
    var chance:Int=3;
    var score:Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)/*
        val scoreText : TextView = findViewById(R.id.score) as TextView
        scoreText.setText(this.score)

        val intentos : TextView = findViewById(R.id.intentos) as TextView
        intentos.setText(this.contraintContador.toString())

        val textView: TextView = findViewById(R.id.numUsuarioId) as TextView;

        textView.setOnClickListener {
            textView.text = getString(R.string.numUsuario)
        }
        this.numUsuario = textView.text.toString().toDouble();*/


        buttonStartId.setOnClickListener {
            start(chance,numUsuario, numRandom, score);
        }
        btnReiniciar.setOnClickListener {
            start(chance,numUsuario, numRandom, score);
        }

        buttonAdivinar.setOnClickListener {
            if(chance==0)buttonAdivinar.isEnabled = false
            adivinar();
        }
    }
    fun start(chance:Int,numUsuario:Double,numRandom:Double, score:Int) {
        this.score = 0;
        this.numUsuario = 0.0;
        this.numRandom = (Math.random() * 100);
        this.chance = 3;
    }

    fun adivinar(){
        this.numRandom== (Math.random()*100);
        if (this.numUsuario == this.numRandom)
        {
            Toast.makeText( this, "Ganaste", Toast.LENGTH_LONG).show()
            this.score += 1
        }
        else
        {
            Toast.makeText( this, "Perdiste", Toast.LENGTH_LONG).show()
            this.chance = chance - 1
        }
    }
}
