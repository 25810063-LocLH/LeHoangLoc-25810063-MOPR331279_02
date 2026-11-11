// Họ và tên: Lê Hoàng Lộc - MSSV: 25810063

fun main() {
    val tuoi = 60
    val loaiVe = if (tuoi < 12) {
        "Vé trẻ em"
    } else if (tuoi >= 60) {
        "Vé người lớn tuổi"
    } else {
        "Vé người lớn"
    }

    println("Loại vé: $loaiVe")
}