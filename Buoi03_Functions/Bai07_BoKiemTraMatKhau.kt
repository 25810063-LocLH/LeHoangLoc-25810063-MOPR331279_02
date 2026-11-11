// Họ và tên: Lê Hoàng Lộc - MSSV: 25810063

fun kiemTraDoDai(matKhau: String): Boolean {
    return matKhau.length >= 8
}

val kiemTraDoDaiLambda: (String) -> Boolean = { matKhau ->
    matKhau.length >= 8
}

fun main() {
    val mk1 = "123456"
    val mk2 = "kotlin123"
    val mk3 = "pass"

    println("--- Kiểm tra bằng fun ---")
    println("$mk1 : ${kiemTraDoDai(mk1)}")
    println("$mk2 : ${kiemTraDoDai(mk2)}")
    println("$mk3 : ${kiemTraDoDai(mk3)}")

    println("--- Kiểm tra bằng Lambda ---")
    println("$mk1 : ${kiemTraDoDaiLambda(mk1)}")
    println("$mk2 : ${kiemTraDoDaiLambda(mk2)}")
    println("$mk3 : ${kiemTraDoDaiLambda(mk3)}")
}