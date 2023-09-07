// arrayOf используется для создания изменяемого массива элементов. при этом в него нельзя добавить и изменить элемент
fun arrayFun(){
    val languagess = arrayOf("JavaScript", "Kotlin", "Java", "TypeScript")
    println(languagess.size)
//    languagess[0] = "asdasadadasd"
    println(languagess[0])
    println(languagess.get(1))

    println("for in 111111111111111111111")
    for (i in languagess){
        println(i)
    }

    println("forEach 111111111111111111111")
    languagess.forEach {i->
        println(i)
    }

    println("forEachIndexed 111111111111111111111")
    languagess.forEachIndexed { index, i ->
        println("$index - $i")
    }
    val newLan = languagess.plus("Cypress")
    println(newLan[4])
}

// listOf используется для создания неизменяемого списка элементов.
fun listFun(){
    val languagess = listOf("JavaScript", "Kotlin", "Java", "TypeScript")
    println(languagess.size)
    println(languagess[0])
    println(languagess.get(1))

    println("for in 111111111111111111111")
    for (i in languagess){
        println(i)
    }

    println("forEach 111111111111111111111")
    languagess.forEach {i->
        println(i)
    }

    println("forEachIndexed 111111111111111111111")
    languagess.forEachIndexed { index, i ->
        println("$index - $i")
    }
    val newLan = languagess.plus("Cypress")
    println(newLan[4])
}


// mapOf используется для создания неизменяемой карты (ассоциативного массива) из пар ключ-значение.
fun mapFun(){
    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach{ key, l ->
        println("$key - $l")
    }
}

// mutable позволяет изменять list и map
fun mutableFun(){
    val list = mutableListOf(1,2,3,4)
    list.add(5)
    println(list)
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4,"d")
    println(map)
}


fun simpleFun (a:String, b:List<String>){
   b.forEach { i->
       println("$a $i")
   }
}

fun main(){
//    arrayFun()
//    listFun()
//    mapFun()
//    mutableFun()
    val languagess = listOf("JavaScript", "Kotlin", "Java", "TypeScript")
    simpleFun("Hi", languagess)
}