// bài 26
fun c2()
{
    var quest:MutableList<String> = mutableListOf("2 + 5 + 7 =","5 * 10 = ","12 % 2 =")
    var answer: MutableList<String> = mutableListOf("14","50","0")
    for(i in quest.indices){
        println(quest[i])
        var s:String ?= readLine()
        if(s== null) return
        if(s==answer[i]){
            println("Bạn đã trả lời đúng")
        }else
        {
            println("câu trả lời sai, đáp án đúng "+answer[i])
        }
    }
}
fun main(args: Array<String>) {
    c2()
//    var quest:MutableList<String> = mutableListOf("2 + 5 + 7 =","5 * 10 = ","12 % 2 =")
//    for(i in 0..2){
//        println(quest[i])
//        var s:String ?= readLine()
//        if(s== null) return
//        when(i){
//            0-> if(s=="14") println("correct")
//            else println("wrong, the answer is 14")
//            1-> if(s=="50") println("correct")
//            else println("wrong, the answer is 50")
//            2-> if(s=="0") println("correct")
//            else println("wrong, the answer is 0")
//
//        }
//    }
}