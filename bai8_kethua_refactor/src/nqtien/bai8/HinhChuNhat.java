package nqtien.bai8;

public class HinhChuNhat extends HinhHoc {
	private float chieuDai, chieuRong;
	
	public float getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}

	public float getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		super();
		chieuDai = 0;
		chieuRong = 0;
	}

	public HinhChuNhat(String ten, String mauSac, float chieuDai, float chieuRong) {
		super(ten, mauSac);
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return (chieuDai+chieuRong)*2;
	}
	public String hienThiThongTin() {
		return super.hienThiThongTin() + String.format(", [chieu dai: %.2f], [chieu rong: %.2f] ", chieuDai, chieuRong);
	}
}
