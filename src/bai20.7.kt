/*
 đếm từ"tôi " trong chuỗi cho trước
 */
fun main(args: Array<String>) {
    var s:String="""
        tôi chăm học 
        tôi chịu khó
        tôi đẹp zai
    """
   var arr =s.split(" ")
    var dem=0
    for(i in arr){
//        println(i)
//        if(i=="tôi") {
//            dem++
//        }
        if(i.contains("tôi"))dem++
    }

    println("có $dem chữ tôi")
}