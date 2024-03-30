open abstract class NhanVien {
    // instance var
    protected  var ten:String =""
    protected  var cccd:String=""
    protected  var que:String=""
    val luongCoBan:Double= 1200.0// val: hang so



    //hàm trừu tượng
    public  abstract fun TinhLuong():Double

    constructor(ten:String,cccd:String,que:String)
    {
        this.ten= ten
        this.cccd= cccd
        this.que= que
    }

    constructor(ten:String,cccd: String)
    {
        this.ten= ten
        this.cccd= cccd
    }
}