import java.io.File
import java.io.FileWriter

//import java.io.FileWriter
fun main(){
    val url = "C:/Users/user/Downloads/Report 16.06.2023 (2).html"
    val fw = FileWriter(url)
    val a = fw.write(url)
    fw.close()
    println(a)
}