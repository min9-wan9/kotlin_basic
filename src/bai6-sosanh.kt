fun main(args: Array<String>) {
    var a=5
    var b=5
    // so sánh bằng
    println(a==b)
    println(a!=b)
    println(a<=b)
    println(a>=b)

    //phương thức
    println(a.equals(b))
    println(!a.equals(b))
    println(a.compareTo(b)>0)// a<b => compe<0; a=b => compe=0 ; a>b =>compe>0
    println(a.compareTo(b)==0)


}