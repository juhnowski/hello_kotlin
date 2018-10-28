package com.juhnowski.ilya.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var button: Button?= null
    private var imageView: ImageView ?= null
    private var flag: Boolean = true



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        imageView =  findViewById<ImageView>(R.id.imageView)
        button?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                val id_1 = resources.getDrawable(R.drawable.ball_100x100)
                val id_2 = resources.getDrawable(R.drawable.ball_640x480)
                imageView?.setImageDrawable(if(flag) id_1 else id_2)
                flag = !flag
            }
        })
    }
}
