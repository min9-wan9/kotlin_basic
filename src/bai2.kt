fun main(args: Array<String>) {
    // khởi tạo biến
    var a :Int = 6
    var b : Short = 9

    println("Giá trị của số A là: "+a)
    println("Giá trị của số A là: $a")

    // khai báo biến
    var c:Int
    var d: Double

    // đặt tên biến:
    // quy tắc lạc đà (calcase): chữ cái đầu viết thường, các chữ cái sau viết hoa

    var diemToan : Float
    var diemVan : Double
    var giaThuocTay: Double

    var biến : Int

    // khai báo số thực
    var i: Double= 8.4
    var z= 10.73
    println("kiểu loại của i là: "+(i::class.java.typeName))
    println("kiểu loại của z là: "+ (z::class.java.typeName))

    var k: Float = 6.5f
    println("kiểu dữ liệu của k: "+(k::class.java.typeName))

    //Khai bao số nguyên
    var x:Int =12
    var y = 21
    println("kiểu dữ liệu của x: "+(x::class.java.typeName))
    println("kiểu dữ liệu của y: "+(y::class.java.typeName))

    // kiểu long
    var g: Long=213L
    var h= 233
    println("kiểu dữ liệu của g: "+(g::class.java.typeName))
    println("kiểu dữ liệu của h: "+(h::class.java.typeName))

    // kiểu short
    var l: Short= 32767
    var n : Short= 323

    // khai báo kí tự
    var kiTu:Char ='a'

    //kiểu  string
    var str1: String="hôm nay học buổi 3"
    var str2: String = "a"
    var str3:String="đang học"
    println("kiểu dữ liệu của str3: "+(str3::class.java.typeName))

    //khai báo đoạn
    var str4 = """
        alo
        t dang t
        """
    println(str4)

    //khai báo boolean
    var check: Boolean = false
    var check2 : Boolean= true

    // Khai báo mảng
    var mangSoThuc :FloatArray= floatArrayOf(1.2f,2.4f,8.5f)
    var mangKiTu: CharArray= charArrayOf('a','b','c')
    println(mangKiTu)

    // Khai báo hằng
    val nhietDoSoi : Int =100
    val nhietDoDong =0
    val nhietDoNongChay= 1000L






}