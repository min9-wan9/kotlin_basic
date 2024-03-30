class HocParamater {
    fun TinhTong(vararg dsSo:Int):Int
    {
        var tong=0
        for(so in dsSo)
        {
            tong+=so

        }
        return tong
    }
}