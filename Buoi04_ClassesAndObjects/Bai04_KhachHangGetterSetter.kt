// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

class KhachHang(var ho: String, var ten: String) {
    var hoTen: String
        get() = "$ho $ten"
        set(value) {
            val parts = value.trim().split("\\s+".toRegex())
            if (parts.size >= 2) {
                ho = parts.subList(0, parts.size - 1).joinToString(" ")
                ten = parts.last()
            } else if (parts.size == 1) {
                ho = ""
                ten = parts[0]
            }
        }
}

fun main() {
    val kh = KhachHang("Le Hoang", "Loc")
    println("Ban dau - Ho Ten: ${kh.hoTen}")

    kh.ten = "Kiet"
    println("Sau khi doi ten thanh Kiet - Ho Ten: ${kh.hoTen}")

    kh.hoTen = "Nguyen Van Sy"
    println("Sau khi gan ho ten moi 'Nguyen Van Sy':")
    println("Ho: '${kh.ho}', Ten: '${kh.ten}'")
}