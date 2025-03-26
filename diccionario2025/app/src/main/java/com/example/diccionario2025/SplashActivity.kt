package com.example.diccionario2025

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.splash)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        object : Thread() {
            override fun run(){
                super.run()
                sleep(3000)

                val miDedoSimulandoUnIntent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(Intent(miDedoSimulandoUnIntent))
                //Pasar parámetros a otra activity si es necesario:
                miDedoSimulandoUnIntent.putExtra("nombreParametro1", 20)
                miDedoSimulandoUnIntent.putExtra("nombreUsuario", "Juanito")
                miDedoSimulandoUnIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                finish()

            }
        }.start()

    }
}