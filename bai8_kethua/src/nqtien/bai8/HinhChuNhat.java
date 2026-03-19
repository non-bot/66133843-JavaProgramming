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

	public HinhChuNhat(float chieuDai, float chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	@Override
	public float tinhDienTich(float dai, float rong) {
		// TODO Auto-generated method stub
		return dai*rong;
	}

	@Override
	public float tinhChuVi(float dai, float rong) {
		// TODO Auto-generated method stub
		return (dai+rong)*2;
	}
	
}
