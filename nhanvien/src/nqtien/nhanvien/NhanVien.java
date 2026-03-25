package nqtien.nhanvien;

public class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected double luongCoBan;
    
    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    public double tinhLuong() {
        return luongCoBan;
    }
    @Override
    public String toString() {
    	 return "Mã NV: " + maNV +
    	           ", Họ tên: " + hoTen +
    	           ", Lương cơ bản: " + luongCoBan;
    }
}
