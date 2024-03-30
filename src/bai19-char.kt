fun main(args: Array<String>) {
    // khai bao ma ASCII
    var kyTu3 = Char(112)
//    println(kyTu3)
//    println("Moi nhap vao ki tu: ")
//    var s:String ?= readLine()
//    if(s==null) return
//    var kt1 = s.first()
//    var kt2= s[0]
//    var kt3= s.single()
//    println(kt1)
//     println(kt2)
//     println(kt3)
//     println(kt1::class.java.typeName)
//     println(kt2::class.java.typeName)
//     println(kt3::class.java.typeName)

    //so sanh
    println('a'.compareTo('a'))

    // so sanh bang
    println('a'.equals('A'))

    //method
    println('5'.isDigit())
    println('s'.isLetter())
    println(' '.isWhitespace())
    println('f'.isLowerCase())
    println('A'.isUpperCase())
}