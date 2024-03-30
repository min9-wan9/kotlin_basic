fun main(args: Array<String>) {
    var a:Int=0
    var b:Int=0
    println("Nhập vao chiều dài và chiều rộng:")
    var x:String ? = readLine()
    var y:String? = readLine()
    if(x!=null && y!= null){
        a=x.toInt()
        b=y.toInt()
        println("cv= "+2*(a+b))
        println("dt= "+(a*b))
    }
}