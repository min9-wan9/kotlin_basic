/*
bai19
viết chương trình kiểm tra tính hợp lệ của mật khẩu: nhập lại đến khi đúng
- mk chứa ít nhất 6 kt
- mk chứa ít nhất 1 chữ cái(hoa/thường)
- mk chứa ít nhất 1 chữ số
2. cho người dùng nhập lại mk login/ so sánh, nếu đúng mở của, sai quá 5 lần
khóa đăng nhập, thoát chương trình
 */
fun lamLai(){
    var s:String ?
    while(true){
        println("Nhap mat khau: ")
        s= readLine()
        if(s==null) return
        var leng= s.length
        var so=0
        var kt=0
        if(leng<6){
            println("Mk ko hơp le, phải có ít nhất 6 kí tự")
        }else {
            for(i in s){
                if(i.isDigit())so++
                else if(i.isLetter())kt++
            }
            if(so*kt==0){
                println("Mk phải chứa ít nhất 1 chữ cái , 1 chữ số")
            }else{
                println("Mật khẩu hợp lệ")
                break
            }

        }

    }
    var dem=1
    while(true){
       println("Login tài khoảng lần thứ $dem")
       var login:String ?= readLine()
        if(login== null) return

        if(login== s){
            println("Đăng nhập thành công")
            break
        }else dem++
        if(dem>5){
            println("Bạn đã nhập sai 5 lần, khóa đăng nhập")
            break
        }

    }
}
fun check() : String? {
    var s:String ?
    while (true)
    {
        println("Nhập mk: ")
         s=readLine()
        if(s==null) continue
        var leng=s.length
        var kt=0
        var digit=0
        var arr=s.toCharArray()
        for(i in arr){
            if(i.isDigit())
                digit++
            else if(i.isLetter())
                kt++
        }
        if(leng>=6 && kt>=1 && digit>=1){
            println("Mật khẩu hợp lệ")
            break
        }


        else
            println("Mật khẩu không hợp lệ")

    }

    return s
}


fun main(args: Array<String>) {
    lamLai()
    var mk= check()
    var dem=1;
    while(true){
        println("Nhập mk : , lần thứ $dem")
        var login:String ?= readLine()

        if(dem==5){
            println("Bạn đã nhập sai 5 lần, khóa đăng nhập")
            break
        }
        if(login == mk){
            println("bạn đã nhập mk thành công")
            break
        }else dem++

    }

}