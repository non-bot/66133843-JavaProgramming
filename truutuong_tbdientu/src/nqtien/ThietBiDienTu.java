package nqtien;

public abstract class ThietBiDienTu {
	private String ten, hangSanXuat;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getHangSanXuat() {
		return hangSanXuat;
	}
	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	private double gia;
	
	public String hienThiThongTin() {
		return "ThietBiDienTu [ten=" + ten + ", hangSanXuat=" + hangSanXuat + ", gia=" + gia + "]";
	}
	public abstract void bat();
	public abstract void tat();
}
