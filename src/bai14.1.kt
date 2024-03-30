fun main(args: Array<String>) {
    println("Nhap n: ")
    var n:Int ?= readLine()!!.toInt()
    if(n != null){
        var gt=1
        for(i in 1..n){
            gt*=i
        }
        var gt1=1
        while(n>=1){
            gt1*=n
            n--
        }
        println("$gt  $gt1")
    }
}