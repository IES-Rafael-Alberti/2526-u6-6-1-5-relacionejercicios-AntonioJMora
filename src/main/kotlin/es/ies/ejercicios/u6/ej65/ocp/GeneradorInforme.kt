package es.ies.ejercicios.u6.ej65.ocp

import es.ies.ejercicios.u6.ej64.*


interface GeneradorInforme {
    fun generar(titulo: String, items: List<Resumible>) : String
}