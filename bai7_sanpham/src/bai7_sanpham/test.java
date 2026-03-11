package bai7_sanpham;

public class test{
	public static void main() {
		SanPham a = new SanPham();
		System.out.print(a.hienThiThongTin());
		a.setSanPham("4869", "Laptop", 200000000, 1);
		System.out.print(a.hienThiThongTin());
	}
}