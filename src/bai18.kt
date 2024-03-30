import kotlin.random.Random

fun main(args: Array<String>) {
    // khoi tao random
    var rd= Random
    // random so nguyen
    var rdNguyen = rd.nextInt(10)// chay tu 0-9
    println(rdNguyen)

    // random trong doan [a,b)
    var rd2 = rd.nextInt(-1,1)//-1-0
    println(rd2)

    // random so thuc
    var rd3= rd.nextDouble()// [0,1)
    println(rd3)

    // random so thuc #1
    //cach 1: + 1 so nguyen
    var rd4 = rd.nextInt(-50,50)
    var rd5= rd.nextDouble()
    var rd6= rd4+ rd5
    println(rd6)

    //cach 2
    var rd7 = rd.nextDouble()*10
    println(rd7)


}