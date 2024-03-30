fun main(args: Array<String>) {
    var a:Int
    println("Nhap a: ")
    var s:String?= readLine()
    if(s!= null){
        a=s.toInt()
        if(a%2==0){
            var tong=0
            for(i in 0..a){
                tong+=i
            }
            println(tong)
        }else println("ko tinh tong le")
    }
}