import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*


fun main(args: Array<String>) {
    var cal =Calendar.getInstance()
    println(cal)

    // get ngay,thang,nam
    var nam= cal.get(Calendar.YEAR)
    var thang = cal.get(Calendar.MONTH)
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("ngay thang nam hien tai: $ngay/${thang+1}/$nam")

    // đặt ngày tháng năm theo ý muốn
    cal.set(Calendar.YEAR,1990)
    cal.set(Calendar.MONTH,4)
    cal.set(Calendar.DAY_OF_MONTH,21)

    // kiem ra nam sinh đc thiet lạp
    var nam1= cal.get(Calendar.YEAR)
    var thang1 = cal.get(Calendar.MONTH)
    var ngay1 = cal.get(Calendar.DAY_OF_MONTH)
    println("ngay thang nam : $ngay1/${thang1}/$nam1")

    // xuất ngày tháng năm
    var date= cal.time
    // khai báo định dạng
    var dinhDang = SimpleDateFormat("dd//MM//yyyy")
    println(dinhDang.format(date))

    var dinhDang2= SimpleDateFormat("dd//MM//yyyy hh:mm:ss a")
    println(dinhDang2.format(date))
    //
    val test = dinhDang.format(date)
    val t1 = dinhDang.parse(test)
    val t2 ="11/02/2023"
    val dateString = "11/2/2023"
    val dateFormat: DateFormat = SimpleDateFormat("d/M/yyyy") // Định dạng d/M/yyyy phù hợp với "ngày/tháng/năm"

    try {
        val date: Date = dateFormat.parse(dateString)
        println("Ngày đã parse: $date")
        println(date.time/600000)
    } catch (e: ParseException) {
        e.printStackTrace()
    }
    println(t1.time)
    println(test::class.java.typeName)
    println(t1::class.java.typeName)
    println(System.currentTimeMillis()/60000)


}