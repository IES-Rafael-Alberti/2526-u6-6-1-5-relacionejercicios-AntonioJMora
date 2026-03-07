package es.ies.ejercicios.u6.ej61.especializacion

abstract class Vehiculo(val marca: String, val modelo: String, val velocidadMax: Int) {
    abstract fun describir(): String

    abstract fun arrancar(): String
}