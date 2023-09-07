fun greatingFun(): String{
    return "Hello Murad"
}

fun sayHello (){
    println(greatingFun())
}

fun myBio (a:String, b:Int){
    println("My name is $a, I am $b")

}
fun greatingFunTwo():Int = 21

fun main() {
    println("Hello world")
    println(greatingFun())
    sayHello()
    println(greatingFunTwo())
    myBio("Murad",21)
}
