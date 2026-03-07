package es.ies.ejercicios.u6.ej61.extension

open class Usuario(val nombre: String) {

    fun accederSistema() {
        println("$nombre ha accedido al sistema")
    }

}