var userName:String? = null
var userNameTwo:String = "Murad"
var age:Int = 25
//    userName = "Rustam"
var ageTwo:Int? =  null


//fun main() {
//    ageTwo = 21
//
//    println("Hello $userName your age is $age!")
//    println("Hello $userNameTwo your age is $ageTwo!")
//}

//fun main() {
//    val userName = "Hi"
//    when(userName){
//            null -> println("Hi $userNameTwo")
//            else -> println("Hello World")
//        }
//
//
//}



//fun main() {
//    userName = "Hello"
//    var newVarrible = if(userName != null) userName else "Hi"
//    println(newVarrible)
//}


fun main() {
    val userName = "Hi"
    when(userName){
        null -> println("Hi $userNameTwo")
        else -> println("Hello World")
    }

    println(str2)
    val json = """{
    "a":"a",
    "b":{
        "c":"c"
    }
}"""
}

val str1 = "abc \" \n" +
        "def"

val str2 = """a$str1 bc " " " " " \n "
def
"""
val json = """{
    "a":"a",
    "b":{
        "c":"c"
    }
}"""