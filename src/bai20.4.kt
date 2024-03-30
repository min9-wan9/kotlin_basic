/* Cho:
Var str1:String = "English=78Science=83Math=68History=65"
1. Tính tổng các số trong chuổi trên
2. Tính trung bình cộng
 */
fun bai2(){
    var str1:String = "English = 78 Science = 83 Math = 68 History = 65"
    var s=str1.split(" ")
    var sum=0
    var dem=0
    var tbc=0.0
    for(i in s){
        if(i[0].isDigit()){
            sum+=i.toInt()
            dem++
        }

    }
    tbc= ((sum/dem).toDouble())
    println("sum= $sum  tbc= $tbc")
}
fun main(args: Array<String>) {
    bai2()
    var str1:String = "English=78Science=83Math=68History=65"
    var s=0
    var gan=0
    var dem=0
    var vt:Int
    var str2:String ="="
    while(str1.contains(str2)){
        vt=str1.indexOf("=")
        var so= str1.substring(vt+1,vt+3)
        gan= so.toInt()
        s+=gan
        dem++
        str1=str1.replaceFirst("=","-")
    }
    var tbc= (s/dem).toDouble()
    println("s=$s  tbc= $tbc")
}
