fun main(args: Array<String>) {
//    for(i in 1..9){
//        for(j in 2..9){
//            println("$i * $j= ${i*j}")
//        }
//        println("------")
//    }
    var h=7
    // chu N
//    for(i in 1..h){
//        for(j in 1..h){
//            if(j==1 || j==h || j==i)
//                print("$i$j")
//                print("\t")
//
//
//        }
//        println()
//    }
    // trai tim
    for(i in 1..7){
        for(j in 1..7){
            if((i==1 &&(j==2 || j==3 || j==5 || j==6)) || ((i==2 ||i==3)&&(j==1 ||j==7)) || (i==4 &&(j==2 ||j==6)) || (i==5 &&(j==3 || j==5)) || (i==6 && j==4))
                print("$i$j")
            else print("  ")
        }
            println()
    }

}