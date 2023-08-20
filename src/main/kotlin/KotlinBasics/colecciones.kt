package KotlinBasics

fun main(){
    var miArreglo:Array<Int> = arrayOf(1,2,3,4)

    miArreglo.forEach {
        println(it)
    }

   //miArreglo.set(4,55)

    var miArregloConTamanio = arrayOfNulls<Int>(10)

    miArregloConTamanio.forEach {
        println(it)
    }

    var miArrayWithSize = Array(5,{ 1 })
    miArrayWithSize.forEach {
        println(it)
    }

    var miArregloGeneric:Any = arrayOf(1,2,"Gato")

}