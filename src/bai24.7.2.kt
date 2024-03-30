import java.time.Year
import java.util.Calendar

//hàm tính tuổi, chèn vào class SV
fun SV.Tuoi():Int
{
    var cal= Calendar.getInstance()
    var namHienTai= cal.get(Calendar.YEAR)
    cal.time= this.NamSinh
    var yearSinhRa= cal.get(Calendar.YEAR)
    return namHienTai-yearSinhRa


}
// ôn lại exceception method
fun Tuoi2.TinhTuoi():Int
{
    var cal= Calendar.getInstance()
    var namHienTai= cal.get(Calendar.YEAR)
    cal.time= this.NamSinh
    var ns= cal.get(Calendar.YEAR)
    return namHienTai-ns
}



fun main(args: Array<String>) {
    var cal= Calendar.getInstance()
    cal.set(Calendar.YEAR,2004)
    var Quang = Tuoi2(cal.time)
    var kq= Quang.TinhTuoi()
    println("Tuổi của Quang là: $kq")


}