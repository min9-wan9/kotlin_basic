//bai25
fun main(args: Array<String>) {
    println("Nhập vào số phân tử:")
    var n:Int ?= readLine()?.toInt()
    if(n==null) return
    var ds:MutableList<Int> = mutableListOf()
    for(i in 0..n-1){
        println("Nhập phần tử thứ ${i+1}: ")
        var s:Int ?= readLine()?.toInt()
        if(s==null) return
        ds.add(s)

    }
    println("danh sach ban đâu: "+ds)
    var ds1:MutableList<Int> = mutableListOf()
    for(i in 0..n-1){
        ds1.add(ds[i]*ds[i])
    }
    println("Danh sách bình phương: "+ds1)
    var dem=0
    for(i in ds1.indices){
        if(ds1[i]>50) dem++
    }
    println("Số phần tử lớn hơn 50: $dem")

}