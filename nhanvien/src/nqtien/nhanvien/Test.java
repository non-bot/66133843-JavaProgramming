package nqtien.nhanvien;

public class Test {

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("001","Mai Cường Thọ",2300000);
		System.out.println(nv1.toString());
		
		NhanVienVanPhong nvVP1 = new NhanVienVanPhong("002","Trần Thị Tươi",6700000,3,200000);
		System.out.println(nvVP1.toString());
	}

}