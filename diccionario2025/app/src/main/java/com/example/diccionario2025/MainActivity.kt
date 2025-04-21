package com.example.diccionario2025

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.diccionario2025.databinding.ActivityMainBinding
import com.example.diccionario2025.databinding.ContenedorMainBinding

class MainActivity : AppCompatActivity() {

    protected val mainActivity = this

    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var contenedorMainBinding: ContenedorMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        contenedorMainBinding = ContenedorMainBinding.inflate(layoutInflater)

        val view = activityMainBinding.root
        setContentView(view)

        enableEdgeToEdge()


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //iniciar appPreferences
        AppPreferences.init(mainActivity)

        var miBuscadorTop = mainActivity.findViewById<SearchView>(R.id.activity_main_searchview)
        miBuscadorTop.setOnClickListener(){
            miBuscadorTop.setQuery("", false)
        }
    }
}