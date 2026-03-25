package nqtien.bai8;

public class HinhTamGiac extends HinhHoc{
	private double canhA, canhB, canhC;

	public double getCanhA() {
		return canhA;
	}

	public void setCanhA(double canhA) {
		this.canhA = canhA;
	}

	public double getCanhB() {
		return canhB;
	}

	public void setCanhB(double canhB) {
		this.canhB = canhB;
	}

	public double getCanhC() {
		return canhC;
	}

	public void setCanhC(double canhC) {
		this.canhC = canhC;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		var p = (canhA + canhB + canhC)/2;
		var s = Math.sqrt(p*(p-canhA)*(p-canhB)*(p-canhC));
		return s;
	}

	@Override
	public double tinhChuVi() {
		// TODO Auto-generated method stub
		return canhA+canhB+canhC;
	}

	@Override
	public String hienThiThongTin() {
		// TODO Auto-generated method stub
		return super.hienThiThongTin()+String.format(", [canh A: %.2f], [canh B: %.2f], [canh C: %.2f]", canhA, canhB, canhC);
	}

	public HinhTamGiac(String ten, String mauSac, float canhA, float canhB, float canhC) {
		super(ten, mauSac);
		this.canhA = canhA;
		this.canhB = canhB;
		this.canhC = canhC;
	}
	
}
