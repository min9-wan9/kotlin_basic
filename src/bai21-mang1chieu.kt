import kotlin.random.Random

fun main(args: Array<String>) {
    // khai báo mảng
    var n:IntArray = IntArray(5)
    var m2:FloatArray = FloatArray(10)
    println(n::class.java.typeName)
    println(m2::class.java.typeName)
    for(i in n){
        print("$i\t")
    }

    // khởi tạo
    println()
    var m3: IntArray = intArrayOf(1,2,3,4,5)
    for(i in m3){
        print("$i\t")
    }

    //5. truy xuất qua index
    println()
    println(m3[0])
    println(m3[4])
    println(m3[3])

    m3[0]=1000
    m3[1]=321
    println("Mảng m3 sau khi thay đổi là: ")
    for(i in m3){
        print("$i\t")
    }

    println()
    //6. Khởi tạo giá trị ngẫu nhiên
    var rd= Random
    var m4:IntArray= IntArray(6)
    println(m3.indices)
    //duyệt for
    for (i in m4.indices){
        m4[i]=rd.nextInt(100)
    }
    // xuất mảng
    println("Mảng ngẫu nhiên là :")
    for(i in m4){
        print("$i\t")
    }
    println()

    println("Số phần tử của mảng là: "+m4.size)
    // phép gán mảng : cả 2 tk cùng vùng nhớ , thay đổi 1 tk là cả 2 tk thay đổi
    var m9= arrayOf(2,3,4,5)
    var m10=m9
    m9[0]=112
    println(m9[0])
    println(m10[0])

    // clone mảng : 2  tk ở 2 vùng nhớ khác nhau
    var m11= arrayOf(3,5,1,2)
    var m12= m11.clone()
    m11[0]=99
    println(m11[0])
    println(m12[0])

    // đảo ngược mang
    var m13= arrayOf(1,2,3,4,5)
    m13.reverse()
    for(i in m13){
        print("$i\t")
    }
    println()

    // sắp xếp tăng dần
    var m14 = arrayOf(6,1,4,2,4,9)
    m14.sortDescending()
    // sắp xếp giảm
    println("Mảng sau sắp xếp tăng là:")
    for(i in m14){
        print("$i\t")
    }
    println()

    // filter
    var m15= arrayOf(1,3,5,7,10,12,432)
    var ds= m15.filter { i ->i%2==0 }
    println(ds)
    var ds2=m15.filter { i-> i%2!=0 }
    println(ds2)

    // max, min
    var m16= arrayOf(2,13,4,5,32,21)
    m16.sort()
    println("Mảng sau sắp xếp là: ")
    for(i in m16){
        print("$i\t")
    }
    println("Min = "+m16[0])
    println("Min = "+m16.first())
    println("Min = "+m16.last())
    println("Min = "+m16[m16.size-1])



}