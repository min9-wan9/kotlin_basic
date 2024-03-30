/*
kotlin 20
Viết chương trình chuyên tin sang mật mã theo bảng:
    #a="abcdefghijklmnopqrstuvwxyz"
    #b="zxcvbnmasdfghjklqwertyuiop"
 */
fun cach2(s:String){
   var  a="abcdefghijklmnopqrstuvwxyz"
    var b="zxcvbnmasdfghjklqwertyuiop"
    var mh=""
    for(i in s){
//        println(i)
//        println(a.indexOf(i))
        mh+=b[a.indexOf(i)]
    }
    println("\nchuỗi mã hóa: $mh")

}
fun main(args: Array<String>) {
    println("Nhập chuỗi: ")
    var s:String ?= readLine()
    if(s==null) return
    var arr=s.toCharArray()
    var arr2: CharArray
    var index=0
    for(i in arr){
        if(i=='a') arr[index]='z'
        else if(i=='b') arr[index]='x'
         else if(i=='c') arr[index]='c'
         else if(i=='d') arr[index]='v'
         else if(i=='e') arr[index]='b'
         else if(i=='f') arr[index]='n'

         else if(i=='g') arr[index]='m'
         else if(i=='h') arr[index]='a'
         else if(i=='i') arr[index]='s'
         else if(i=='j') arr[index]='d'
        else if(i=='k') arr[index]='f'
         else if(i=='l') arr[index]='g'
         else if(i=='m') arr[index]='h'
         else if(i=='n') arr[index]='j'
        else if(i=='o') arr[index]='k'
         else if(i=='p') arr[index]='l'
         else if(i=='q') arr[index]='q'
         else if(i=='r') arr[index]='w'
        else if(i=='s') arr[index]='e'
         else if(i=='t') arr[index]='r'
         else if(i=='u') arr[index]='t'
         else if(i=='v') arr[index]='y'
        else if(i=='w') arr[index]='y'
         else if(i=='x') arr[index]='i'
         else if(i=='y') arr[index]='o'
         else if(i=='z') arr[index]='p'

        index++

//        #a="abcdefghijklmnopqrstuvwxyz"
//        #b="zxcvbnmasdfghjklqwertyuiop"
    }
    for(j in arr){
        print(j)
    }
    cach2(s)
}