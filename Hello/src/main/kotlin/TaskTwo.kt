fun main() {
    val arr: Array<Any> = arrayOf("1", 2, "3", true, 4.5, Pair(1, 2), mapOf("1" to "2"))
    val app = arr.filter { it is String || it is Int || it is Boolean }
    println(app.joinToString("ab"))
}




fun Array<out Any>.join(separator: String): String {
//    val filteredElements = filterIsInstance<String>() + filterIsInstance<Int>() + filterIsInstance<Boolean>()
    return joinToString(separator)
}

