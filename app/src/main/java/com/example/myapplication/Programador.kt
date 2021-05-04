package com.example.myapplication

class Programador (val name:String, var age: Int, val lenguajes : Array<String>){

    fun code(){

        for (lenguaje : String in lenguajes)

            println("$name Esta programando en $lenguaje")
    }
}