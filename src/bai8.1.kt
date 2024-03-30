fun main(args: Array<String>) {
    // nhập chuỗi từ bàn phím
    println("nhập tên: ")
    var ten:String? = readLine()
    println("ten: "+ten)

    // nhập số tu bàn phím
    var so:Int
    println("nhap so nguyen: ")
    var s:String? = readLine()
    if(s!=null){
        so=s.toInt()
        println(so)
        println(so::class.java.typeName)
    }


}
