fun main(args: Array<String>) {
    var dtn: Double=0.0
    println("nhap dtn: ")
    var s:String?= readLine()
    // kiểm tra s khác null
    if(s!=null){
        dtn=s.toDouble()
        if(dtn>=7.0)
            println("Đỗ")
        else
            println("Trượt")
    }

}