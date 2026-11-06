// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

fun xuLyTen(ten: String?) {

    val doDai = ten?.length
    println("Độ dài tên (Safe call): $doDai")


    val tenHienThi = ten ?: "Khách vãng lai"
    println("Tên hiển thị (Elvis operator): $tenHienThi")


    try {
        val doDaiBatBuoc = ten!!.length
        println("Độ dài bắt buộc (Toán tử !!): $doDaiBatBuoc")
    } catch (e: Exception) {
        println("Lỗi khi dùng toán tử !! do biến chứa giá trị null: ${e.message}")
    }
    println("--------------------------------------------------")
}

fun main() {
    println("--- THƯỜNG HỢP 1: Tên có giá trị ---")
    xuLyTen("Nguyễn Văn A")

    println("\n--- TRƯỜNG HỢP 2: Tên bị null ---")
    xuLyTen(null)
}