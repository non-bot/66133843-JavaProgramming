package nqtien.bai8;

public class HinhHoc {
	private String ten, mauSac;
	public float tinhDienTich(float dai, float rong) {
		return dai*rong;
	}
	
	public float tinhChuVi(float dai, float rong) {
		return (dai+rong)/2;
	}
	
	public String hienThiThongTin() {
		return String.format("%s[mau=%s]", ten, mauSac);
	}
}
