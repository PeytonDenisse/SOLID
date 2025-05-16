package com.example.cryptoapp.patterns

import android.media.MediaDrm.LogMessage

// contruir una clase con sus subclases para funciones

data class Procesador ( val marca : String)

data class MotherBoard ( val marca : String)

data class Storage(val gb: Double)

class SSD(val gb : Double ):IStorage
class HDD(val gb : Double) :IStorage


interface IStorage {

}

class Computer (val procesador: Procesador, val mb : MotherBoard, val storage: IStorage){
    fun enceder (){
        println("Encendiendo")
    }
}
// Danger Hilt
fun main(){
    val computer= Computer (
        procesador = Procesador(marca = "Intel"),
        mb = MotherBoard(marca = "Asus"),
        storage = SSD(gb = 50.0)
    )



    // Clase Car

    val car = Car (
        motor = MotorElectrico(hp = 100.0),
        puertas = 4
    )
}
// D Principios SOLID
// principio de Inversion de Dependencias
// tu debes de depender de abstraccion y no de contruccion
// Inyeccion de dependencias
// clase car (motorr)

class Motor(val hp : Double ) :IMotor
class MotorElectrico(val hp : Double ) :IMotor
class MotorHibrido(val hp : Double ) :IMotor

interface IMotor {

}

class Car(val motor : IMotor, val puertas : Int )



