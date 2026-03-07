package es.ies.ejercicios.u6.ej61.especializacion

class Coche(marca: String, modelo: String, velocidadMax: Int, val numPuertas: Int): Vehiculo(marca, modelo, velocidadMax) {
    override fun describir(): String {
        return "Coche: $marca $modelo, con una velocidad máxima de $velocidadMax y $numPuertas puertas"
    }
    override fun arrancar(): String {
        return "$marca $modelo está arrancando"
    }

    fun abrirMaletero(): String {
        return "Se ha abierto el maletero del coche $marca $modelo"
    }
}