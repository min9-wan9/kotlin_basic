fun main(args: Array<String>) {
    // nhap n tu ban phim,
    // tinh tong tru 3
    var n:Int ?= readLine()!!.toInt()
    if( n != null){
        var tong=0
        for(i in 1..n){
            if(i==3) continue
            tong+=i
        }
        println(tong)
    }
}