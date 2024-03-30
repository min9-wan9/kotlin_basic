fun Thuong(a:Int,b:Int): Int{
    if(b==0){
        throw Exception("Mẫu =0 sao chia được")
    }
    return a/b
}

fun main(args: Array<String>) {
    try {
        var c=Thuong(5,0)
        println(c)
    }
    catch (e:Exception){
        println(e.message)
    }
    finally {
        println("đa đăng xuất khỏi cơ sở dl")
    }

    println("doan codd phia sau")
}