package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      // variablesYConstantes()

      // tiposDeDatos()

      // sentenciaIf()

      // sentenciaWhen()

      //maps()

        //arrays()

        //loops()

       // clases()

        //funciones()

        nullSafety()



    }

    private fun variablesYConstantes(){

        //Variables

        var myFirstVariable = "Esta es una prueba"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Prueba 2"

        var mySecondVariable : String = myFirstVariable

        println(mySecondVariable)

        //Constantes

        val myFirtConstant = "prueba constante"

        println(myFirtConstant)

    }

    private fun tiposDeDatos(){
        // String enteros decimales booleano

        //String

        val myString = "Prueba String"
        val myString2 = "sumar pruebas"
        val myString3 =  myString + "   " + myString2

        println(myString3)

        //Enteros   Byte -127 +128,  Short -32768 +32767, Int, Long

        val myInt = 100
        val myInt2 = 200
        val myInt3 = myInt+myInt2
        println (myInt3)

        // Decimales Float 32 bits doublef hasta 64 bits

        val myDouble =100.5
        val myFloat = 1.5f
        val myDouble2 =200.5
        val myDouble3 = 10
        val myDouble4 = myDouble + myDouble2 + myDouble3

        println(myDouble4)

        // Boolean (bool)

        val myBool = true
        val MyBool2 = false


    }

    private fun sentenciaIf(){

        var myFirstVariable = "Esta es una prueba"
        var myFirstNumber = 53

        if (myFirstNumber <= 10 && myFirstNumber >5 || myFirstNumber ==53){

            println("$myFirstNumber es menor o igual que 10 o igual a 53 ")
        }else {
            println("$myFirstNumber es mayor que 10 y no es igual a 53")
        }

    // Operador condicional < > <= >=  == igualdad != desigualdad



    }

    private fun sentenciaWhen(){

        val country = "mexico"

        when (country){
            "Guatemala" ->{

                println("El idioma es Español")
            } "Nicaragua" -> {

            println("El idioma es Español")

        }"USA" -> {
            println("El idioma es Ingles")
        }else ->{
            println("no conocemos el idioma")
        }
        }

    }

    private fun maps(){

        var myMap : Map<String, Int> = mapOf()
        println (myMap)

        //Agregar dato

        myMap = mutableMapOf()

        println(myMap)

        myMap["cuatro"] = 4
        myMap.put("cinco", 5)

        println(myMap)

        //myMap.put("cinco", 5)

        //println

        // Acceder a los datos

        println(myMap["cinco"])

        // eliminar datos

        myMap.remove("cinco")
        println(myMap)

    }

    fun arrays(){

        val name = "David"
        val apellido = "ortiz"
        val universidad = "Del Valle de Guatemala"
        val ciudad = "Guatemala"

        // crear array

        val myArray:ArrayList<String> = arrayListOf()

        // agregar datos

        myArray.add(name)
        myArray.add(apellido)
        myArray.add(universidad)
        myArray.add(ciudad)

        println(myArray)

        // agregar un conjunto de datos

        myArray.addAll(listOf("prueba UVG", "uso array kotlin"))

        println(myArray)

        // acceso a datos

        val myCompany:String = myArray[2]
        println(myCompany)

        //modificar datos array

        myArray[2] = "solo UVG"
        println(myArray)

        //Eliminar datos

        myArray.removeAt(2)
        println(myArray)

        //Recorrer datos

        myArray.forEach{
            println(it)
        }

        //otras operaciones

        myArray.count()
        myArray.clear()
        myArray.first()
        myArray.last()
        myArray.sort()


    }

    private fun loops(){
        //bucles

        val myArray = listOf("David", "Ortiz", "UVG", "Guatemala")
        val myMap = mutableMapOf<String, Int>("uno" to 1, "Dos" to 2, "tres" to 3)

        // for

        for (myString:String in myArray){
            println(myString)
        }

        for (myElement:MutableMap.MutableEntry<String, Int> in myMap){

            println("${myElement.key}-${myElement.value}")
        }

        for (x:Int in 0..10){
            println(x)
        }

        //Step / Downto

        for (x:Int in 0 until 10 step 2){
            println(x)
        }

        for (x:Int in 10 downTo 0 step 3){
            println(x)
        }

        //Intrange

        val myNumericArray : IntRange =( 0..20)

        for (myNum: Int in myNumericArray){

            println(myNum)
        }

        //while

        var x=1

        while (x < 10){
            println(x)
            x+=2
        }

    }

    fun clases(){

        val pedro = Programador (name = "Pedro", age =25, arrayOf("kotlin", "java", "swift"))

        println(pedro.name)

        pedro.age = 30

        println(pedro.age)

        pedro.code()

        val Luis = Programador(name = "luis", age =30, arrayOf("java"))

        Luis.code()
    }

    fun funciones() {

        //funciones simples
        sayHello()
        sayMyNameAndDeuda(name = "David", deuda = 2000)
        println(sumTwoNumbers(15,10))

        println(sumTwoNumbers(5,sumTwoNumbers(5,5)))
    }

        fun sayHello(){

            println("hola")
        }

        //funciones con varios parametros de entrada

        fun sayMyNameAndDeuda(name:String, deuda:Int){
            println("hola, mi nombre es $name y mi deuda es $deuda")

        }

        fun sumTwoNumbers(fNumber : Int, sNumber :Int) : Int{

            val sum:Int = fNumber + sNumber
            return sum
        }

    fun nullSafety(){

        var myString = "UVG"

       // myString = null

        println(myString)

        //gestion de nuloos

        //variable null safety

        var mySafetyString: String?
        mySafetyString = null

        println(mySafetyString)

        //Safe call

        println(mySafetyString?.length)
        mySafetyString?.let {

            println()
                  }?: run{
                      println(mySafetyString)
        }


    }

}


