package NQTien.mssv66133843;

public class HocSinh {
	private String tenHS;
	private short tuoiHS;
	private String lopHS;
	
	public String getTenHS() {
		return tenHS;
	}

	public void setTenHS(String tenHS) {
		this.tenHS = tenHS;
	}

	public short getTuoiHS() {
		return tuoiHS;
	}

	public void setTuoiHS(short tuoiHS) {
		this.tuoiHS = tuoiHS;
	}

	public String getLopHS() {
		return lopHS;
	}

	public void setLopHS(String lopHS) {
		this.lopHS = lopHS;
	}

	public HocSinh() {
		
	}

	public HocSinh(String tenHS, short tuoiHS, String lopHS) {
		
		this.tenHS = tenHS;
		this.tuoiHS = tuoiHS;
		this.lopHS = lopHS;
	}

	@Override
	public String toString() {
		return "HocSinh [tenHS=" + tenHS + ", tuoiHS=" + tuoiHS + ", lopHS=" + lopHS + "]";
	}
	
}
