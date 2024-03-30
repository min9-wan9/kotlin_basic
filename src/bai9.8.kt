import kotlin.math.sqrt

fun main(args: Array<String>) {
    var a:Double=0.0
    var b:Double= 0.0
    var c:Double =0.0
    println("Nhap a: ")
    var x:String ?= readLine()
    println("Nhap b: ")
    var y:String ?= readLine()
    println("Nhap c: ")
    var z:String ?= readLine()
    if(x!=null && y!=null && z!=null){
        a=x.toDouble()
        b=y.toDouble()
        c=z.toDouble()
        var d= b*b -4*a*c
        if(d<0) println("pt vo nghiem")
        else if(d==0.0){
            println("x1= x2= "+-b/(2*a))
        }
        else {
            println("x1= "+(-b+ sqrt(d))/(2*a))
            println("x2= "+(-b- sqrt(d))/(2*a))
        }
    }
}