fun main(args: Array<String>) {
    // kiem tra chan le
    var a:Int =0
    println("Nhap so:")
    var s:String ?= readLine()
    if(s!=null){
        a=s.toInt()
        if(a%2==0) println("chan")
        else println("le")
    }
}