// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

fun main() {
    var a = 0
    var b = 1
    var index = 0

    println("Dãy số Fibonacci nhỏ hơn 100:")
    while (a < 100) {
        println("Vị trí $index: $a")
        val next = a + b
        a = b
        b = next
        index++
    }
}