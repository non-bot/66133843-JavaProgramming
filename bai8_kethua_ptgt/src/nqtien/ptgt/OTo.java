package nqtien.ptgt;

import java.math.BigDecimal;

public class OTo extends PhuongTien {
	int soCho;
	String kieuDongCo, loaiXe;
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getSoCho() {
		return soCho;
	}
	public void setSoCho(int soCho) {
		this.soCho = soCho;
	}
	public String getKieuDongCo() {
		return kieuDongCo;
	}
	public void setKieuDongCo(String kieuDongCo) {
		this.kieuDongCo = kieuDongCo;
	}
	public OTo(String hSX, int nSX, BigDecimal giaBan, int soCho, String kieuDongCo) {
		super(hSX, nSX, giaBan);
		this.soCho = soCho;
		if (kieuDongCo == "xang" || kieuDongCo == "dau" || kieuDongCo =="dien" )
			this.kieuDongCo = kieuDongCo;
		else
			this.kieuDongCo = "unknown";
	}
	@Override
	public int layVanTocToiDa() {
		// TODO Auto-generated method stub
		return 180;
	}
	@Override
	public int laySoChoNgoi() {
		// TODO Auto-generated method stub
		return soCho;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s: kieu dong co: %s, so cho: %d", loaiXe, kieuDongCo, soCho)+super.toString();
	}
	
}
