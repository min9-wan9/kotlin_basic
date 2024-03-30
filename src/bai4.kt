import java.nio.DoubleBuffer

fun main(args: Array<String>) {
    var a=10// khai báo tắt, tự động nhận kiểu int
    var b=3
    println(a::class.java.typeName)
    println(b::class.java.typeName)
    // phép cộng
    println("cách 1 a+b = "+(a+b))
    println("cách 2 a+b = "+(a.plus(b)))


    // phép trừ
    println("cách 1 a-b = "+(a-b))
    println("cách 2 a-b = "+(a.minus(b)))

    // phép nhân
    println("cách 1 a*b = "+(a*b))
    println("cách 2 a*b = "+(a.times(b)))


    // phép chia
    println ("cách 1 a/b = " + (a / b))
    println ("cách 2 a/b = " + (a.div(b)))
    var kq: Float = a.toFloat()/b
    println("a/b=$kq")

    //phép chia dư
    println("a%b= "+(a%b))
    println("a%b= "+(a.rem(b)))

    var x:Float=9.2f
    // - trừ một ngôi đảo dấu
    var y= x.unaryMinus()
    println("x= "+x)
    println("y= "+y)

    // công 1 ngôi
    var z= x.unaryPlus()
    println("z= "+z)

    //bài tập
    var i1=2
    var i2=5
    var i3=-3
    var d1:Float= 2.0f
    var d2:Float= 5.0f
    var d3:Double=-0.5
    println("i1 +(i2*i3)= "+(i1+(i2*i3)))
    println("i1 +(i2+i3)= "+(i1+(i2+i3)))
    var c:Double= i1.toDouble()/(i2+i3)
    println("i1 /(i2+i3)= "+c)

    var e:Double = i1.toDouble()/i2
    println("i1/i2 +i3= "+(e+i3))

    println("d1 +(d2*d3)= "+(d1+(d2*d3)))
    var m:Float= d1/d2
    println("d1/d2 +d3= "+(m-d3))

    var n:Double = d1/(d2-d3)
    println("d1/(d2-d3)= "+n)

    println("(d1 +d2+d3)/3= "+(d1+d2+d3).toDouble()/3)
    println("d1+ d2/d3= "+(d1+d2.toFloat()/d3))
    println("3*(d1+d2)*(d1-d3)= "+(3*(d1+d2)*(d1-d3)))

    println("3+4+5/3 = "+(3+4+(5.toFloat()/3)) )
    println("(3+4+5)/3= "+((3+4+5).toFloat()/3))




}