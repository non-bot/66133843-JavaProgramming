package nqtien.ptgt;

import java.math.BigDecimal;

public class XeMay extends PhuongTien {
	
	double dungTichXiLanh;
	String loaiXe;
	public double getDungTichXiLanh() {
		return dungTichXiLanh;
	}
	public void setDungTichXiLanh(double dungTichXiLanh) {
		this.dungTichXiLanh = dungTichXiLanh;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public XeMay(String hSX, int nSX, BigDecimal giaBan, String loaiXe, double dungTichXiLanh) {
		super(hSX, nSX, giaBan);
		this.loaiXe = loaiXe;
		this.dungTichXiLanh = dungTichXiLanh;		
		// TODO Auto-generated constructor stub
	}
	@Override
	public int layVanTocToiDa() {
		// TODO Auto-generated method stub
		return 120;
	}
	@Override
	public int laySoChoNgoi() {
		// TODO Auto-generated method stub
		return 2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: dung tich xi lanh: %f", loaiXe, dungTichXiLanh) + super.toString();
	}
}
