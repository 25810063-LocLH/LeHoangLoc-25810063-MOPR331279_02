// Họ và tên: Lê Hoàng Lộc - MSSV: 25810063

fun dinhDangDiaChi(
    soNha: String,
    tenDuong: String,
    phuongXa: String = "Phường Bến Nghé",
    quanHuyen: String = "Quận 1",
    thanhPho: String = "TP. Hồ Chí Minh"
): String {
    return "$soNha, Đường $tenDuong, $phuongXa, $quanHuyen, $thanhPho"
}

fun main() {
    val diaChi1 = dinhDangDiaChi("123", "Lê Duẩn", quanHuyen = "Quận 3")
    val diaChi2 = dinhDangDiaChi("456", "Võ Văn Ngân", phuongXa = "Linh Chiểu", thanhPho = "TP. Thủ Đức")

    println(diaChi1)
    println(diaChi2)
}