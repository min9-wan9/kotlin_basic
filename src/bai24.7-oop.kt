import kotlin.math.sqrt
//chèn hàm cộng vào class in
fun Int.Cong(a:Int):Int{
    return this +a
}
//chèn ham kiêm tra ngut
fun Int.NT():Boolean
{
    var dem=0
    for(i in 1..this){
        if(this%i ==0)
            dem++
    }
    return dem==2
}

fun main(args: Array<String>) {
    var x = 7.Cong(5)
    println(x)
    var y=5.NT()
    if(y) println("la so nt")
    else println("ko la so nt")
}