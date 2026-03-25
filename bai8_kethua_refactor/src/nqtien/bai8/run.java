package nqtien.bai8;

public class run {
	public static void main(String[] args) {
		HinhChuNhat hCN = new HinhChuNhat("hcn1", "cyan", 3,4);
		HinhTron hT = new HinhTron("ht1", "blue", 3);
		System.out.println("Dien tich hinh " + hCN.hienThiThongTin() + ": " + hCN.tinhDienTich());
		System.out.println("Dien tich hinh " + hT.hienThiThongTin() + ": " + hT.tinhDienTich());
	}
	
	
}
