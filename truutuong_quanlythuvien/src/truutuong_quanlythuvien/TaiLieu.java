package truutuong_quanlythuvien;

public abstract class TaiLieu {
	public TaiLieu() {
		super();
	}

	public TaiLieu(String maTL, String tenTL, String tacGia) {
		super();
		this.maTL = maTL;
		this.tenTL = tenTL;
		this.tacGia = tacGia;
	}

	protected String maTL, tenTL, tacGia;

	public String getMaTL() {
		return maTL;
	}

	public void setMaTL(String maTL) {
		this.maTL = maTL;
	}

	public String getTenTL() {
		return tenTL;
	}

	public void setTenTL(String tenTL) {
		this.tenTL = tenTL;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	
}
