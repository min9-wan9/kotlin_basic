//bài 28
fun cach2(){
    var m:MutableList<Int > = mutableListOf(1,2,5,1,2,4,8,10,10)
    println(m)

    var m2= m.toMutableList()
    m2.sort()
    println(m2)
    var min =m2[0]
    var max= m2[m2.size-1]
    while(m2.contains(min)){
        m2.remove(min)
    }
    while(m2.contains(max)){
        m2.remove(max)
    }
    println("Danh sach sau khi xoa: "+m2)
    println("min2= "+m2[0])
    print("vi tri index: ")
    for(i in m.indices){
        if(m[i]==m2[0])
            print("$i\t")
        break
    }
    println()
    println("max2= "+m2[m2.size-1])
    for(i in m.indices){
        if(m[i]==m2[m2.size-1])
            print("$i\t")
        break
    }
}
fun main(args: Array<String>) {
    cach2()
//    println("Nhập số phần tử: ")
//    var n:Int ?= readLine()?.toInt()
//    if(n==null) return
//    var ds:MutableList<Int> = mutableListOf()
//    println("Nhập vào các phần tử của mảng: ")
//    for(i in 0..n-1){
//        var s:Int ?= readLine()?.toInt()
//        if(s==null) return
//        ds.add(s)
//    }
//    println(ds)
//    ds.sort()
//    println(ds)
//    for(i in 1..n-1){
//        if(ds[i]>ds[0]){
//            println("min2 = ${ds[i]}, vt = $i")
//            break
//        }
//    }
//    for(i in n-2 downTo 0){
//        if(ds[i]<ds[n-1]){
//            println("max2 = ${ds[i]}, vt = $i")
//            break
//        }
//    }
}