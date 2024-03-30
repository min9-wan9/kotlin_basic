import kotlin.random.Random

fun main(args: Array<String>) {
    println("Nhap chuoi: ")
    var s:String ?= readLine()
    if(s==null) return
    var arr= s.toCharArray()
    var ktThuong= 0
    var ktHoa=0
    var so=0
    var khoangTrang=0
    for(i in arr){
        if(i.isUpperCase()) ktHoa++
        else if(i.isLowerCase())ktThuong++
        else if(i.isDigit()) so++
        else if(i.isWhitespace()) khoangTrang++
    }
    var rd= Random
    println("kt thuong: $ktThuong")
    println("kt hoa: $ktHoa")
    println("so: $so")
    println("khoang trang: $khoangTrang")

}