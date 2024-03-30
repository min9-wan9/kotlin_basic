fun tinh(a:Double,b:Double,c:String)
{
    if(c=="+")
        println("ket qua : "+(a+b))
else if(c=="-")
        println("ket qua : "+(a-b))
else if(c=="*")
        println("ket qua : "+(a*b))
else if(c=="/")
        println("ket qua : "+(a/b))
else println("phep toan khong hợp lệ")

}
fun main(args: Array<String>) {
    println("Nhap a:")
    var a:Double ?= readLine()?.toDouble()
    println("Nhap b:")
    var b:Double ?= readLine()?.toDouble()
    println("Nhap phép toán:")
    var c:String ?= readLine()
    if(a==null || b== null) return
    when(c){
        "+" -> println("kết qua: "+(a+b))
        "-" -> println("kết qua:" +(a-b))
        "*" -> println("kết qua: "+(a*b))
        "/" -> println("kết qua: ${a/b}")
        else  ->println("phep toan sai!")

    }
    println("Hàm:")
    if (c != null) {
        tinh(a,b,c)
    }

}