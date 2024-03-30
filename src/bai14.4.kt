fun main(args: Array<String>) {
    for (i in 10 ..50){
        if(i%3==0) print("$i  ")
    }
    // bai 14:
    // s= 1! +2! + ...+10!
    var tong:Long= 0
    var gt=1
    for(i in 1..10){
//        var tmp=1
//        for(j in 1..i){
//            tmp*=j
//        }
//        tong+=tmp
        // cach 2
        gt*=i
        tong+=gt
    }
    println("s=$tong")
}