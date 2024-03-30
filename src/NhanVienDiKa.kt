class NhanVienDiKa:NhanVien{
    constructor(ten:String,cccd:String,que:String)  :super(ten,cccd,que)
    override fun TinhLuong(): Double {
        //luong 1.05
        return luongCoBan*1.05//đi ca cao hon
    }

}