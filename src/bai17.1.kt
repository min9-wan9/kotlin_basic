import java.text.SimpleDateFormat
import java.util.Calendar

/*
viết chương trình nhập vào ngày, tháng, năm sinh
cho biết về số tuổi và in ra màn hình
 */
fun main(args: Array<String>) {
    var dinhDang= SimpleDateFormat("dd/MM/yyyy")
    println("Nhập vào ngày tháng năm sinh: dd/MM//yyyy")
    var s= readLine()
    if(s==null)return

    // ép kiểu
    var dateInput = dinhDang.parse(s)

    // khởi tạo biến date time
    var timeNamSinh = Calendar.getInstance()
    // set timeNamSinh = thơi gian nhập vào
    timeNamSinh.time= dateInput
    var namSinh= timeNamSinh.get(Calendar.YEAR)
    var thangSinh = timeNamSinh.get(Calendar.MONTH)
    var ngaySinh = timeNamSinh.get(Calendar.DAY_OF_MONTH)

    println("Ngày tháng năm sinh của bạn là: $ngaySinh/${thangSinh+1}/$namSinh")

    // khởi tạo date time
    var timeHienTai= Calendar.getInstance()
    // lấy năm hiện tại
    var namHienTai= timeHienTai.get(Calendar.YEAR)
    // tìm Tuồi
    var tuoi= namHienTai- namSinh
    println("Tuổi: $tuoi")
}