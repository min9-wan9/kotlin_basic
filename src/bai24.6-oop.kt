fun main(args: Array<String>) {
    Ong().Bo().Ham()//gọi hàm nằm trong class bố
    Ong().Ham()//Hàm nằm trong class ông

    //() là đối tuong
    // ko co là class
    //
    println("-------------")
    println(BangPhai.caiBang.ordinal)
    println(BangPhai.ngaMi.ordinal)

    var ds= BangPhai.values()
    //in danh sách phần tử
    ds.forEach { println(it) }

    // khởi tạo đối tượng thuộc class BangPhai
    var a:BangPhai =BangPhai.ngaMi
    when(a)
    {
        BangPhai.ngaMi -> println("Bạn thuộc phái nga mi")
        BangPhai.conLon -> println("Bạn thuộc phái con lon")
        BangPhai.thieuLam -> println("Bạn thuộc phái thieu lam")
        BangPhai.caiBang -> println("Bạn thuộc phái cai bang")
    }

    println(BangPhai.ngaMi.gioiTinh)
    println(BangPhai.conLon.gioiTinh)

    println(BangPhai.ngaMi.sucMang)
    println(BangPhai.conLon.sucMang)

}