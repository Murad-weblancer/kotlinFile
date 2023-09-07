//fun main(){
//    getName()
//    getAge()
//}
//
//fun getName() {
//    println("Введите имя...")
//    var name = readLine()
//    println(name)
//}
//
//fun getAge() {
//    println("Введите возраст...")
//    var age = readLine()?.toInt()
//    println(age)
//}

// 2d way

//fun main(){
//    val name = getName()
//    val age = getAge()
//    println("$name, $age")
//}
//
//fun getName(): String? {
//    println("Введите имя...")
//    return readLine()
//}
//
//fun getAge(): Int? {
//    println("Введите возраст...")
//    return readLine()?.toInt()
//}


//3d way

fun main() {
    bio(getName(), getAge())
}

fun getName(): String? = readLine()

fun getAge(): Int? = readLine()?.toInt()

fun bio( name:String?, age:Int?){
    println("Ваши данные $name, $age")
}