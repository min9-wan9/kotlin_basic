fun main(args: Array<String>) {
    //khai báo đối tương kiểu dữ liệu TinhToan
    var dt1:TinhToan = TinhCong()
    // gọi phương thức tính
    dt1.Tinh(7,5)

    //chuyển dt1 sang đối tượng TinhHieu
    dt1= TinhHieu()
    dt1.Tinh(7,5)

    //data classes
    data class TenData(var ten:String,var cccd:String)
    var data1= TenData("A","1234")
    //test phương thức copy
    var data2= data1.copy("B")
    println(data2)
    println(data1)
    //
    println(data2.component1())
    println(data2.component2())

}