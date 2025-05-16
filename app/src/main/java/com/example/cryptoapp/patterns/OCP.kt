package com.example.cryptoapp.patterns

// abierto- cerrado
interface Figura {
    fun calcularArea(): Double
}

// Implementaciones
class Circulo(val radio: Double) : Figura {
    override fun calcularArea() = Math.PI * radio * radio
}

class Rectangulo(val ancho: Double, val alto: Double) : Figura {
    override fun calcularArea() = ancho * alto
}

// Clase que usa la interfaz
fun mostrarArea(figura: Figura) {
    println("El área es: ${figura.calcularArea()}")
}



fun main() {
    val circulo = Circulo(3.0)
    val rectangulo = Rectangulo(4.0, 5.0)

    mostrarArea(circulo)
    mostrarArea(rectangulo)
}


