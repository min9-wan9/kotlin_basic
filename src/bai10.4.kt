// when nhu bien tra ve kq
fun main(args: Array<String>) {
    var a:Int =1
    var check= when(a){
        in 1..100->32
        else ->34
    }
    println(check)

    // when nhu if- else
    var b:Int =21
    when
    {
        b%2==0 -> println("b la so chan")
        b%2!=0 -> println("b la so le")

    }
}