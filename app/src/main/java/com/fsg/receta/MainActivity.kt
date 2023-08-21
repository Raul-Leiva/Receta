package com.fsg.receta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import com.fsg.receta.Models.DataItem
import com.fsg.receta.adapters.MiAdapter

class MainActivity : AppCompatActivity() {

    var listaElementos:ArrayList<DataItem> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val receta = Intent(this, recetaCompleta::class.java)
        var listViewInicial: ListView = findViewById(R.id.listViewInicial)

        listaElementos = crearListaElementos()

        var miAdaptador: MiAdapter = MiAdapter(this, crearListaElementos())

        listViewInicial.adapter= miAdaptador

        listViewInicial.onItemClickListener = object: AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, posicion: Int, identificador: Long) {
                var nombre = listaElementos[posicion].nombreReceta
                var duracion = listaElementos[posicion].duracionReceta
                var ingredientes = listaElementos[posicion].ingredientes
                var texto = listaElementos[posicion].texto

                receta.putExtra("nombre", nombre)
                receta.putExtra("duracion", duracion)
                receta.putExtra("ingredientes", ingredientes)
                receta.putExtra("texto", texto)
                startActivity(receta)
            }
        }
    }

    fun crearListaElementos(): ArrayList<DataItem> {
        var listaElementos = ArrayList<DataItem>()
        for (i in 0..30) {
            listaElementos.add(DataItem("Receta$i", "Horas: $i", "ingredientes: ", "Descripción: "))
        }
            return listaElementos
    }
}
