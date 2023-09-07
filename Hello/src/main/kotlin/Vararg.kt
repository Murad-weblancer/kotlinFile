// vararg (variable-length arguments) - это ключевое слово в языке программирования Kotlin, которое позволяет передавать произвольное количество аргументов одного типа в функцию или конструктор.
fun sayHello (a:String, vararg b:String){
//    b.forEach { i->
//        println("$a $i")
//    }
    val arr: Array<String> = arrayOf("1", "2", "3")
    println(arr.join("AB"))
}

fun main(){

    val languagess = listOf("JavaScript", "Kotlin", "Java", "TypeScript")
    sayHello("Hi", "JavaScript", "Kotlin", "Java", "TypeScript")
//    sayHello("Hi", "JavaScript", "Kotlin", "Java", "TypeScript")
}

fun Array<String>.join(separator: String): String {
    var result = "$separator"
    return joinToString(result)
}