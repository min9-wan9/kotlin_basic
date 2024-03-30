fun main(args: Array<String>) {
    var a=2
    var b=10
    try {
        var c=b/a
        println(c)
    }
    catch (e:Exception){
        e.printStackTrace()
    }
    finally {
        println("Thoát khỏi database")
    }
    println("alo")
}