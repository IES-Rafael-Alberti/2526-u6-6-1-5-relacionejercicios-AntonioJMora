package es.ies.ejercicios.u6.ej61

import es.ies.ejercicios.u6.ej61.especializacion.Vehiculo
import es.ies.ejercicios.u6.ej61.especializacion.Coche
import es.ies.ejercicios.u6.ej61.especializacion.Moto
import es.ies.ejercicios.u6.ej61.extension.Administrador
import es.ies.ejercicios.u6.ej61.extension.Invitado
import es.ies.ejercicios.u6.ej61.extension.Usuario

fun main(){
    //Especializacion
    val yamaha = Moto("Yamaha", "MT-07", 210, 689)
    val kia = Coche("Kia", "Sportage", 200, 4)

    val vehiculos = listOf<Vehiculo>(yamaha,kia)

    for (v in vehiculos){
        println(v.describir())
        println(v.arrancar())
    }

    println(yamaha.hacerCaballito())
    println(kia.abrirMaletero())

    println("-----------------------------")

    //Extension
    val admin = Administrador("Carlos")
    val invitado = Invitado("Ana")

    val usuarios = listOf<Usuario>(admin,invitado)

    for (u in usuarios){
        u.accederSistema()
    }

    admin.gestionarUsuarios()
    invitado.verContenido()
}