package es.ies.ejercicios.u6.ej65.srp

import es.ies.ejercicios.u6.ej64.*

class ServicioRegistro {
    private val registro = RegistroPersonas()

    fun registrar(items: List<Resumible>){
        for (item in items){
            if (item is Persona){
                registro.registrar(item)
            }
        }
    }

    fun buscar(nombre: String): Persona? {
        return registro.buscar(nombre)
    }
}