// Họ tên: Lê Hoàng Lộc - MSSV: 25810063

fun main() {

    val danhSachSach = mutableListOf("Dế Mèn Phiêu Lưu Ký", "Cho Tôi Xin Một Vé Đi Tuổi Thơ", "Kính Vạn Hoa", "Mắt Biếc", "Số Đỏ")

    println("Danh sách ban đầu:")
    println(danhSachSach)

    danhSachSach.add("Nhà Giả Kim")
    danhSachSach.add("Đắc Nhân Tâm")


    danhSachSach.remove("Số Đỏ")

    danhSachSach.sort()

    println("\nDanh sách sau khi thêm, xóa và sắp xếp:")
    println(danhSachSach)
}