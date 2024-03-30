import java.util.Date

class SV {
    private var namSinh:Date?
    // khai báo property
    public var NamSinh:Date?
        get() {return namSinh}
        set(value) {namSinh= value}
    constructor(namSinh: Date?)
    {
        this.namSinh= namSinh
    }

}