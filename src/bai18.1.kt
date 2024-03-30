import kotlin.random.Random

fun main(args: Array<String>) {
    while(true){
        var rd= Random
        var kq= rd.nextInt(100)
        println(kq)
        println("Nhap so 0-99: ")
        var a:Int ?= readLine()?.toInt()
        if(a!= null){
            if(a==kq) println("Ban doan dung ")
            else if(a< kq) println("Ban doan nho hon")
            else
                println("Ban doan lon hon")
        }
        println("Ban co muon choi tiep khong: (y/n")
        var s:String ?= readLine()
        if(s!= null){
            if(s=="n")break
        }
    }
    var b= Random.nextInt(5)
    println(b)
}