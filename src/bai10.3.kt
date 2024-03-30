// when mot vung du lieu
fun main(args: Array<String>) {
    var thuNhap :Int =0
    println("Nhap thu nhap(trieu/thang): ")
    var s:String ?= readLine()
    if(s!= null){
        thuNhap= s.toInt()
        when(thuNhap){
            in 1..3 -> println("Ngheo kiep xac")
            in 4..7 -> println("ngheo vua vua")
            in 8..19 -> println("thu nhap kha")
            in 20..50-> println("giau")
            else -> println("dai gia")
            
        }
    }
}