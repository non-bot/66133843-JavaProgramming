package nqtien.bai8;

public class HinhHoc {
	private String ten, mauSac;
	public HinhHoc() {
		// TODO Auto-generated constructor stub
	}

	public HinhHoc(String ten, String mauSac) {
		this.ten = ten;
		this.mauSac = mauSac;
	}

	public double tinhDienTich() {
		return 0;
	}
	
	public double tinhChuVi() {
		return 0;
	}
	
	public String hienThiThongTin() {
		return String.format("%s[mau: %s]", ten, mauSac);
	}
}
