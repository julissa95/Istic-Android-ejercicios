package com.example.primerparcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.view.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quien_soy.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            BtnIr.setOnClickListener {
                val intentUno: Intent = Intent(this, login::class.java)
                startActivity(intentUno)
                finish()

                        BtnAtrasLogin.setOnClickListener {
                            BtnAtrasLogin
                            finish()
                        }


                    }
                }
            }
        }
    }

