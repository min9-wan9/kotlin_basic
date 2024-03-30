fun main(args: Array<String>) {
    for(i in 1..1000){
        var sum=0
        for(j in 1..i/2){
            if(i%j==0)sum+=j
        }
        if(sum== i) println(i)
    }
}