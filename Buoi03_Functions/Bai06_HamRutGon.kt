// Họ và tên: Lê Hoàng Lộc - MSSV: 25810063

fun binhPhuongDayDu(n: Int): Int {
    return n * n
}
fun binhPhuongRutGon(n: Int): Int = n * n

fun chuViHinhVuongDayDu(canh: Double): Double {
    return canh * 4
}
fun chuViHinhVuongRutGon(canh: Double): Double = canh * 4

fun laSoChanDayDu(n: Int): Boolean {
    return n % 2 == 0
}
fun laSoChanRutGon(n: Int): Boolean = n % 2 == 0

fun main() {
    println("Bình phương (Đầy đủ vs Rút gọn): ${binhPhuongDayDu(5)} vs ${binhPhuongRutGon(5)}")
    println("Chu vi HV (Đầy đủ vs Rút gọn): ${chuViHinhVuongDayDu(4.5)} vs ${chuViHinhVuongRutGon(4.5)}")
    println("Kiểm tra số chẵn (Đầy đủ vs Rút gọn): ${laSoChanDayDu(8)} vs ${laSoChanRutGon(8)}")
}