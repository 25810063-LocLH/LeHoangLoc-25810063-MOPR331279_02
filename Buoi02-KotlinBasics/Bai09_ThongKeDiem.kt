// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

fun main() {
    val diemSinhVien = arrayOf(7.5, 8.0, 4.5, 9.2, 6.0, 5.5, 10.0, 3.5, 7.0, 8.5)

    var tongDiem = 0.0
    var diemCaoNhat = diemSinhVien[0]
    var diemThapNhat = diemSinhVien[0]

    for (diem in diemSinhVien) {
        tongDiem += diem
        if (diem > diemCaoNhat) {
            diemCaoNhat = diem
        }
        if (diem < diemThapNhat) {
            diemThapNhat = diem
        }
    }

    val diemTrungBinh = tongDiem / diemSinhVien.size

    println("Điểm trung bình của lớp: %.2f".format(diemTrungBinh))
    println("Điểm cao nhất: $diemCaoNhat")
    println("Điểm thấp nhất: $diemThapNhat")
}