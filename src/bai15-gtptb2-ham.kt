import kotlin.math.sqrt

fun giaiPTB2(a:Double, b:Double, c:Double)
{
    if(a==0.0){
        println("la pt bậc nhất")
        println("nghiem là: "+(-c/b))

    }else{
        var delta: Double = b*b - 4*a*c
        if(delta<0)
            println("pt vo nghiem")
        else if(delta==0.0)
            println("nghiem kep: "+(-b/(2*a)))
        else{
            println("x1= " +( -b+ sqrt(delta))/(2*a))
            println("x2= " +( -b-sqrt(delta))/(2*a))
        }
    }
}

fun main(args: Array<String>) {
    giaiPTB2(1.0,2.0,3.0)
    giaiPTB2(1.0,2.0,1.0)
    giaiPTB2(1.0,2.0,-3.0)

}