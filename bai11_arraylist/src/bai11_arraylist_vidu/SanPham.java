package bai11_arraylist_vidu;

public class SanPham {
	private String maSP, tenSP;
	private int soLuong;
	private double gia;

	public SanPham() {
		maSP = "";
		tenSP = "";
		gia = 1000;
		soLuong = 0;
	}

	public SanPham(String maSP, String tenSP, double gia, int soLuong) {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.soLuong = soLuong;
	}

	public String getMaSP() {
		return maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public double getGia() {
		return gia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setMaSP(String maSP) {
		if (maSP != null && !maSP.isEmpty())
			this.maSP = maSP;
	}

	public void setTenSP(String tenSP) {
		if (maSP != null && !maSP.isEmpty())
			this.tenSP = tenSP;
	}

	public void setGia(double d) {
		if (d > 0)
			this.gia = d;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong >= 0)
			this.soLuong = soLuong;
	}

	public void setSanPham(String maSP, String tenSP, double gia, int soLuong) {
		if (maSP != null && !maSP.isEmpty())
			this.maSP = maSP;
		if (maSP != null && !maSP.isEmpty())
			this.tenSP = tenSP;
		if (gia > 0)
			this.gia = gia;
		if (soLuong >= 0)
			this.soLuong = soLuong;
	}

	public double tinhThanhTien() {
		return gia * soLuong;
	}

	public String hienThiThongTin() {
		return String.format("\nMaSP: %s, ten SP: %s, gia: %f, so luong: %d\n", maSP, tenSP, gia, soLuong);
	}
}
