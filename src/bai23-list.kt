fun main(args: Array<String>) {
    //1. khai báo mutablelist
    var ds1:MutableList<Int> = mutableListOf()
    println(ds1::class.java.typeName)

    //2. List(read only)
    var ds2:List<Int> = listOf()
    println(ds2::class.java.typeName)

    // khởi tạo
    var ds3:MutableList<Int> = mutableListOf(1,2,3,4,5)
    println(ds3)

    var ds4:List<Int>  = listOf(1,2,3)
    println(ds4)

    // duyệt list
    var ds5:MutableList<Int> = mutableListOf(1,2,3,4,5,9,10)
    println(ds5.indices)
    for(i in ds5.indices){
        //print("${ds5[i]}\t")
        if(ds5[i]%2==0)
        print("${ds5[i]}\t")
    }
    println()

    // size
    var ds6:MutableList<Int> = mutableListOf(1,2,3)
    println(ds6.size)

    // add(thêm một phần tử)// mặc định thêm vào cuối
    ds6.add(7)
    println(ds6)
    ds6.add(2,100)
    println(ds6)

    // addAll: thêm nhiều phần tử
    // thêm vào cuối
    ds6.addAll(mutableListOf(2,2,2,2))
    println(ds6)
    // thêm vào vị trí nào đó
    ds6.addAll(1, mutableListOf(4,4,4,4))
    println(ds6)

    // removeAt(xóa tại một vị trí index chỉ định)
    ds6.removeAt(0)
    println(ds6)

    //remove: xóa phần tử đầu tiên trùng khớp
    ds6.remove(2)
    println(ds6)

    // sort: sắp xep tăng
    ds6.sort()
    println(ds6)

    // giảm
    ds6.sortDescending()
    println(ds6)

    // filter
    var ds7 = ds6.filter { x->x>10 }
    println(ds7)

    //contain()
    println(ds6.contains(3423))

    // clear: xóa trắng
    println(ds6.clear())
    println(ds6)

    var ds8:List<Int> = listOf(1,2,3)
    

}