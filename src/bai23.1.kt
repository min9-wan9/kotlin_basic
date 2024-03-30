import java.util.*
import kotlin.random.Random

//bai24
fun main(args: Array<String>) {
    println("Nhập số phần tử: ")
    var s:String ?= readLine()
    if(s== null) return
    var n:Int = s.toInt()
    var ds:MutableList<Int> = mutableListOf()
    var rd= Random
    for(i in 0..n-1){
        ds.add(rd.nextInt(100))

    }
    println(ds)
}