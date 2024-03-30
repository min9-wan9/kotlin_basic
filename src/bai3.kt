fun main(args: Array<String>) {
    var a: Int =35
    var b: Long = a.toLong()
    // kiểm tra kiểu loại
    println(a::class.java.typeName)
    println(b::class.java.typeName)
    println(a)
    println(b)

    // ép kiểu hẹp
    var x: Short= 32767
    var y : Byte = x.toByte()
    println("x=$x")
    println("y=$y")

    // ví dụ 2
    var m : Short = 120
    var n : Byte= m.toByte()// byte nhận giá trị -128-->127
    println("x=$m")
    println("y=$n")

    // ví dụ 3
    var diemToan : Float = 9.5f
    var diemVan : Int = diemToan.toInt()
    println("toan=$diemToan")
    println("van=$diemVan")
}