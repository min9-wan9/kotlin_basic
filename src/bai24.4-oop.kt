fun main(args: Array<String>) {
    var ca1= NhanVienDiKa("Nguyễn văn a","1234","ha noi")
    var hc= NhanVienHanhChinh("Nguyên văn hành","123","hải phòng")
    println("Lương nv ca1: "+ca1.TinhLuong())
     println("Lương nv hc: "+hc.TinhLuong())

    var inter= ConInterface()
    inter.ThongTin("Quang",20,"1234")


}