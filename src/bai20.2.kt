fun main(args: Array<String>) {
    // xoa khoang trang o dau, cuoi
    var s19="         quang dai ca        xin chao     "
    var s20= s19.trim()
    println(s20)
    println(s19.length)
    println(s20.length)

    var s21= s19.trimStart()
    println(s21)
    println(s19.length)
    println(s21.length)

    // compare to : so sanh
    var s23 = "abc123"
    var s24="abc123"
    var x= s23.compareTo(s24)
    println(x)

    // noi chuoi
    var s25="ket noi"
    var s26 =s25+ "cac chuoi "
    println(s26)
    var s27 = s26.plus("voi nhau")
    println(s27)

    // khai bao
    var s28 = StringBuilder()
    //khoi tao
    var s29= java.lang.StringBuilder("alo ola")

    //insert
    s29.insert(2,"chen vao")
    println(s29)

    // append: chen vao cuoi
    s29.append("qua tuyet vi")
    println(s29)

//    s29.delete(1,3)
//    println(s29)
    println(s29.reverse())

    var s30="xinchao.mp3.mp4"
    var arr:List<String> =s30.split(".")
    //duyet phan tu cua list
    for(i in arr){
        println(i)
    }

    var s31= "Chao dai ca"
    var s32= s31.lowercase()
    var s33= s31.uppercase()
    println(s32)
    println(s33)

    var mk="ada21"
    var arr2= mk.toCharArray()
    for(j in arr2){
        println(j)
        print(j::class.java.typeName)
    }


}