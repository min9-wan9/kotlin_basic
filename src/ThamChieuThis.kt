class ThamChieuThis {
    //instance var
    var diemVan:Float =0f
    var diemToan :Float = 0f

    fun TestCucBo(diemVan:Float, diemToan :Float)
    {
        println("tổng biến cục bộ: "+(diemToan+diemVan))
        println("tổng biến instance var: "+(this.diemToan+this.diemVan))
        this.diemVan= diemVan
        this.diemToan= diemToan

    }
}