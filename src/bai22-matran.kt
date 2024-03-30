import kotlin.random.Random

fun main(args: Array<String>) {
    // khai bao mang
    var m :Array<IntArray> = Array(3 ,{IntArray(4)})
    var f: Array<FloatArray> = Array(4,{FloatArray(4)})
    var rd = Random
    println(m.indices)
    for(i in m.indices){
      for(j in m[i].indices){

//          print("$i$j\t")
          m[i][j]= rd.nextInt(51)
      }
//        println()
    }
    // xuat 1 pt
    println(m[0][0])
    println(m[0][1])
    println(m[1][0])
    println(m[2][0])

    for(i in m.indices){
        for(j in m[i].indices){

          print("${m[i][j]}\t")

        }
       println()
    }

}


