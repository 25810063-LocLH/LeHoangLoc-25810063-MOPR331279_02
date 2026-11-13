// Họ tên: Lê Hoàng Lộc - MSSV: 25810063
class TaiKhoanNganHang(val soTaiKhoan: String, soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    fun napTien(soTien: Double) {
        if (soTien > 0) {
            soDu += soTien
            println("Nap thanh cong $soTien. So du hien tại: $soDu")
        } else {
            println("So tien nap khong hop le!")
        }
    }

    fun rutTien(soTien: Double): Boolean {
        if (soTien > 0 && soDu >= soTien) {
            soDu -= soTien
            println("Rut thanh cong $soTien. So du hien tai: $soDu")
            return true
        } else {
            println("Rut tien that bai! So du khong du hoac so tien khong hop le.")
            return false
        }
    }
}
fun main() {
    val tk = TaiKhoanNganHang("STK999", 2000000.0)
    println("So du ban dau: ${tk.soDu}")

    tk.napTien(500000.0)
    tk.rutTien(1000000.0)
    tk.rutTien(2000000.0)
}