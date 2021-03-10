package com.example.pruebatecnica.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import com.example.pruebatecnica.R
import com.example.pruebatecnica.service.DataSource
import kotlinx.android.synthetic.main.activity_second_page.*

class secondPage : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,DataSource.ciudades)
        listaCiudades.adapter = adapter

        buttonAgregar.setOnClickListener {
            DataSource.ciudades.add(textAgregarCiudad.text.toString())
        }

    }



}