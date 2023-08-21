package com.fsg.receta

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.fsg.receta.Models.DataItem

class recetaCompleta : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receta_completa)

        elementos()
    }

    fun elementos(){
        var textViewNombre = findViewById<TextView>(R.id.textViewNombre)
        var textViewDuracion = findViewById<TextView>(R.id.textViewDuracion)
        var textViewIngredientes = findViewById<TextView>(R.id.textViewIngredientes)
        var textViewTexto = findViewById<TextView>(R.id.textViewTexto)

        val nombre = intent.getStringExtra("nombre")
        val duracion = intent.getStringExtra("duracion")
        val ingredientes = intent.getStringExtra("ingredientes")
        val texto = intent.getStringExtra("texto")

        textViewNombre.text = nombre
        textViewDuracion.text = duracion
        textViewIngredientes.text = ingredientes
        textViewTexto.text = texto
    }

}