package bai11_arraylist_vidu;

public class SanPham {
	private String maSP, tenSP;
	private int gia, soLuong;

	public SanPham() {
		maSP = "";
		tenSP = "";
		gia = 1000;
		soLuong = 0;
	}

	public SanPham(String maSP, String tenSP, int gia, int soLuong) {
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

	public int getGia() {
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

	public void setGia(int gia) {
		if (gia > 0)
			this.gia = gia;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong >= 0)
			this.soLuong = soLuong;
	}

	public void setSanPham(String maSP, String tenSP, int gia, int soLuong) {
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
		return String.format("MaSP: %s, ten SP: %s\n Gia: %d, so luong: %d", maSP, tenSP, gia, soLuong);
	}
}
