fun main(args: Array<String>) {
    var s:String ="xin chao Quang"
    var s2="halkfa"
    println(s::class.java.typeName)
    println(s2::class.java.typeName)
    var s3:String= "co nguoi noi rang:\" a quang rat dep trai\""
    println(s3)
    var s4="D:\\galaitaptrinh"
    println(s4)
    var s5="dong 1\n dong2 \t ky tu tiep theo"
    println(s5)

    println(s4.length)
    var s6= "abcefddd"
    println(s6[2])
    println(s6.indexOf('d'))// tim vi tri dau tien tim thay
    println(s6.lastIndexOf('d'))// tim vi tri cuoi cung xuat hien

    var s10="p3"
    var s11= "tuhocmp3"
    var check:Boolean = s11.contains(s10)
    if(check==true)
        println("co $s10 trong $s11")
    else
        println("ko co $s10 trong $s11")

    var s12="0123456789"
    // lay tu index 3 den het
    var s13=s12.substring(3)
    println(s13)

    var s14= s12.substring(2,8)
    println(s14)

    var s15= "hoc Hoc nua hOc Mai"
    var s16= s15.replace("hoc","ngu")
    println(s15)
    println(s16)
    var s17= s15.replace("hoc","ngu",ignoreCase = true)
    println(s17)

    var s18= s15.replaceFirst("hoc","ngu",ignoreCase = true)
    println(s18)

}
