import java.util.Date

class Tuoi2 {
    private var namSinh:Date
        public var NamSinh:Date
        get() {
            return namSinh
        }
        set(value) {namSinh= value}

    constructor(namSinh:Date)
    {
        this.namSinh= namSinh
    }
}