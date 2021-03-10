package com.example.pruebatecnica.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebatecnica.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNextt.setOnClickListener {
            val secondPageIntent = Intent(this, secondPage::class.java)
            startActivity(secondPageIntent)
        }
    }


}