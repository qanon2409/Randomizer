package com.example.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class CoinFlip : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_flip)

        var imagen1=findViewById<ImageView>(R.id.imageView2)
        var boton1= findViewById<Button>(R.id.button2)


        var listaImagenes1= listOf(
            R.drawable.face,
            R.drawable.cross

            )

        boton1.setOnClickListener {
            var r= Random.nextInt(0,2)
            imagen1.setImageResource(listaImagenes1[r])


        }
    }
}