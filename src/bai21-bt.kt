import kotlin.random.Random

fun main(args: Array<String>) {
    println("Nhập vào số phần tử của mảng: ")
    var s:String ?= readLine()
    if(s== null) return
    var n= s.toInt()
    var arr:IntArray = IntArray(n)
    var rd= Random
    for(i in arr.indices){
        arr[i]= rd.nextInt(100)
    }
    println("Các phần tử của mảng: ")
    for(i in arr){
        print("$i\t")
    }

  arr.reverse()
    println()
    println("Mảng sau khi đảo ngược: ")
    for(i in arr){
        print("$i\t")
    }
    println()
    arr.sort()
    println("Mảng sau khi sắp xếp: ")
    for(i in arr){
        print("$i\t")
    }
    var sum=0
    for(i in arr){
        sum+=i
    }
    println()
    println("sum = $sum")

    println()
    println("Nhập số cần tìm kiếm: ")
    var so:String ?= readLine()
    var vt:Int =-1

    if(so== null) return
    var x= so.toInt()
    for(i in arr.indices){
        if(arr[i]==x) {
            vt=i
            println("Tìm thấy tại vt: $vt")
            return
        }
    }
    println("ko tim thay")
}