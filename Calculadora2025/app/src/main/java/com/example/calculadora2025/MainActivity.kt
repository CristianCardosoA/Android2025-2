package com.example.calculadora2025

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculadora2025.databinding.ActivityMainBinding

class MainActivityBinding : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }  //Fin ViewCompat

        var resultado = 0.0 // creo una nueva variable quie se llama resultado y le asigno el valor de entrada 0.0
        //Creao cuatro banderas para las operaciones principales. La idea es que cuando un usuario elija una operación, la bandera de dicha operación se prenda
        var suma = false //Creo la bamdera para la suma y la inicializo como false
        var resta = false
        var multiplicacion = false
        var division = false

        R.id.cero_button

    }   //Fin función OnCreate()
}  //Fin Clase MainActivity

//Esto es un comentario
/* comentario multilinea 1
comentario multilinea 2
comentario multilinea 3
comentario multilinea 4
 */