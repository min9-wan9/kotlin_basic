fun main(args: Array<String>) {
    var n=0
//    while(n<100){
//        n++
//        println("n trong vong lap $n")
//        if(n==10) break
//    }

    // continue
    // tong 1-5 tru 3
    var tong=0
    for(i in  1..5){
        if(i==3)
            continue

            println(i)
            tong+=i
        

    }
    println("tong = $tong")
}