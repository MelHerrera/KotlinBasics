package KotlinBasics

fun main(){
    //< > == != <=  >=

    //if
    var esMayor:Boolean = false;
    var edad:Int = 7;

    if(edad > 18){
        esMayor = true;
    }
    var msj:String = if (esMayor) "Si"; else "No";

    println(esMayor);
    println(msj);

    var añoNacimiento:Int = 1998;

    println(edad > 18 && añoNacimiento >= 1998 );
    println(edad > 18 || añoNacimiento >= 1998 );
}