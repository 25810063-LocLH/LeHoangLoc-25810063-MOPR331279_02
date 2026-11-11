// Họ và tên: Lê Hoàng Lộc - MSSV: 25810063

fun datBan(tenKhachHang: String, soLuongKhach: Int, loaiBan: String = "Bàn thường") {
    println("Đặt bàn thành công cho $tenKhachHang - Số lượng: $soLuongKhach người - Loại bàn: $loaiBan")
}

fun main() {

    datBan("Nguyễn Văn A", 4)

    datBan("Trần Thị B", 2, "Bàn VIP")

    datBan(loaiBan = "Bàn ngoài trời", tenKhachHang = "Lê Văn C", soLuongKhach = 6)
}