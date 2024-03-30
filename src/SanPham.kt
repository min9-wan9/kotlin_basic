class SanPham {
    constructor()// không đối số
    {
        println("Đây là contructor không đối số")
    }
    constructor(ma:Int,ten:String,donGia:Int)
    {
        println("đây là contructor 3 đối số")
        println("$ma - $ten - $donGia")
    }
}