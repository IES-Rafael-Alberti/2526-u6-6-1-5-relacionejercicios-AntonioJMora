package es.ies.ejercicios.u6.ej61.extension

class Administrador(nombre: String) : Usuario(nombre) {

    fun gestionarUsuarios() {
        println("$nombre está gestionando usuarios")
    }

}