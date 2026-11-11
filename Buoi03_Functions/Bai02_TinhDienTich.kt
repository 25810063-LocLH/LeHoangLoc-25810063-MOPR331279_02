// Họ và tên: Lê Hoàng Lộc - MSSV: 25810063

fun tinhDienTich(chieuDai: Double, chieuRong: Double): Double {
    return chieuDai * chieuRong
}

fun main() {
    val dt1 = tinhDienTich(5.5, 4.0)
    val dt2 = tinhDienTich(10.0, 3.2)

    println("Diện tích 1: $dt1")
    println("Diện tích 2: $dt2")
}