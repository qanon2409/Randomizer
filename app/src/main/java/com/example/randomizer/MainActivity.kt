package com.example.randomizer

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlin.random.Random


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagen=findViewById<ImageView>(R.id.imageView)
        val boton= findViewById<Button>(R.id.button)
        val texto=findViewById<TextView>(R.id.textView)
        val btnSi=findViewById<Button>(R.id.buttonSi)
        val btnNo=findViewById<Button>(R.id.buttonNo)

        var a=0


        val listaImagenes= listOf(
            R.drawable.alea_1,
            R.drawable.alea_2,
            R.drawable.alea_3,
            R.drawable.alea_4,
            R.drawable.alea_5,
            R.drawable.alea_6,

        )

        boton.setOnClickListener {
            val r=Random.nextInt(0,6)
            imagen.setImageResource(listaImagenes[r])

            a++

            if(a==1)
            {
                texto.isVisible=true
                btnSi.isVisible=true
                btnNo.isVisible=true

            }

            btnSi.setOnClickListener {
                val intent=Intent(this,CoinFlip::class.java)
                startActivity(intent)
            }

            btnNo.setOnClickListener {
                texto.isVisible=false
                btnSi.isVisible=false
                btnNo.isVisible=false
            }


        }








    }
}