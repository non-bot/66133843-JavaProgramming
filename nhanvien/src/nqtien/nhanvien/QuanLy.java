package nqtien.nhanvien;

//Lớp con: Quản lý
public class QuanLy extends NhanVien {
 private double phuCapChucVu;
 private double heSoKinhNghiem;
 
 public QuanLy(String maNV, String hoTen, double luongCoBan,
              double phuCapChucVu, double heSoKinhNghiem) {
     super(maNV, hoTen, luongCoBan);
     this.phuCapChucVu = phuCapChucVu;
     this.heSoKinhNghiem = heSoKinhNghiem;
 }
 
 @Override
 public double tinhLuong() {
     return (luongCoBan * heSoKinhNghiem) + phuCapChucVu;
 }
 
 @Override
 public String toString() {
     super.toString();
     String s = "Phụ cấp chức vụ: " + phuCapChucVu;
     s = "Hệ số kinh nghiệm: " + heSoKinhNghiem;
     s = ("Tổng lương: " + this.tinhLuong());
     s = "Chức vụ: Quản lý";
     return s;
 }
 
 // Phương thức riêng của quản lý
 public void hopBanGiamDoc() {
     System.out.println(hoTen + " đang họp với ban giám đốc...");
 }
}