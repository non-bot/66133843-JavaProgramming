package nqtien;

public class run {
	public static void main(String[] args) {

		// in ra ten truong cua sinh vien NTU

		System.out.println(SinhVienNTU. TEN_TRUONG);

		// In ra Hi,

		SinhVienNTU.sayHi();

		SinhVienNTU sv1 = new SinhVienNTU("Mai Cuong Tho", "KHMT-13");

		SinhVienNTU sv2 = new SinhVienNTU("Pham Van Nam", "CNPT-15");

		sv1.sayHello();

		sv2.sayHello();

		}
}
