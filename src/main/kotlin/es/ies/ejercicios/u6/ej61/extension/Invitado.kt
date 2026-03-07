package es.ies.ejercicios.u6.ej61.extension

class Invitado(nombre: String) : Usuario(nombre) {

    fun verContenido() {
        println("$nombre está viendo contenido")
    }

}