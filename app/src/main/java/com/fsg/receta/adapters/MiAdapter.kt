package com.fsg.receta.adapters

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.fsg.receta.Models.DataItem
import com.fsg.receta.R

class MiAdapter(private val activity: Activity, private val listaElementos: ArrayList<DataItem>): BaseAdapter() {

    class  ViewHolder{
        lateinit var textViewNombre : TextView
        lateinit var textViewDuracion : TextView
    }

    override fun getCount(): Int {
        return listaElementos.size
    }

    override fun getItem(p0: Int): Any {
        return listaElementos[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(indice: Int, view: View?, p2: ViewGroup?): View {
        var filaView = view
        var viewHolder = ViewHolder()

        if (filaView == null){
            var inflater = activity.layoutInflater
            filaView = inflater.inflate(R.layout.elemento_layout, null, true)

            viewHolder.textViewNombre = filaView.findViewById<TextView>(R.id.textViewNombreLista)
            viewHolder.textViewDuracion = filaView.findViewById<TextView>(R.id.textViewDuracionLista)

            filaView.tag = viewHolder
        }
        else{
            viewHolder = filaView.tag as MiAdapter.ViewHolder
        }
        viewHolder.textViewNombre.text = listaElementos[indice].nombreReceta
        viewHolder.textViewDuracion.text = listaElementos[indice].duracionReceta

        return filaView!!
    }

}