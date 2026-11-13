// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

data class SinhVien(val mssv: String, val hoTen: String, val diemTrungBinh: Double)

fun main() {

    val sv1 = SinhVien("25810063", "Le Hoang Loc", 8.5)
    val sv2 = SinhVien("25810063", "Le Hoang Loc", 8.5)


    println("Object sv1: $sv1")


    println("sv1 == sv2: ${sv1 == sv2}")


    val sv3 = sv1.copy(diemTrungBinh = 9.2)
    println("Object sv3 (sau khi copy va doi diem): $sv3")
    println("Kiem tra mssv va hoTen duoc giu nguyen: MSSV = ${sv3.mssv}, HoTen = ${sv3.hoTen}")
}