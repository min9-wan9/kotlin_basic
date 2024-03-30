fun main(args: Array<String>) {
    var a:Double=0.0
    var b:Double= 0.0
    println("Nhap chieu cao: ")
    var s:String ?= readLine()
    println("Nhap can nang: ")
    var k:String ?= readLine()
    if(s!= null && k!=null){
        a=s.toDouble()
        b=k.toDouble()
        var kq= a/(b*b)
        if(kq<15) println("qua gay")
        else if(kq>=15 && kq<16) println("gay")
        else if(kq>=16 && kq<18.5) println("hoi gay")
        else if(kq>=18.5 && kq<25) println("binh thuong")
        else if(kq>=25 && kq<30) println("hoi beo")
        else if(kq>=30 && kq<35) println("beo")
        else 
            println("qua beo")
    }
}