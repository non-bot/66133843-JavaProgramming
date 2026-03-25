package nqtien.nhanvien;

//Lớp con: Nhân viên văn phòng
public class NhanVienVanPhong extends NhanVien {
 private double soGioLamThem;
 private double luongThemMoiGio;
 
 public NhanVienVanPhong(String maNV, String hoTen, double luongCoBan,
                        double soGioLamThem, double luongThemMoiGio) {
     super(maNV, hoTen, luongCoBan);
     this.soGioLamThem = soGioLamThem;
     this.luongThemMoiGio = luongThemMoiGio;
 }
 
 // Ghi đè phương thức tính lương
 @Override
 public double tinhLuong() {
     return luongCoBan + (soGioLamThem * luongThemMoiGio);
 }
 
 @Override
 public String toString() {
     super.toString();
     String s = ("Số giờ làm thêm: " + soGioLamThem);
     s = ("Lương làm thêm/giờ: " + luongThemMoiGio);
     s = ("Tổng lương: " + this.tinhLuong());
     s = ("Chức vụ: Nhân viên văn phòng");
     return s;
 }
}
