package nqtien.bai8;

public class HinhTron extends HinhHoc {
	private float r;

	public HinhTron(String ten, String mauSac, float r) {
		super(ten, mauSac);
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return r*r*(Math.PI);
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return 2*Math.PI*r;
	}

	@Override
	public String hienThiThongTin() {
		// TODO Auto-generated method stub
		return super.hienThiThongTin() + String.format(", [ban kinh: %.2f]", r);
	}
	
}
