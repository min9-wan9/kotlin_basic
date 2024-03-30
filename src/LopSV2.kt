class LopSV2 {
    var ma:Int=0
    var ten:String = ""
    //khai báo private
    private var diemToan:Float =0f
    //khai báo  properties
    var DiemToan:Float
        get() {return diemToan}
        set(value) {diemToan = value}

    private var diemVan:Float =0f
    // khai báo property
    var DiemVan:Float
        get() {return  diemVan}
        set(value){diemVan=value}


    // khai báo contructor
    constructor()
    {
        ma=0
        ten="no name"
    }
    // cons 2 đối số
    constructor(m:Int,t:String)
    {
        ma=m
        ten = t
    }

    //1. hàm tính điểm tb có return
    fun dtb(diemToan:Float, diemVan:Float):Float
    {
        return (diemVan+diemToan)/2
    }
    //2. hàm xuất thông tin sv 0 có return
    fun xuatThongTin()
    {
        println("Tên sinh viên: $ten")
        println("Mã sv: $ma")
    }

    //3. toString
    override fun toString(): String {
        return "mã sinh viên $ma, tên sv: $ten"
    }
}