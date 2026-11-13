// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

class SanPham(val tenSanPham: String, val gia: Double, val soLuongTonKho: Int = 0)

fun main() {

    val sp1 = SanPham("Laptop Gaming", 25000000.0, 10)
    val sp2 = SanPham(tenSanPham = "Chuot Khong Day", gia = 500000.0)
    println("SanPham 1: Ten = ${sp1.tenSanPham}, Gia = ${sp1.gia.toLong()}, Ton Kho = ${sp1.soLuongTonKho}")
    println("SanPham 2: Ten = ${sp2.tenSanPham}, Gia = ${sp2.gia.toLong()}, Ton Kho = ${sp2.soLuongTonKho}")
}