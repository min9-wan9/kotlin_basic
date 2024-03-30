class Overloading {
    // instance var
    private var maSP :Int =0
    private var tenSp:String =""
    private var giaSP:Double =0.0
    //constructor
    constructor(maSP:Int,tenSP:String, giaSP:Double)//3 đối số
    {
        this.maSP= maSP
        this.tenSp= tenSP
        this.giaSP=giaSP
    }

    constructor(maSP:Int,tenSP:String)//2 đối số
    {
        this.maSP= maSP
        this.tenSp= tenSP

    }

    constructor( giaSP:Double,maSP:Int,tenSP:String)//3 đối số
    {
        this.maSP= maSP
        this.tenSp= tenSP
        this.giaSP=giaSP
    }

    fun ChietKhau():Double
    {
        return this.giaSP*0.95//giảm 5%
    }

    // hàm viết cho ngày sinh nhật kh
    fun ChietKhau(sinhNhat:Boolean):Double
    {
        if(sinhNhat)
        return this.giaSP*0.9//giảm 5%
        else
            return this.giaSP*0.95
    }
}