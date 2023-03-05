package com.nbmas.numbblockmoveandsolve

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nambBlOne = findViewById<ImageView>(R.id.imageViewOne)
        val nambBlTwo = findViewById<ImageView>(R.id.imageViewTwo)
        val nambBlThree = findViewById<ImageView>(R.id.imageViewThree)
        val nambBlFour = findViewById<ImageView>(R.id.imageViewFour)
        val nambBlFive = findViewById<ImageView>(R.id.imageViewFive)
        val textViewNumbBl = findViewById<TextView>(R.id.textViewNumbBl)
        textViewNumbBl.text = "1"
        nambBlOne.setOnClickListener {
            if (textViewNumbBl.text == "1"){
                nambBlOne.animate().apply {
                    duration = 915
                    rotationBy(360f)
                    rotationX(359f)
                }.start()
            textViewNumbBl.text = (1..5).random().toString()}
        }
        nambBlTwo.setOnClickListener {
            if (textViewNumbBl.text == "2"){
                nambBlTwo.animate().apply {
                    duration = 915
                    rotationBy(360f)
                    rotationX(359f)
                }.start()
            textViewNumbBl.text = (1..5).random().toString()}
        }
        nambBlThree.setOnClickListener {
            if (textViewNumbBl.text == "3"){
                nambBlThree.animate().apply {
                    duration = 915
                    rotationBy(360f)
                    rotationX(359f)
                }.start()
            textViewNumbBl.text = (1..5).random().toString()}
        }
        nambBlFour.setOnClickListener {
            if (textViewNumbBl.text == "4"){
                nambBlFour.animate().apply {
                    duration = 915
                    rotationBy(360f)
                    rotationX(359f)
                }.start()
            textViewNumbBl.text = (1..5).random().toString()}
        }
        nambBlFive.setOnClickListener {
            if (textViewNumbBl.text == "5"){
                nambBlFive.animate().apply {
                    duration = 915
                    rotationBy(360f)
                    rotationX(359f)
                }.start()
            textViewNumbBl.text = (1..5).random().toString()}
        }
    }
}