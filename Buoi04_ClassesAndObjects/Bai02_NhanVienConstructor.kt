// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

class NhanVien(maNhanVien: String, val ten: String, var luongThang: Double) {
    constructor(ten: String) : this("TAM", ten, 0.0)
}

fun main() {

    val nv1 = NhanVien("NV001", "Le Hoang Loc", 12000000.0)
    val nv2 = NhanVien("Tran Quoc Kiet")

    println("NhanVien 1: Ten = ${nv1.ten}, Luong = ${nv1.luongThang.toLong()}")
    println("NhanVien 2: Ten = ${nv2.ten}, Luong = ${nv2.luongThang.toLong()}")
}