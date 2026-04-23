package thigk2.NgoQuangTien66133843;

public class SinhVien {
	int mSSV;
	String hoVaTen;
	int namSinh;
	String noiSong;
	public int getmSSV() {
		return mSSV;
	}
	public void setmSSV(int mSSV) {
		this.mSSV = mSSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getnoiSong() {
		return noiSong;
	}
	public void setnoiSong(String noiSong) {
		this.noiSong = noiSong;
	}
	
	public SinhVien() {
		this.mSSV = 0;
		this.hoVaTen = "";
		this.namSinh = 0;
		this.noiSong = "";
	}
	public SinhVien(int mSSV, String hoVaTen, int namSinh, String noiSong) {
		this.mSSV = mSSV;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.noiSong = noiSong;
	}
	@Override
	public String toString() {
		return "SinhVien [mSSV=" + mSSV + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", noiSong=" + noiSong
				+ "]";
	}
	
}
