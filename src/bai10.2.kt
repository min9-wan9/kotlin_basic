fun main(args: Array<String>) {
    var thang:Int=0
    println("Nhap thang: ")
    var s:String ?= readLine()
    if(s!= null){
        thang=s.toInt()
        when(thang){
            1,2,3 -> println("quy 1")
            4,5,6 -> println("quy 2")
            7,8,9 -> println("quy 3")
            10,11,12 -> println("quy 4")
            else -> println("thang ko hople")

        }
    }
}