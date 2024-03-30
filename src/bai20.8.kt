// bai 22 : nhập vào chuỗi tách thành 2 chuối chữ cái và chữ so
fun main(args: Array<String>) {
    println("Nhập chuỗi: ")
    var s:String?= readLine()
    if(s== null) return
    var arr = s.toCharArray()
    var arr1:String=""
    var arr2:String=""
    var a=0
    var b=0
    for(i in arr){
        if(i.isDigit()){
            arr1+= i

        }else if(i.isLetter()){
            arr2+="$i"

        }
    }
    println("chuỗi số: $arr1 ")

    println("chuỗi chữ cái: $arr2")

}