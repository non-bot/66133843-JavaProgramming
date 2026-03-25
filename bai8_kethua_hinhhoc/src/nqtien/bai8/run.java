package nqtien.bai8;

public class run {
	public static void main(String[] args) {
		HinhChuNhat hCN = new HinhChuNhat("hcn", "cyan", 3,4);
		HinhTron hT = new HinhTron("ht", "blue", 3);
		HinhTamGiac hTG = new HinhTamGiac("htg", "orange", 3,4,5);
		System.out.println("Dien tich hinh " + hCN.hienThiThongTin() + ": " + hCN.tinhDienTich());
		System.out.printf("Dien tich hinh " + hT.hienThiThongTin() + ": %.2f\n	", hT.tinhDienTich());
		System.out.println("Dien tich hinh " + hTG.hienThiThongTin() + ": " + hTG.tinhDienTich());
	}
	
	
}
