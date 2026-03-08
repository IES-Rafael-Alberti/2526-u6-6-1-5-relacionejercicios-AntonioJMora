package es.ies.ejercicios.u6.ej65.srp

import es.ies.ejercicios.u6.ej64.*

class PreparadorDatos {
    fun obtenerItems(): List<Resumible>{
        return listOf(
            Persona(" Ana ", 20),
            Alumno("Luis", 19, "1DAM"),
            Persona("Marta", 18)
        )
    }
}