// bài 27
fun main(args: Array<String>) {
    println("Nhập số phần tử: ")
    var n:Int ?= readLine()?.toInt()
    if(n==null) return
    var ds:MutableList<Int> = mutableListOf()
    println("Nhập vào các phần tử của mảng: ")
    for(i in 0..n-1){
        var s:Int ?= readLine()?.toInt()
        if(s==null) return
        ds.add(s)
    }
    println(ds)
    var dem=0
    var ds2:MutableList<Int> = mutableListOf()
    for(i in ds.indices){
        if(ds[i]<5){
            dem++
            ds2.add(i)
        }

    }
    println("số phẩn tu lớn hơn 5: $dem")
    println("vị trí của chúng : "+ds2)
}