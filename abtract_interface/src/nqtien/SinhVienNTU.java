package nqtien;

public class SinhVienNTU {
	private String hoVaTen;

	private String lop;

	public SinhVienNTU(String hoVaTen, String lop) {

	super();

	this.hoVaTen = hoVaTen;

	this.lop = lop;

	}

	public static String TEN_TRUONG="NHA TRANG UNIVERSITY";

	public static void sayHi() {

	System.out.println("Hi, I'm an NTU Student");

	}

	public void sayHello() {

	System.out.println("HELLO00000, I'm an NTU Student: \nTên là" + hoVaTen + "\nLớp" + lop);

	}

	// getter, setter,
}
