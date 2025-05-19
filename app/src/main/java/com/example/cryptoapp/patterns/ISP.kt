package com.example.cryptoapp.patterns

// Separar en interfaces pequeñas
interface Imprimible {
    fun imprimir()
}

interface Escaneable {
    fun escanear()
}

interface Faxable {
    fun enviarFax()
}

// Clase que solo imprime
class ImpresoraBasica : Imprimible {
    override fun imprimir() {
        println(" Imprimiendo documento...")
    }
}

// Clase que imprime y escanea
class MultifuncionalAvanzada : Imprimible, Escaneable, Faxable {
    override fun imprimir() {
        println(" Imprimiendo documento...")
    }

    override fun escanear() {
        println("Escaneando documento...")
    }

    override fun enviarFax() {
        println("Enviando fax...")
    }
}


fun main() {
    val basica = ImpresoraBasica()
    basica.imprimir()

    val avanzada = MultifuncionalAvanzada()
    avanzada.imprimir()
    avanzada.escanear()
    avanzada.enviarFax()
}
