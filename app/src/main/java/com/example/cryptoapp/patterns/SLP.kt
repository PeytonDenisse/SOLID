package com.example.cryptoapp.patterns



// Clase prinvipal
open class Ave {
    open fun volar() {
        println("Estoy volando")
    }
}

// Subclases que si puedo usar
class Aguila : Ave()
class Paloma : Ave()

// Función que acepta cualquier Ave
fun hacerVolar(ave: Ave) {
    ave.volar()
}

fun main() {
    val aguila = Aguila()
    val paloma = Paloma()

    hacerVolar(aguila)  // si aplica
    hacerVolar(paloma)  // si aplica

    //  pinguino no aplica
    val pinguino = Pinguino()
    hacerVolar(pinguino)  // Esto da un error
}

// Subclase que dan un error en  LSP
class Pinguino : Ave() {
    override fun volar() {
        throw UnsupportedOperationException("¡Los pingüinos no vuelan!")
    }
}