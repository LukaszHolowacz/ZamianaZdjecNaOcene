package com.example.zamianazdjecnaocene

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.text.toFloat as toFloat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val zdjecie = findViewById<ImageView>(R.id.zdj)

        val next = findViewById<Button>(R.id.next)
        val prev = findViewById<Button>(R.id.prev)

        val vis1 = findViewById<CheckBox>(R.id.vis1)
        val vis2 = findViewById<CheckBox>(R.id.vis2)

        val wartosc_przezroczystosci = findViewById<EditText>(R.id.wartosc)

        val obraz_text = findViewById<TextView>(R.id.obraz_text)

        var i = 1

        obraz_text.setVisibility(View.INVISIBLE)

        vis1.setOnClickListener {
            if (zdjecie.getVisibility() == View.VISIBLE) {
                zdjecie.setVisibility(View.INVISIBLE)
                when(i){
                    1 -> {
                        obraz_text.setVisibility(View.VISIBLE)
                        obraz_text.text = "Kaczka"
                    }
                    2 -> {
                        obraz_text.setVisibility(View.VISIBLE)
                        obraz_text.text = "Kot"
                    }
                    3 -> {
                        obraz_text.setVisibility(View.VISIBLE)
                        obraz_text.text = "Krokodyl"
                    }
                    4 -> {
                        obraz_text.setVisibility(View.VISIBLE)
                        obraz_text.text = "Pies"
                    }
                    5 -> {
                        obraz_text.setVisibility(View.VISIBLE)
                        obraz_text.text = "Słoń"
                    }
                    6 -> {
                        obraz_text.setVisibility(View.VISIBLE)
                        obraz_text.text = "Świnka"
                    }
                    else -> {
                        obraz_text.setVisibility(View.VISIBLE)
                        obraz_text.text = "Nie wiem jak!"
                    }
                }
            } else {
                zdjecie.setVisibility(View.VISIBLE)
                obraz_text.setVisibility(View.INVISIBLE)
            }
        }
        next.setOnClickListener {
            i++
            when(i){
                1 -> {
                    zdjecie.setImageResource(R.drawable.kaczka)
                    obraz_text.text = "Kaczka"
                }
                2 -> {
                    zdjecie.setImageResource(R.drawable.kot)
                    obraz_text.text = "Kot"
                }
                3 -> {
                    zdjecie.setImageResource(R.drawable.krokodyl)
                    obraz_text.text = "Krokodyl"
                }
                4 -> {
                    zdjecie.setImageResource(R.drawable.pies)
                    obraz_text.text = "Pies"
                }
                5 -> {
                    zdjecie.setImageResource(R.drawable.slon)
                    obraz_text.text = "Słoń"
                }
                6 -> {
                    zdjecie.setImageResource(R.drawable.swinka)
                    obraz_text.text = "Świnka"
                }
                else -> {
                    i=1
                    zdjecie.setImageResource(R.drawable.kaczka)
                    obraz_text.text = "Kaczka"
                }
            }
        }
        prev.setOnClickListener {
            i--
            when(i){
                1 -> {
                    zdjecie.setImageResource(R.drawable.kaczka)
                    obraz_text.text = "Kaczka"
                }
                2 -> {
                    zdjecie.setImageResource(R.drawable.kot)
                    obraz_text.text = "Kot"
                }
                3 -> {
                    zdjecie.setImageResource(R.drawable.krokodyl)
                    obraz_text.text = "Krokodyl"
                }
                4 -> {
                    zdjecie.setImageResource(R.drawable.pies)
                    obraz_text.text = "Pies"
                }
                5 -> {
                    zdjecie.setImageResource(R.drawable.slon)
                    obraz_text.text = "Słoń"
                }
                6 -> {
                    zdjecie.setImageResource(R.drawable.swinka)
                    obraz_text.text = "Świnka"
                }
                else -> {
                    i=6
                    zdjecie.setImageResource(R.drawable.swinka)
                    obraz_text.text = "Świnka"
                }
            }
        }
        vis2.setOnClickListener {
            if(wartosc_przezroczystosci.text.isEmpty()){
                Toast.makeText(applicationContext, "Musisz podać wartość!", Toast.LENGTH_SHORT).show()
            }
            else{
                if(wartosc_przezroczystosci.text.toString().toInt() < 0 || wartosc_przezroczystosci.text.toString().toInt() > 255){
                    Toast.makeText(applicationContext, "Podaj wartość od 0 do 255!", Toast.LENGTH_SHORT).show()
                }
                else{
                    zdjecie.alpha = wartosc_przezroczystosci.text.toString().toFloat()/255f
                }
            }
        }
    }
}