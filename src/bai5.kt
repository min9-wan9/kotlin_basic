fun main(args: Array<String>) {
    var a=5// khai báo tắt
    println("kiểu giá trị a:"+a::class.java.typeName)
    println("a=$a")

    // gắn cộng bằng
    a+=5
    println("a=$a")
}