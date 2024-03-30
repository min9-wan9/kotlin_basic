class Ong {
    var a=1
    inner class Bo{
        fun Ham()
        {
            println(a)
            println("Đây là hàm của class bố")
        }
    }
    // Hàm của class ông
    fun Ham()
    {
        println(a)// truy xuất được
    }
}