package es.ies.ejercicios.u6.ej65.ocp

import es.ies.ejercicios.u6.ej64.*

fun main(){
    val items = listOf<Resumible>(
        Persona("Ana", 20),
        Persona("Luis", 19),
        Alumno("Carlos", 21, "1DAM")
    )

    val generador: GeneradorInforme = GeneradorMarkdown()

    val resultado = generador.generar("OCP V1", items)

    println(resultado)
}