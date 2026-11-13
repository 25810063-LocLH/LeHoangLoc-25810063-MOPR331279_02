// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

class TaiKhoanNganHang(val soTaiKhoan: String, val soDuBanDau: Double) {
    var soDu: Double = soDuBanDau

    init {
        if (soDuBanDau < 0.0) {
            println("So du khong hop le")
        } else {
            println("Tao tai khoan thanh cong! So du ban dau: $soDuBanDau")
        }
    }
}

fun main() {
    println("--- Tao tai khoan 1 (Hop le) ---")
    val tk1 = TaiKhoanNganHang("STK001", 1500000.0)

    println("\n--- Tao tai khoan 2 (Khong hop le) ---")
    val tk2 = TaiKhoanNganHang("STK002", -500000.0)
}