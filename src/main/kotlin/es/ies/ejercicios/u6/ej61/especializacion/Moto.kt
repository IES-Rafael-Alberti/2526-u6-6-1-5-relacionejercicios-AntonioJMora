package es.ies.ejercicios.u6.ej61.especializacion

class Moto (marca: String, modelo: String, velocidadMax: Int, val cilindrada: Int): Vehiculo(marca, modelo, velocidadMax) {
    override fun describir(): String {
        return "Moto: $marca $modelo, con una velocidad máxima de $velocidadMax y una cilindrada de $cilindrada"
    }
    override fun arrancar(): String {
        return "$marca $modelo está arrancando"
    }
    fun hacerCaballito():String{
        return "La moto $marca $modelo ha hecho un caballito"
    }

}