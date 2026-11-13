// Họ tên: Lê Hoàng Lộc - MSSV: 25810063
interface CoTheTinhDienTich {
    fun tinhDienTich(): Double
}

class HinhVuong(val canh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return canh * canh
    }
}

class HinhTron(val banKinh: Double) : CoTheTinhDienTich {
    override fun tinhDienTich(): Double {
        return Math.PI * banKinh * banKinh
    }
}

fun main() {
    val hinhV = HinhVuong(4.0)
    val hinhT = HinhTron(3.0)

    println("Dien tich hinh vuong (canh 4.0): ${hinhV.tinhDienTich()}")
    println("Dien tich hinh tron (ban kinh 3.0): ${hinhT.tinhDienTich()}")
}