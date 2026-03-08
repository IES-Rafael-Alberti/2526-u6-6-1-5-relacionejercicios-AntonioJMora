package es.ies.ejercicios.u6.ej65.srp

fun main(){
    val preparador = PreparadorDatos()
    val items = preparador.obtenerItems()

    val registro = ServicioRegistro()
    registro.registrar(items)

    val generador = ServicioInforme()
    val salida = generador.generar(items)

    println(salida)

    println("Buscar Ana -> ${registro.buscar("ana")?.resumen()}")
}