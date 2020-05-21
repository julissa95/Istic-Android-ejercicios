package com.example.primerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contador.*

class Contador : AppCompatActivity() {

    var numUsuario: Double =0.0;
    var numRandom: Double = (Math.random()*100);
    var chance:Int=3;
    var score:Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)


        btnReIniciar.setOnClickListener {
            start(chance,numUsuario, numRandom, score);
        }

        btnScore.setOnClickListener {
            score
        }
        btnIntento.setOnClickListener {
            chance
        }
        Adivinar.setOnClickListener{
            if(chance==0)Adivinar.isEnabled = false
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
