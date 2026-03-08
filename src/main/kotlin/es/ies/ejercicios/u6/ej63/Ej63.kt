package es.ies.ejercicios.u6.ej63

fun main() {
    println("Rectangulo con constructor primario")
    val r1 = Rectangulo("rojo", "mi-rectangulo", 10, 20)
    println("--------------")
    println()

    println("Rectangulo con constructor secundario (ancho, alto)")
    val r2 = Rectangulo(5, 15)
    println("--------------")
    println()

    println("Rectangulo como cuadrado")
    val r3 = Rectangulo(7)
    println("--------------")
    println()

    println("Circulo con constructor primario")
    val c1 = Circulo("azul", "mi-circulo", 12)
    println("--------------")
    println()

    println("Circulo con constructor secundario (radio)")
    val c2 = Circulo(8)
    println("--------------")
    println()

    println("Triangulo con constructor secundario (base, altura)")
    val t1 = Triangulo(3, 6)
    println("--------------")
    println()

    println("Triangulo como equilatero")
    val t2 = Triangulo(4)
}
