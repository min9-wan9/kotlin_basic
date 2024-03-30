import kotlin.math.PI

fun main(args: Array<String>) {
    var r:Double= 0.0
    println("Nhập bán kính: ")
    var s:String? = readLine()
    if(s!=null){
        r=s.toDouble()
        var cv:Double = 2* PI*r
        var dt:Double= PI*r*r
        println("cv= "+cv)
        println("dt= "+dt)
    }



}