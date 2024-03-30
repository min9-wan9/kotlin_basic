import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Nhập a: ")
    var a:Int ?= readLine()!!.toInt()
    if(a!=null){
        var check=0
        for(i in 2..sqrt(a.toDouble()).toInt()){
            if(a%i==0){
                println("ko phai so nt")
                check=1
                break
            }
        }
        if(check==0) println("$a là số nt")
        while(true){
            println("Bạn có muốn thoát chương trình không")
            var s:String ?= readLine()
            if(s=="y" || s=="Y") break
        }
    }
}