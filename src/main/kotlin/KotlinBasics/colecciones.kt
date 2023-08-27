package KotlinBasics

fun main(){
    var miArreglo:Array<Int> = arrayOf(1,2,3,4)

    miArreglo.forEach {
        println(it)
    }

    var miArregloGenera:Array<Any> = arrayOf(1,2,3,4, "Mas", false)

    for(el in miArreglo)
        println(el)

   //miArreglo.set(4,55)

    var miArregloConTamanio = arrayOfNulls<Int>(10)


    miArregloConTamanio.forEach {
        println(it)
    }

    miArreglo.set(3, 77)

    var miArrayWithSize = Array(5,{ 1 })
    miArrayWithSize.forEach {
        println(it)
    }

    var miArregloGeneric:Any = arrayOf(1,2,"Gato")


    var myHashMap:HashMap<String, String> = HashMap()

    myHashMap.put("M", "Masculino")
    myHashMap.put("F", "Masculino")
    myHashMap.put("Y", "Yes")
    myHashMap.put("N", "False")

    println(myHashMap.get("F"))


    var mArrayList = ArrayList<Int>()

    mArrayList.add(11)
    mArrayList.add(12)
    mArrayList.add(14)

    println(mArrayList.get(44))
}