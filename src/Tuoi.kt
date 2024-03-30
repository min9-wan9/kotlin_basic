class Tuoi {
    // khai  báo năm sinh
    private var namSinh:Int =0
    // khi báo property
    var NamSinh: Int
        get() {return namSinh}
        set(value) {namSinh= value}

    // khai báo constructor
    constructor(y : Int)
    {
        namSinh = y
    }

    // support method
    private fun checkTuoi():Boolean
    {
        var tuoi = 2024-namSinh
        return tuoi>=18
    }

    //service method
    fun kiemTra()
    {
        if(checkTuoi())
        {
            println("Mời đặt vé ....")
        }
        else
        {
            println("Bạn không đủ tuổi xem này, vui lòng chọn phim khác")
        }
    }

}