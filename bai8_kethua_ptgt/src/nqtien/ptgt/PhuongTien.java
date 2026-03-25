package nqtien.ptgt;

import java.math.BigDecimal;

public class PhuongTien {
	String hSX;
	int nSX;
	BigDecimal giaBan;
	public String gethSX() {
		return hSX;
	}
	public void sethSX(String hSX) {
		this.hSX = hSX;
	}
	public int getnSX() {
		return nSX;
	}
	public void setnSX(int nSX) {
		this.nSX = nSX;
	}
	public BigDecimal getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(BigDecimal giaBan) {
		this.giaBan = giaBan;
	}
	public PhuongTien(String hSX, int nSX, BigDecimal giaBan) {
		this.hSX = hSX;
		this.nSX = nSX;
		this.giaBan = giaBan;
	}
	public int layVanTocToiDa() {
		return 0;
	}
	public int laySoChoNgoi() {
		return 0;
	}
	@Override
	public String toString() {
		return String.format("hsx: %s, nsx: %d, gia ban: %.2f", hSX, nSX, giaBan.doubleValue());
	}
}
