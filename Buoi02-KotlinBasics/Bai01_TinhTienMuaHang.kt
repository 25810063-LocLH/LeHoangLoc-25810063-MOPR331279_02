fun main() {
    val soLuong: Int = 5
    val donGia: Double = 120500.0

    val tienHang = soLuong.toDouble() * donGia
    val thue = tienHang * 0.08
    val tongTien = tienHang + thue

    println("Số lượng: $soLuong, Đơn giá: $donGia VNĐ")
    println("Tổng tiền cuối cùng (đã gồm 8% thuế): $tongTien VNĐ")
}