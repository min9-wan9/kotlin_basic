fun main(args: Array<String>) {
    var i=199
    // kiểm tra số i>0 vài<10
    println(i>0 && i<10)
    //phép hoặc
    println(i>0|| i<10)
    //phép phủ định
    println(!(i>0|| i<10))

    // phương thức
    println((i>0).and(i<10))
    println((i>0).or(i<10))
    
}