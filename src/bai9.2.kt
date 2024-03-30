fun main(args: Array<String>) {
    /*bai2
    nhập vào điểm tb, in ra xếp loai
    - gioi: dtb<=10 và dtb>=8
    - kha:dtb<8 va dtb>=6.5
    - tb : dtb<6.5 va dtb>=5
    - yếu: dtb<5
     */
    var diem: Float=0.0f
    println("Nhap diem: ")
    var s:String?= readLine()
    if(s!=null){
        diem=s.toFloat()
        if(diem<=10 && diem>=8){
            println("Gioi")
        }else if(diem<8 && diem>=6.5){
            println("kha")
        }else if(diem<6.5 && diem>=5)
            println("trung binh")
        else println("yeu")
    }
}