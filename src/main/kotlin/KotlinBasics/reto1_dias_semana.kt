package KotlinBasics

fun main(){

    do {
      println("¿Cuantos dias tiene la semana?")
      println("a. 10")
      println("b. 5")
      println("c. 7")
      println("Ingresa tu respuesta:")
        val res = readln()

    }while (res != "c")

    println("Felicidades")


    for (letra in 65..90)
        println(letra.toChar())
}