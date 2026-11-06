// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

fun main() {

    var count = 10
    println("--- Đếm ngược bằng while ---")
    while (count >= 1) {
        println("Số: $count")
        count--
    }


    println("\n--- In thông điệp cố định bằng repeat ---")
    repeat(5) { index ->
        println("Đây là dòng thông báo lần thứ ${index + 1}")
    }
}