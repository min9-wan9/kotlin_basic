fun main(args: Array<String>) {
    // 1. tạo một dối tượng primary contructor
    var sv1 =SinhVien(1,"Đăng Minh Quang","123456")
    //2. tạo đối tưựng secondary contructor
    var sp1= SanPham()
    var sp2 = SanPham(1,"tivi",1000)

    // test lop sv2
    var sv2:LopSV2= LopSV2()
    var sv3= LopSV2(1,"Quang")
    println("tt sv2: ${sv2.ma} -${sv2.ten}")
    println("tt sv3: ${sv3.ma} -${sv3.ten}")
    sv2.ma=99

    println("tt sv2: ${sv2.ma} -${sv2.ten}")
    sv2.DiemToan = 9f
    println("Điểm toán sv2: ${sv2.DiemToan}")

    sv2.DiemVan=8f
    // hàm tính đtb
    var dtbsv2 = sv2.dtb(sv2.DiemToan,sv2.DiemVan)
    println("dtb= $dtbsv2")

    sv2.xuatThongTin()

    println(sv2)

    //
    var nx1= Tuoi(2009)
    nx1.kiemTra()

    println("--------------------------------")
    var test1 = ThamChieuThis()
    test1.diemVan= 5f
    test1.diemToan= 8f
    test1.TestCucBo(9f,6f)
    println("Điểm văn của test 1 sau khi gọi hàm TestCucBo: "+test1.diemVan)
    println("Điểm toán của test 1 sau khi gọi hàm TestCucBo: "+test1.diemToan)

    println("--------------------------------")
    var sp11= Overloading(1,"tivi45in",1000.0)
    var sp12= Overloading(2,"điên thoại")

    // tính giá sp theo chiết khấu
    var gia1 = sp11.ChietKhau()
    var gia2= sp11.ChietKhau(true)
    println("gia1= $gia1 \t gia2= $gia2")

    println("--------------------------------")
    // khởi tạo đối tượng tính tổng
    var dt1= HocParamater()
    var kq = dt1.TinhTong(1,3,4,6,3,5)
    var kq1= dt1.TinhTong(1,2,3)
    println("kq1= $kq")
    println("kq2= $kq1")


}