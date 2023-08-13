package KotlinBasics

fun main(){
    var diaDeSemana:String = "Lunes";

    when(diaDeSemana){
        "Lunes" -> println("Hoy es ${diaDeSemana}")
        "Martes" -> println("Hoy es ${diaDeSemana}")
        "Miercoles" -> println("Hoy es ${diaDeSemana}")
        "Jueves" -> println("Hoy es ${diaDeSemana}")
        "Viernes" -> println("Hoy es ${diaDeSemana}")
        else -> println("Incorrecto");
    }
}