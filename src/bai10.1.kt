fun main(args: Array<String>) {
    var i:Int=0
    println("nhap so: ")
    var s:String ?= readLine()
    if(s!=null){
        i=s.toInt()
        when (i%2){
            0-> println("chan")
            else -> println("le")
        }
    }
}