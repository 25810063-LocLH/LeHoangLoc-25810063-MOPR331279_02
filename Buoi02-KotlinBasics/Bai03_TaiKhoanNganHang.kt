// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

fun main() {
    //val cho số dư ban đầu để luôn luôn là số này
    val soDuBanDau = 5000000.0
    // var dùng cho số dư hiện tại vì số dư hiện tại luôn thay đổi
    var soDuHienTai = soDuBanDau

    soDuHienTai += 2000000.0
    println("Sau khi gửi thêm 2.000.000đ, số dư hiện tại là: $soDuHienTai VNĐ")

    soDuHienTai -= 1500000.0
    println("Sau khi rút 1.500.000đ, số dư hiện tại là: $soDuHienTai VNĐ")

    println("Số dư ban đầu đối chiếu: $soDuBanDau VNĐ")
}