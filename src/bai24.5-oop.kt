fun main(args: Array<String>) {
    //tạo 1 đối tượng nv1, kiểu dữ  liệu nhân sự
    var nv1:NhanSu = PhoPhong()
    println("lương nv1: "+nv1.TinhLuong(24))
    // ông trưởng phòng tham--> đuổi
    // thăng cấp nv1-tp
    nv1= TruongPhong()
    println("lương nv1: "+nv1.TinhLuong(24))

}