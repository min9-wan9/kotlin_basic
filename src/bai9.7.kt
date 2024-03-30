fun main(args: Array<String>) {
    var a:Int =0
    println("nhap thang: ")
    var s:String ?= readLine()
    if(s!= null){
        a=s.toInt()
        if(a==1 || a==3 || a==5 || a==7 || a==8 || a==10 || a==12)
            println("31")
        else if(a==4 || a==6 || a==9|| a==11)
            println("30")
        else if(a==2){
            var nam:Int=0
            println("nhap nam: ")
            var s:String ?= readLine()
            if(s!= null){
                nam=s.toInt()
                if((nam%4==0 && nam %100!=0)|| nam%400==0)
                    println("29")
                else println("28")
            }
        }
        else println("thang ko hop le")
    }
}