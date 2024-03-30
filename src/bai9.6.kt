fun main(args: Array<String>) {
    var nam:Int=0
    println("nhap nam: ")
    var s:String ?= readLine()
    if(s!= null){
        nam=s.toInt()
        if((nam%4==0 && nam %100!=0)|| nam%400==0)
            println("nam nhuan")
        else println("khon phai nam nhuan")
    }
}