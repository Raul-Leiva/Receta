package com.fsg.receta.Models

class DataItem {
    var nombreReceta = ""
    var duracionReceta =  ""
    var ingredientes = ""
    var texto = ""
    constructor(nombreReceta: String, duracionReceta: String, ingredientes: String, texto:String){
        this.nombreReceta = nombreReceta
        this.duracionReceta = duracionReceta
        this.texto = texto
        this.ingredientes = ingredientes
    }
}