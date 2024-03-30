fun main(args: Array<String>) {
    var tong:Int=0
    var hieu:Int=0
    println("Nhap tong: ")
    var s:String ?= readLine()
    println("Nhap  hieu: ")
    var k:String?= readLine()
    if(s!= null && k!= null){
        tong=s.toInt()
        hieu=k.toInt()
        var x:Float= (tong+hieu).toFloat()/2
        var y:Float
        println("x= "+x)
        println("y= "+(tong.toFloat()-x))
    }
}