// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

fun main() {
    val canNang = 75.0
    val chieuCao = 1.73

    val bmi = canNang / (chieuCao * chieuCao)

    val phanLoai: String
    if (bmi < 18.5) {
        phanLoai = "Gầy"
    } else if (bmi < 25.0) {
        phanLoai = "Bình thường"
    } else if (bmi < 30.0) {
        phanLoai = "Thừa cân"
    } else {
        phanLoai = "Béo phì"
    }

    println("Chỉ số BMI của bạn là: %.2f".format(bmi))
    println("Phân loại: $phanLoai")
}